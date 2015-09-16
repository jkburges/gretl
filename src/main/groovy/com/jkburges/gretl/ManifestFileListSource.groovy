package com.jkburges.gretl

class ManifestFileListSource {

    def addedModifiedOutput = {}
    def removedOutput = {}

    def manifestFilePath

    def start() {
        new File(manifestFilePath).readLines().grep { it }.each { fileToCheck ->
            new File(fileToCheck).exists() ? addedModifiedOutput(fileToCheck) : removedOutput(fileToCheck)
        }
    }
}
