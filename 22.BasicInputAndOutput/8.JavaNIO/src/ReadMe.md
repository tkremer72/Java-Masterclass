# Java NIO
In Java 1.4, a new I/O package was added to the Java SDK

Called java.nio, the package was described as an improvement to Java I/O because the 
classes in the package perform I/O in a non-blocking manner.  java.nio was also meant 
to fix some problems developers could run into when using the java.io classes 
to work with the file system.

The java.nio classes fall into one of two buckets: those that deal with the file system,
and those that deal with reading and writing data.  In this section we will look at the
classes that read data from, and write data to, a datasource.

When using classes in the java.io package, a thread will block while it's waiting to read 
or write to a stream or buffer.

However, threads using the java.nio classes will not block.  They are free to continue executing,
so java.nio was introduced as a performance improvement. 

Many developers have argued that the java.nio package was a step backwards.  Some have shown that
blocking I/O is often faster than non-blocking I/O.

Threads, blocking, etc. is covered later on in this course in the Threads section.

## Overview

Also, working with the java.nio classes is more complex, as you'll see.  As has happened with 
other additions to the Java language, many developers still prefer to write code using the older
java.io classes, and you may decide to do that too, but it's important to understand the new way 
of doing I/O, in case you're ever asked to work with code that uses it. 

Previously we learned that the java.io classes work with streams (character and binary).  Data is
read one byte or character at a time and sometimes buffered, depending on which classes are used.
When using java.nio, you'll deal with data in blocks, and rather than processing one byte or 
character at a time, one block will be processed at a time.  To accomplish this, you'll use channels
and buffers, which we will see later.

You can use java.nio methods to create a java.io stream.

Make a copy of the adventure game project that we last used to read and write the data as an object
stream e.g. Before we looked into Random access.  