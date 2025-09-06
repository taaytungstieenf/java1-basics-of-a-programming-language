### Part 1. Project Structure
```
./dJAVA_project-management-with-maven
|
|______	src/
|		|______	main/
|		|		|______ java/
|		|				|______ com/
|		|						|______	example/
|		|								|______ App.java
|		|
|		|______ test/
|		|		|______ java/
|		|				|______ com/
|		|						|______	example/
|		|								|______ AppTest.java
|		|
|		|______ target/
|
|______ pom.xml
|______	README.md
```

### Part 2. Create Maven project
```
mvn archetype:generate -DgroupId=com.example \
                       -DartifactId=dJAVA_project-management-with-maven \
                       -DarchetypeArtifactId=maven-archetype-quickstart \
                       -DinteractiveMode=false


mvn archetype:generate -DgroupId=com.example \
                       -DartifactId=. \
                       -DarchetypeArtifactId=maven-archetype-quickstart \
                       -DinteractiveMode=false
```

### Part 3. Compile Project
```
mvn compile
java -cp target/classes com.example.App

mvn clean package
java -jar target/dJAVA_project-management-with-maven-1.0-SNAPSHOT.jar
```