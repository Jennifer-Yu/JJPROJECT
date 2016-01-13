// MAIN PROJECT FILE

// IMPORTED PACKAGES
import java.io.*;
import java.util.*;

// MAIN CLASS
public class Kanimop {

    // INSTANCE VARIABLES
    private InputStreamReader isr;
    private BufferedReader in;
    private int choice = 0;

    // DEFAULT CONSTRUCTOR
    public Kanimop() {
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	intro();
    }

    // INTRO
    public void intro() {
	String text;
	
	text = "Welcome to Kanimop!\n";
	
	while ( choice == 0 ) {

	    text += "\nWould you like to create a new character?\n";
	    text += "\t1: Yeah, let's go!\n";
	    text += "\t2: Nah, maybe later.\n";
	    text += "\t3: Pssh, I already have a character~!\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) { }
		
	    if (choice == 0) {
text = "Try again! You need to pick 1, 2 or 3 to continue.\n";
		System.out.print(text);
	    }
	}
	    
	if ( choice == 1 ) {
	    //quiz();
	    text = "Answer these questions to create your character!\n";
	    System.out.print(text);
	}

	if ( choice == 2 ) {
	    //skip();
	    text = "You have entered as a guest.\n";
	    text += "Feel free to browse and type, but remember that you need a character to save your progress!\n";
	    System.out.println(text);
	}

	if ( choice == 3 ) {
	    //continue();
	    text = "Welcome back!\n";
	    System.out.println(text);
	}
	
	text += "Kay.\n";
	
    }	
    
    public void restart() {
    }

    // QUIZ
    public void quiz() {
	String text;
	
	
	    
	//text += 
	    }
	
    public static void main(String[] args) {
	Kanimop start = new Kanimop();
    }
}
