// Reference anywhere below as ${someKey}
someKey = "someValue"

// Runs once before processing starts.
before {
    migration {
        changelog.groovy
    }
}

// The processing pipeline.
run {
    csvSource {
        inputFile = '/tmp/somefile.csv'
    }

    transformFilter {
        transform = { row ->

            // 'Double' each value.
            row.collectEntries { k, v ->
                [k, v * 2]
            }
        }
    }

    sqlSink {
        connection {
            url = "jdbc:postgresql://localhost:5432/database"
            username = 'user'
            password = 'password'

        }
        sql = "insert into my_table values (${row.somevalue}, ${row.anothervalue})"
    }
}

// Runs once after processing finishes.
after {
    emailNotify {
        to: [ 'someuser@email.com' ]
        body: [ 'finished yo!']
    }
}

// Failure?
