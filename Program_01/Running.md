## Compiling and Running:

`clear && javac Program1.java && java Program1`

[Current Time and Date](https://www.javatpoint.com/java-get-current-date)

[Getting System Properties](https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html)

[Listing All of your System Properties](https://memorynotfound.com/list-system-properties-java/)

[User Working Directory](https://www.testingexcellence.com/get-current-working-directory-java/)

**Free Memory in the Java Runtime JVM**

[Link to Calls](https://javarevisited.blogspot.com/2012/01/find-max-free-total-memory-in-java.html)

**Free Memory in Java**

Java free memory can be returned from an object method below, the method will return the size in bytes of the device.

`Runtime.getRuntime().freeMemory();`

calling the garbage collector will result in slightly larger memory with

`System.gc()` or `Runtime.gc()` this will result in slightly higher free memory reclaimed by dead objects.

**Total Memory** 

calling the *Runtime* object again can produce the total memory from the JVM, this represents current heapsize. which is itself a combination of free memory and combination of used memory

`Runtime.getRuntim.totalMemory();`

**Just In Time Compiler**

[Checking if The JIT is Enabled](https://www.ibm.com/support/knowledgecenter/SSYKE2_8.0.0/com.ibm.java.vm.80.doc/docs/jit.html)