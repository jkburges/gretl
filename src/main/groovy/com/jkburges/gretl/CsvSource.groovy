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
            output(toMap(row))
        }
    }

    // Pilfered from https://github.com/xlson/groovycsv/blob/master/src/com/xlson/groovycsv/PropertyMapper.groovy#L70
    Map toMap(row) {
        def sortedKeys = row.columns.keySet().sort { row.columns[it] }
        [sortedKeys, row.values].transpose().collectEntries()
    }
}
