[TOC]

# ChangeLog for CheckStyle
 
## Log

### 01. Inventory

the file config/_custom_checks_.xml downloaded [here](https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml)
file renamed because changed 

### 02. Changed configuration

Commented or Changed next modules:
     mm/DD

#### 11/4 : LeftCurly & RightCurly

LeftCurly, RightCurly

#### 12/4 PackageName

old: `^[a-z]+(\.[a-z][a-z0-9]*)*$`
new: `^[a-z]+(\.[a-z]\_[a-z0-9]*)*$`

#### 01/09 Snoozed JavaDoc 

MissingJavadocType
MissingJavadocMethod
SummaryJavadoc

#### 01/15 allowedAbbreviationLength

allowedAbbreviationLength" value="0" -> allowedAbbreviationLength" value="1"

#### 04/13 allowedAbbreviationLength

allowedAbbreviationLength" value="1" -> allowedAbbreviationLength" value="3"

#### 06/14 LocalVariableName & MethodName

MethodName: ^[a-z][a-z0-9]\w*$ -> ^[a-z]?[a-z0-9]\w*$

LocalVariableName: ^[a-z]([a-z0-9][a-zA-Z0-9]*)?$ -> ^[a-z]?([a-z0-9][a-zA-Z0-9]*)?$