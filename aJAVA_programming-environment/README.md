### 1. Project Structure

```
./aJAVA_programming-environment
|
|______	bin/
|		|______	com/
|				|______	example/
|						|______	part1SequentiallyCompile
|						|		|______ ver1
|						|		|		|______ Main.class
|						|		|______ ver2
|						|				|______ Main.class
|						|______ part2SimultaneouslyCompile
|								|______ ver1
|								|		|______ Main.class
|								|______ ver2
|										|______ Main.class
|
|______	src/
|		|______	com/
|				|______	example/
|						|______	part1SequentiallyCompile
|						|		|______ ver1
|						|		|		|______ Main.java
|						|		|______ ver2
|						|				|______ Main.java
|						|______ part2SimultaneouslyCompile
|								|______ ver1
|								|		|______ Main.java
|								|______ ver2
|										|______ Main.java
|
|______	README.md
```


### 2. Compile project

##### Part 1 - Sequentially Compile


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
##### Part 2 - Simultaneously Complie

Compile all the .java files in need to use run the .class file

```
Interpret	: $ javac -d bin src/com/example/part2SimultaneouslyCompile/ver1/Main1.java src/com/example/part2SimultaneouslyCompile/ver2/Main2.java
Run 		: $ java -cp bin com.example.part2SimultaneouslyCompile.ver2.Main2
```

### 3. Java Programming Language
Programming languages enable humans to write instructions that a computer can perform. With precise instructions, computers coordinate applications and systems that run the modern world.

Sun Microsystems released the Java programming language in 1995. Java is known for being simple, portable, secure, and robust. Though it was released over twenty years ago, Java remains one of the most popular programming languages today.

One reason people love Java is the Java Virtual Machine, which ensures the same Java code can be run on different operating systems and platforms. Sun Microsystems’ slogan for Java was “write once, run everywhere”.

Programming languages are composed of syntax, the specific instructions which Java understands. We write syntax in files to create programs, which are executed by the computer to perform the desired task.

### 4. Compilation: Catch Errors
Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a
compiler
Preview: Docs Java compilers take Java source code and produce class files containing platform-neutral Java bytecode that can be executed by the Java Virtual Machine (JVM).
before it is executed by the Java Virtual Machine on your computer.

A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.

The compiling process catches mistakes before the computer runs our code.

The Java compiler runs a series of checks while it transforms the code. Code that does not pass these checks will not be compiled