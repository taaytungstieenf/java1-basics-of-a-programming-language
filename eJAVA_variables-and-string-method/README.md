./ApplicationName
|
|______	bin/
|		|______	com/
|				|______	example/
|						|______	p1Variables/
|						|		|
|						|		|______	v1Variables/
|						|		|		|______	Person.class
|						|		|______ v2Variables/
|						|		|		|______ Person.class
|						|		|______	...
|						|
|						|______	p2StringMethod/
|						|		|
|						|		|______	v1StringMethod/
|						|		|		|______	Person.class
|						|		|______	v2StringMethod/
|						|		|		|______	Person.class
|						|		|______	...
|						|
|						|______	...
|
|______	src/
|		|______	com/
|				|______	example/
						|______	p1Variables/
|						|		|
|						|		|______	v1Variables/
|						|		|		|______	Person.class
|						|		|______ v2Variables/
|						|		|		|______ Person.class
|						|		|______	...
|						|
|						|______	p2StringMethod/
|						|		|
|						|		|______	v1StringMethod/
|						|		|		|______	Person.class
|						|		|______	v2StringMethod/
|						|		|		|______	Person.class
|						|		|______	...
|						|
|						|______	...
|
|______	README.md


-----------------------------------------------------------------------------------------------------
|Own file	|	$ sudo chmod -R 777 README.md														|
|-----------|---------------------------------------------------------------------------------------|
|Interpret	|	$ javac -d bin src/com/example/p1Variables/v1variables/Person.java					|
|---------------------------------------------------------------------------------------------------|
|Run		|	$ java -cp bin com.example.p1Variables.v1Variables.Person							|
-----------------------------------------------------------------------------------------------------