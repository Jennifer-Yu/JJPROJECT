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
    private String text = "";


    // DEFAULT CONSTRUCTOR
    public Kanimop() {
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	start();
    }



    // START
    public void start() {
	text = "\nWelcome to Kanimop!";
	System.out.println(text);



	while ( choice != 1 && choice != 2 ) {

	    text = "\nWould you like to create a new avatar?\n";
	    text += "\t1: Yeah, let's go!\n";
	    text += "\t2: Nah, maybe later.\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.\n\n\n\n\n");
	    }
	}


	    
	if ( choice == 1 ) {
	    choice = 0;

	    while ( choice != 1 && choice != 2 ) {
		text = "\n\n\n\n\nDo you have an avatar already?\n";
		text += "\t1: Yes\n";
		text += "\t2: No\n";

		text += ">> ";
		System.out.print(text);
		
		try {
		    choice = Integer.parseInt( in.readLine() );
		}
		catch ( Exception e ) { }
	
		if ( choice != 1 && choice != 2 ) {
		    System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.\n\n\n\n\n");
		}
	    }

	    if (choice == 1) {
		choice = 0;
		//login check
	    }
	    
	    if (choice == 2) {
		choice = 0;
		quiz();
	    }
	}



	if ( choice == 2 ) {
	    choice = 0;
	    //skip(); go to database
	    text = "\n\n\n\n\nYou have entered as a guest.\n";
	    text += "Feel free to browse and type, but remember that you need a character to save your progress!\n\n";
	    System.out.println(text);
	}
    }    


    // RESTART
    public void restart() {
    }



    // QUIZ
    public void quiz() {

	while (choice != 1 && choice != 2) {
	    text = "\n\n\n\n\nWould you like to be an anime character or a korean pop star?\n";
	    text += "\t1: ANIME CHARACTER PLZZ!\n";
	    text += "\t2: Smoking hot kpop star, DUR.\n";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.\n\n\n\n\n");
	    }
	}
	    
	String text;
	//	ArrayList[][] characters = {"Haruhi", "Yuno", "Mikasa", "Homura", "Shiro", "Kaori", "Alice", "Guila", "Teresa", "Erza", "Izaya", "L", "Lelouch", "Gintoki", "Kirito", "Itachi", "Kaneki", "Ichigo", "Kise", "Edward"};
	
	/*  
	text += "If you could "




	while ( choice == 0 ) {

	    text = "\nWould you like to create a new character?\n";
	    text += "\t1: Yeah, let's go!\n";
	    text += "\t2: Nah, maybe later.\n";
	    text += "\t3: Pssh, I already have a character~!\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { 
		System.out.print("\n\n\n\n\nTry again! You need to pick 1, 2 or 3 to continue.\n\n\n\n\n");
	    }
		
	}
	    
	if ( choice == 1 ) {
	    //quiz();
	    text = "\n\nAnswer these questions to create your character!\n";
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
	*/
    }


	
    public static void main(String[] args) {
	Kanimop jubjubjub = new Kanimop();
    }



}
