## Program 10 

Write a program that will read its one command line argument (error for none). This is to be a filename, your program is to search for this argument through the directories identified within the command.com PATH variable.

 

Open a DOS box (see attached doc), type the command SET and review the PATH variable. You can access this using a getEnvironment methods in the JVM or Python equivalent. Read the PATH variable and separate using token scanner or some such on the semicolon. Then you can use the getFiles or getDirectory methods to get data from the computer environment.


DOS-Box-Set.docxPreview the document


Read argument on command line
Read environment variable PATH
Separate PATH string by the semicolon character
Interrogate each directory (in order) for argument from (1).

Print all that you find, do not stop at one.

Pointer to accessing command line arguments:
http://www.java-tips.org/java-se-tips/java.lang/how-to-pass-command-line-argument-in-a-java-pr.html (Links to an external site.)


Pointer to accessing environment variables:
http://www.java2s.com/Code/Java/Development-Class/GetEnvironmentVariables.htm (Links to an external site.)

 

General address for Java info: www.java2s.com (Links to an external site.)

These are just examples, don't have to use Java.


 