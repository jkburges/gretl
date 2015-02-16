/**
 * A more complex example, with named outputs to enable 1:many connections.
 */

run {
    csvSource {
        inputFile = '/tmp/somefile.csv'
    }

    transformFilter {
        transform = { row, index ->
            if (index % 2 == 0) {
                // Named output.
                output('even rows', row)
            }
            else {
                output('odd rows', row)
            }
        }
    }

    stdoutSink {
        id = 'even rows'
        message = { row ->
            "even row: ${row}"
        }
    }

    stdoutSink {
        id = 'odd rows'
        message = { row ->
            "odd row: ${row}"
        }
    }
}
