##GRETL

An Extract-Transform-Load framework written in Groovy. 

## TODO
* pipeline specification DSL (see [examples](doc))
  * includes
* component groups, c.f. talend sub-jobs
* a standard set of components
  * sources/sinks
    * sql
    * netCDF
    * WFS
    * CSV
  * filters
    * buffer - decouple input/output
    * batch - batch commands, for efficiency, especially w.r.t. sql writing.
* test framework
  * unit
  * acceptance

## Standard Project Layout
Borrowing a bit from (g)rails...

```
<root>
 |
 +-- build.gradle
 +-- gradlew
 +-- conf
 |   |
 |   +-- Config.groovy
 |   +-- Job.groovy
 |   +-- SubJob.groovy
 |
 +-- migrations
 |   |
 |   +-- changelog.groovy  
 |
 +-- test
     |
     +-- unit
     |   |
     |   +-- SubJobTests.groovy
     |
     +-- integration
         |
         +-- JobTests.groovy
```
