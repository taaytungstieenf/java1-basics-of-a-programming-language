./ApplicationName
|
|______	bin/
|		|______	com/
|				|______	example/
|						|______	p1StateAndBehaviour/
|						|		|
|						|		|______	v1StateAndBehaviour/
|						|		|		|______	Person.class
|						|		|______ v2StateAndBehaviour/
|						|		|		|______ Person.class
|						|		|______	...
|						|
|						|______	p2Instance/
|						|		|
|						|		|______	v1Instance/
|						|		|		|______	Person.class
|						|		|______	v2Instance/
|						|		|		|______	Person.class
|						|		|______	...
|						|
|						|______	...
|
|______	src/
|		|______	com/
|				|______	example/
|						|______	p1StateAndBehaviour/
|						|		|
|						|		|______	v1StateAndBehaviour/
|						|		|		|______	Person.java
|						|		|______ v2StateAndBehaviour/
|						|		|		|______ Person.java
|						|		|______	...
|						|
|						|______	p2Instance/
|						|		|
|						|		|______	v1Instance/
|						|		|		|______	Person.java
|						|		|______	v2Instance/
|						|		|		|______	Person.java
|						|		|______	...
|						|
|						|______	...
|
|______	README.md


-----------------------------------------------------------------------------------------------------
|Own file	|	$ sudo chmod -R 777 README.md														|
|-----------|---------------------------------------------------------------------------------------|
|Interpret	|	$ javac -d bin src/com/example/p1StateAndBehaviour/v1StateAndBehaviour/Person.java	|
|---------------------------------------------------------------------------------------------------|
|Run		|	$ java -cp bin com.example.p1StateAndBehaviour.v1StateAndBehaviour.Person			|
-----------------------------------------------------------------------------------------------------