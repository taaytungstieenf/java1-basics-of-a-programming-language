### Part 1. Project Structure
```
./aJAVA_programming-environment
|
|______	bin/
|		|______	com/
|				|______	example/
|						|
|						|______	part1SequentiallyCompile
|						|		|______ ver1
|						|		|		|______ Main.class
|						|		|______ ver2
|						|				|______ Main.class
|						|
|						|______ part2SimultaneouslyCompile
|								|______ ver1
|								|		|______ Main.class
|								|______ ver2
|										|______ Main.class
|
|______	src/
|		|______	com/
|				|______	example/
|						|
|						|______	part1SequentiallyCompile
|						|		|______ ver1
|						|		|		|______ Main.java
|						|		|______ ver2
|						|				|______ Main.java
|						|
|						|______ part2SimultaneouslyCompile
|								|______ ver1
|								|		|______ Main.java
|								|______ ver2
|										|______ Main.java
|
|______	README.md
```

### Part 2. Compile Project

##### a. Sequentially Compile


Use	: $ javac -d bin -cp bin src/com/example/part1SequentiallyCompile/ver2/Main2.java  
Not : $ javac -d bin src/com/example/part1SequentiallyCompile/ver2/Main2.java


The place to put new .class file: <-d bin>  
Show javac the existed bin folder to use within Main1.class: <-cp bin>

```
Interpret   : $ javac -d bin src/com/example/part1SequentiallyCompile/ver1/Main1.java	
Run         : $ java -cp bin com.example.part1SequentiallyCompile.ver1.Main1

Interpret	: $ javac -d bin -cp bin src/com/example/part1SequentiallyCompile/ver2/Main2.java
Run 		: $	java -cp bin com.example.part1SequentiallyCompile.ver2.Main2
```
##### b. Simultaneously Complie

Compile all the .java files in need to use run the .class file

```
Interpret	: $ javac -d bin src/com/example/part2SimultaneouslyCompile/ver1/Main1.java src/com/example/part2SimultaneouslyCompile/ver2/Main2.java
Run 		: $ java -cp bin com.example.part2SimultaneouslyCompile.ver2.Main2
```