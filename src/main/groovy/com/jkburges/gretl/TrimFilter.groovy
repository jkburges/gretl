package com.jkburges.gretl

class TrimFilter {

    def output = {}

    def input = { row ->
        def filteredRow = row.collectEntries { k, v ->
            [k.trim(), v.trim()]
        }

        output(filteredRow)
    }
}
