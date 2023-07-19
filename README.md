# Extensible Java Selenium 4 Automation Framework

The purpose of this Framework is to serve as a functional demo and / or template to be used on projects and / or assist
with training. This framework attempts to showcase a type of simple boilerplate Selenium 4 framework.
Using [Wikipedia](https://www.wikipedia.org/) as our system under test.

## Description

The project consists of the following primary elements and technologies:

* [Selenium 4](https://www.selenium.dev/) Selenium is a suite of tools for automating web browsers. The latest major
  version at this time is 4.
* [JUnit 5](https://junit.org/junit5/) to support the test creation
* [AssertJ](https://assertj.github.io/doc/) fluent assertions for all test cases
* [Owner](https://github.com/matteobaccan/owner) to manage the property files

## Installation and Usage

### Required software

* Java JDK 20+
* Maven installed and in your classpath ([Installing Apache Maven](https://maven.apache.org/install.html))

### Installing

* Running a `mvn clean package` should be enough to get the project built and ready to use.
* If you wish to skip the running of all tests run: `mvn package -DskipTests`.

### Executing tests

* Right-click a test class file (example:`com/example/tests/LandingPageTests.java`) and select `Run`
  or `Debug`
* Or Run `mvn clean test`

### Project Structure Overview

* Base
  * Provides the generic base of the framework
* System Under Test ([SUT](https://en.wikipedia.org/wiki/System_under_test))
    * Pages (Page Objects)
    * Tests

### Authors

* Bernard Visagie

### License

MIT License

Copyright (c) 2023 - Bernard Visagie

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.