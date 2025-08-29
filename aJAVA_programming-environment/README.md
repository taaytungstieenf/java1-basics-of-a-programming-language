### 1. Project Structure

```
./aJAVA_programming-environment
|
|______	bin/
|		|______	com/
|				|______	example/
|						|______	part1
|						|		|______ ver1
|						|		|		|______ Main.class
|						|		|______ ver2
|						|				|______ Main.class
|						|______ part2
|								|______ ver1
|								|		|______ Main.class
|								|______ ver2
|										|______ Main.class
|
|______	src/
|		|______	com/
|				|______	example/
|						|______	part1
|						|		|______ ver1
|						|		|		|______ Main.java
|						|		|______ ver2
|						|				|______ Main.java
|						|______ part2
|								|______ ver1
|								|		|______ Main.java
|								|______ ver2
|										|______ Main.java
|
|______	README.md
```


### 2. Compile project
```
Interpret   : $ javac -d bin src/com/example/part1/ver1/Main.java	
Run         : $ java -cp bin com.example.part1.ver1.Main
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