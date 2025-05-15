# Scala-Hadoop-Hive-Spark-Maven example template
## Description
- This is a template is a Scala project for Hadoop, Hive and Spark using Maven.
- When using this template, make sure to change the `artifactId`, `groupId` and `name` in the pom.xml file to your own.
- Also make sure the change the directory structure inside `src/main/scala` to your own package structure.
- If you have a single main class for your built jar, you can set the `mainClass` tag in properties.
## Maven goals
### To build the jar
```bash
mvn clean install
```
### To format using spotless
```bash
mvn spotless:apply
```
### To lint using scalafix
```bash
mvn scalafix:scalafix
```
### To run the munit tests
```bash
mvn test
```
### To run the project
```bash
mvn scala:run
```
### To upgrade dependencies
```bash
mvn versions:display-dependency-updates
```
### To upgrade plugins
```bash
mvn versions:display-plugin-updates
```
## Maven properties
```xml
<properties>
  <!-- Set specific maven version for this project to build -->
  <enforce.mvn.version>3.9.9</enforce.mvn.version>
  <!-- Set specific jdk version for this project to build -->
  <enforce.jdk.version>17</enforce.jdk.version>
  <!-- Source java version for the maven compiler plugin -->
  <maven.compiler.source>8</maven.compiler.source>
  <!-- Target java version for the maven compiler plugin -->
  <maven.compiler.target>8</maven.compiler.target>
  <!-- Project build encoding format -->
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <!-- Scala version -->
  <scala.version>2.12.20</scala.version>
  <!-- Scala compat short version -->
  <scala.compat.version>2.12</scala.compat.version>
  <!-- Spark version -->
  <spark.version>3.5.5</spark.version>
  <!-- Hadoop version -->
  <hadoop.version>3.4.1</hadoop.version>
  <!-- Hive version -->
  <hive.version>4.0.1</hive.version>
  <!-- Main class of the jar to execute -->
  <mainClass>example.Hello</mainClass>
</properties>
```
## Notes
> [!IMPORTANT]
> Try to reuse the properties declared in various places in pom.xml by invoking in the following manner ``${your-property-tag-name}``.
> For example, to use `scala.compat.version` property invoke it in the following manner ``${scala.compat.version}``.

> [!TIP]
> You can enforce the java version and maven version by setting the properties `enforce.jdk.version` and `enforce.mvn.version` respectively.
> This will ensure that the project is built with the specified version of java and maven.
