package com.jkburges.gretl

class DoubleFilter {
    def output = {}

    def input = { row ->
        def filteredRow = row.collectEntries { k, v ->
            [k, v * 2]
        }

        output(filteredRow)
    }
}
