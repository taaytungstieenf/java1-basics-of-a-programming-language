### Part 1. Creating a pom project
```
mvn archetype:generate -DgroupId=com.example \
                       -DartifactId=modulename \
                       -DarchetypeArtifactId=maven-archetype-quickstart \
                       -DinteractiveMode=false

mvn archetype:generate -DgroupId=com.example \
					   -DartifactId=myproject \
					   -DarchetypeArtifactId=maven-archetype-simple \
					   -DinteractiveMode=false \

```

### Part 2. Writing pom.xml

##### a. pom.xml of simple package
```
<project 	xmlns="http://maven.apache.org/POM/4.0.0" 
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>
  <artifactId>modulename</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>modulename</name>
  <url>http://maven.apache.org</url>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
                <archive>
                    <manifest>
                        <mainClass>com.example.App</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>
    </plugins>
  </build>

</project>

```

##### b. pom.xml of parent package
```
<?xml version="1.0" encoding="UTF-8"?>

<project  xmlns="http://maven.apache.org/POM/4.0.0" 
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>
  <artifactId>parentmodule</artifactId>
  <packaging>pom</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>parentmodule</name>
  <url>http://maven.apache.org</url>

  <modules>
    <module>childmodule1</module>
    <module>childmodule2</module>
    <module>childmodule3</module>
  </modules>
  
</project>

```

##### c. pom.xml of child package
```
<?xml version="1.0"?>
<project    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd" 
            xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>com.example</groupId>
    <artifactId>parentmodule</artifactId>
    <version>1.0-SNAPSHOT</version>
  </parent>

  <groupId>com.example</groupId>
  <artifactId>childmodule</artifactId>
  <version>1.0-SNAPSHOT</version>
  <name>childmodule</name>
  <url>http://maven.apache.org</url>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
                <archive>
                    <manifest>
                        <mainClass>com.example.App</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>
    </plugins>
  </build>

</project>

```

### Part 3. Compiling project

##### a. Method 1: Compile code to target/classes
```
mvn compile
java -cp target/classes com.example.App
```

##### b. Method 2: Run by jar
```
mvn package
java -jar target/modulename-1.0-SNAPSHOT.jar
```