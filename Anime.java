// ANIME SKELETON IN DATABASE

import java.util.ArrayList;
import java.io.*;
import java.util.*;



public class Anime {


    //INSTANCE VARIABLES
    
    public String name;

    public String alternateName;

    public ArrayList<String> genres;

    public ArrayList<String> characters;

    public double rating;

    public int episodes;

    public ArrayList<String> producers;

    public ArrayList<String> reviews;

    public String plot;


    // INSTANCE VARIABLES
    private InputStreamReader isr = new InputStreamReader( System.in );
    private BufferedReader in = new BufferedReader( isr );
    private int choice = 0;
    private String text = "";

    //CONSTRUCTORS

    public Anime() {
	
	name = "Name";
	alternateName = "N/A";
	genres = new ArrayList<String>();
	characters = new ArrayList<String>();
	rating = 0;
	episodes = 0;
	reviews = new ArrayList<String>();
	plot = "Plot";

    }


    //ACCESSORS

    public String getName() {
	return name;
    }

    public String getAlternateName() {
	return alternateName;
    }

    public ArrayList<String> getGenres() {
	return genres;
    }

    public ArrayList<String> getCharacters() {
	return characters;
    }

    public double getRating() {
	return rating;
    }

    public int getNumEpisodes() {
	return episodes;
    }

    public ArrayList<String> getProducers() {
	return producers;
    }

    public ArrayList<String> getReviews() {
	return reviews;
    }

    public String getPlot() {
	return plot;
    }


    //MUTATORS

    public void setName(String input) {
	name = input;
    }

    public void setAlternateName(String input) {
	alternateName = input;
    }

    public void setGenres(ArrayList<String> input) {
	genres = input;
    }

    public void setCharacters(ArrayList<String> input) {
	characters = input;
    }

    public void setRating(double input) {
	rating = input;
    }

    public void setEpisodes(int input) {
	episodes = input;
    }

    public void setProducers(ArrayList<String> input) {
	producers = input;    
    }

    public void setReviews(ArrayList<String> input) {
	reviews = input;
	    choice = 0;    }

    public void setPlot(String input) {
	plot = input;
    }


    //METHODS

    public static String returnALStr(ArrayList<String> input) {
	String retStr = "";
	for (String x : input) {
	    retStr += x + ", ";
	}
	retStr = retStr.substring(0, retStr.length()-2); //remove last comma
	return retStr;
    } 

    public void demo() {
	String text = "\n\n\n\n\nDEMO:\n";
	System.out.println(text);

	if ((this.name).equals("Naruto")) {
	    naruto();
	}

	text = "\n\n\n\n\nThanks for playing the demo! Now go watch the anime!\n";
	System.out.println(text);
    }

    public void naruto() {
	text = "\n\n\n\n\nWelcome to Naruto!\n";
	text += "You are about to begin your path to becoming a ninja.\n\n";
	System.out.print(text);
	proceed();

	

	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text = "Please select a character.\n";
	    text += "\t1: Naruto.\n";
	    text += "\t2: Sasuke.\n";
	    text += "\t3: Sakura.\n";
	    text += "\t4: Kakashi.\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    
	    if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1, 2, 3 or 4 to continue.\n\n\n\n\n");
	    }
	}
	
	if (choice == 1) {
	    choice = 0;
	    naruto1();
	}

	if (choice == 2) {
	    choice = 0;
	    //sasuke();
	}

	if (choice == 3) {
	    choice = 0;
	    //sakura();
	}

	if (choice == 4) {
	    choice = 0;
	    //kakashi();
	}
    }
	

    public void proceed() {
	text = "> \n";
	System.out.print(text);
	
	try {
	    choice = Integer.parseInt ( in.readLine() );
	}
	catch ( Exception e ) { }
    }
	
    
    public void naruto1() {
	text = "\n\n\n\n\n'Believe it!' You shout, hopping out of bed.\n";
	System.out.print(text);
	proceed();

	text = "Today you have a C-rank mission.\n";
	System.out.print(text);
	proceed();

	text = "It's probably something dumb like chasing cats.\n";
	System.out.print(text);
	proceed();

	text = "Oh well. Time to leave.\n";
	System.out.print(text);
	proceed();

	text = "You've finally met up with Sasuke and Sakura, but Kakashi is nowhere to be found.\n";
	System.out.print(text);
	proceed();

	text = "You: Where is Kakashi-sensei?\n";
	System.out.print(text);
	proceed();

	text = "Sasuke: How should I know? What are you, an idiot?\n";
	System.out.print(text);
	proceed();

	text = "Sakura: Yeah, does he look like he's here?\n";
	System.out.print(text);
	proceed();

	text = "Before you can sputter about how much of a jerk Sasuke is, Kakashi arrives.\n";
	System.out.print(text);
	proceed();

	text = "Sorry I'm late, a cat just crossed my path...\n";
	System.out.print(text);
	proceed();

	text = "It's an obvious lie and the three of you see right through it!\n";
	System.out.print(text);
	proceed();

	text = "Sakura: Yeah right, Kakashi-sensei!\n";
	System.out.print(text);
	proceed();

	text = "Sasuke: Hmph.\n";
	System.out.print(text);
	proceed();

	text = "You: Kakashi-sensei! You better make this up to us with a S-ranked mission!\n";
	System.out.print(text);
	proceed();

	text = "Kakashi (pretends to) think for a moment...\n";
	System.out.print(text);
	proceed();

	text = "Kakashi: Well, if you insist. The Hokage did ask me to give you an S-ranked mission.\n";
	System.out.print(text);
	proceed();

	text = "ALL: WHAT?!\n";
	System.out.print(text);
	proceed();
	
	text = "Kakashi smiles underneath his ninja mask.\n";
	System.out.print(text);
	proceed();	
	
	text = "Kakashi: Well, if you're not up for it...\n";
	System.out.print(text);
	proceed();
	
	while (choice != 1 && choice != 2) {
	    text = "What do you do?\n";
	    text += "\t1: Go on the S-ranked mission."
	    text += "\t2: Ask for an easier mission."
	
	    text += ">> ";
	    System.out.print(text);
	
	    try {
	        choice = Integer.parseInt ( in.readLine() );
	    }
	    catch ( Exception e ) { }
	
	    if (choice != 1 && choice != 2) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.\n");
	    }
	}
	
	if (choice == 1) {
	    text = "Kakashi: Very well, we're off to the Sound village.\n";
	    System.out.print(text);
	    proceed();	    
	    
	    text = "You: Yes! The moment I've been waiting for...\n";
	    System.out.print(text);
	    proceed();
	}
	
	if (choice == 2) {
	    text = "Kakashi: Very well, a lady in town wants you to help her find her cat.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "Naruto: Not again!\n";
	    System.out.print(text);
	    proceed();
	}
    }
	/*
	text += "\t1: Go on the mission anyway.\n";
	
	text += ">> ";
	System.out.print(text);
	
	try {
	    choice = Integer.parseInt ( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    
	    if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1, 2, 3 or 4 to continue.\n");
	    }

	System.out.print(text);
	

    }

    public void sasuke() {
    }

    public void sakura() {
    }

    public void kakashi() {
    }
	
	*/

    //MAIN METHOD FOR TESTING

    public static void main(String[] args) {

	Anime Naruto = new Anime();
	Naruto.setName("Naruto");
	Naruto.demo();

    }

}    
