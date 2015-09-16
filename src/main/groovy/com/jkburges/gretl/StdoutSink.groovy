package com.jkburges.gretl

class StdoutSink {
    def prefix

    def input = { row ->
        if (prefix) {
            print "$prefix "
        }
        println "stdout sink, row: ${row}"
    }
}
