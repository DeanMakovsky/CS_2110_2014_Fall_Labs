package Lab1_Sept1_2;
import java.util.*;
import java.io.*;

public class Lab1B {

    public static void main(String[] args) {
	/* Activity 2.1 Scanners */
	Scanner k = new Scanner(System.in);
	while ( k.hasNext() ) { // press Ctrl/Cmd + D(?) to stop input
	    int d = 0;
	    String s = "";
	    if (k.hasNextInt()) {
		d = k.nextInt();
	    }
	    if (k.hasNext()) {
		s = k.next();
		k.nextLine(); // should burn the newline character
	    }
	    System.out.println(d + "\n" + s); /* so even if there is not a number, it will still print zero.  This could be avoided, but it's not worth it in such a small example.  Could be done by having a boolean value that is set to true inside the if-statements. */
	}
	// Scanners should be closed - just a good habit.
	k.close();

	
	/* Activity 2.2 Files */
	// note this does not need a Scanner because we are not reading the file's contents.
	File f = new File("data1.txt");
	System.out.println(f.length());
	System.out.println(f.getAbsolutePath());


	/* Activity 2.3 Files Again */
	// we will print out all lines in the file, since I don't know what data will be in your data1.txt
	Scanner kk = null;
	try {
	    kk = new Scanner (f);
	} catch (FileNotFoundException e) {
	    System.out.println("Bad filename, exiting"); // Always nice to know what is happening
	    System.exit(1);  // System.exit(0) is exiting normally
	}
	while (kk.hasNextLine()) {
	    System.out.println(kk.nextLine()); // could have created a local variable meh easier code
	}
	kk.close();
	// buh bye!
    }
}