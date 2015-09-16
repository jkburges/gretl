package com.jkburges.gretl

class ManifestFileListHarness {
    static void main(String[] args) {
        def manifestFileListSource = new ManifestFileListSource(manifestFilePath: 'data/absolute_manifest')
        def addedModifiedSink = new StdoutSink(prefix: 'added/modified')
        def removedSink = new StdoutSink(prefix: 'removed')

        manifestFileListSource.addedModifiedOutput = addedModifiedSink.input
        manifestFileListSource.removedOutput = removedSink.input

        manifestFileListSource.start()
    }
}
