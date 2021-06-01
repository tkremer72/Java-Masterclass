Overview for Walking the File Tree

To walk the directory tree, you will have to use the FileVisitor
interface.  Using the methods in FileVisitor, you can run code at each
stage of the traversal process.  Here are the methods you will have to
implement.

preVisitDirectory() - this method accepts a reference to the directory,
and the BasicFileAttributes instance for the directory.  It's called
before entries in the directory are visited.

postVisitDirectory() - this method accepts a reference to the directory
and an exception object (when necessary).  It's called after entries in
the directory, and all it's descendants, have been visited.  The
exception parameter will be set when an exception happens during the
traversal of the entries and descendants.
There is a way to skip files as you're traversing, so not every file has
to have been visited for this method to be called.  Every file has to be
visited or explicitly skipped.  Of course if an exception is thrown and
not handled, the traversal will prematurely end and postVisitDirectory()
will be called.

visitFile() - probably the method you will care most about.  This method
accepts a reference to the file and a BasicFileAttributes instance.  This
is where you run the code that will operate on the file.  It's only
called for files.

visitFileFailed() - this method is called when a file can't be accessed.
The exception that is thrown is passed to the method.  You can then
decide what to do with it (throw it, print it, or anything else that
makes sense for the application and operation being performed).  Can be
called for files and directories.