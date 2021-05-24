# Paths
Now that we have an idea of how to build paths to files in the current directory, in a path relative
to another directory, or to anywhere on the file system using an absolute path, let's briefly discuss 
why the Path interface came about.  The java.io.File class also points to files on the file system.  Why
did Java developers introduce another class that does the same thing in Java 7?  The File class, while 
useful, has a few problems.  What are those problems?

Many methods in the class don't throw exceptions, or don't provide specific error messages when they fail.
One example would be the File.delete() method, which returns a boolean.  If the deletion fails, you can't 
tell if it was because the file didn't exist, or the application didn't have permission to delete the file,
or...? Unfortunately, the method doesn't provide that information.

The File.rename() method works differently on different platforms.  Java is supposed to be portable across
platforms, meaning the code should have to worry about which operating system it is running on.

There's no support for symbolic links.  A symbolic link is a kind of file that points to another file.
They're often used with networks, to point to a remote location.  The File class doesn't understand them.

The File class doesn't provide a way to get metadata about a file, such as its permissions, its owner, and
other security information.  The metadata it does provide is retrieved inefficiently. 

Many of the methods don't perform well when working with lots of data.  For example, if you use the file 
class to request a list of all the files in a directory, and there are a lot of files, the method can hang.

Since the File class doesn't understand symbolic links, walking a directory tree is problematic.