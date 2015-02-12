package com.jkburges.gretl

import com.xlson.groovycsv.CsvParser

class CsvSource {

    def output = {}

    def start() {

        def reader = new StringReader(
            '''a, b, c
               1, 1, 1
               2, 2, 2'''
        )

        def csvFile = CsvParser.parseCsv(reader)

        csvFile.each { row ->
            output(row)
        }
    }
}
