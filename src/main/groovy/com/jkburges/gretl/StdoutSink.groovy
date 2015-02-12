package com.jkburges.gretl

class StdoutSink {
    def input = { row ->
        println "stdout sink, row: ${row}"
    }
}
