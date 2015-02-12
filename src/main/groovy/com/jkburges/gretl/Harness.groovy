package com.jkburges.gretl

class Harness {
    static void main(String[] args) {
        def csvSource = new CsvSource()
        def stdoutSink = new StdoutSink()

        csvSource.output = stdoutSink.input

        csvSource.start()
    }
}
