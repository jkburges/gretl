package com.jkburges.gretl

class Harness {
    static void main(String[] args) {
        def csvSource = new CsvSource()
        def trimFilter = new TrimFilter()
        def doubleFilter = new DoubleFilter()
        def stdoutSink = new StdoutSink()

        csvSource.output = trimFilter.input
        trimFilter.output = doubleFilter.input
        doubleFilter.output = stdoutSink.input

        csvSource.start()
    }
}
