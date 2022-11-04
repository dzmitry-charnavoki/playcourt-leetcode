[TOC]

# ti

# dev land

## checkstyle 

[checkstyle doc](https://checkstyle.sourceforge.io/)

* install plugin for IntelliJ Idea
* setup it as CodeFormatter: 
  * Settings -> Editor -> CodeStyle > Scheme -> Project
  * Settings -> Editor -> CodeStyle > Scheme -> Import Scheme -> Checkstyle Configuration

## useful cmds

How to check new versions
```cmd
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
mvn versions:use-latest-versions
mvn versions:display-property-updates
```

How to find a Maven dependency version declaration imported from a BOM
```
mvn org.apache.maven.plugins:maven-help-plugin:3.2.0:effective-pom -Dverbose=true -Doutput=effective-pom.xml
```