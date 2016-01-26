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
	String text = "\n\n\n\n\nDEMO:\n\n";
	System.out.println(text);

	if ((this.name).equals("Naruto")) {
	    naruto();
	}

	text = "\n\n\n\n\nThanks for playing the demo! Now go watch the anime!\n\n";
	System.out.println(text);
    }

    public void naruto() {
	text = "\n\n\n\n\nWelcome to Naruto!\n\n";
	text += "You are about to begin your path to becoming a ninja.\n\n";
	System.out.print(text);
	proceed();

	

	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text = "\nPlease select a character.\n";
	    text += "\t1: Naruto.\n";
	    text += "\t2: Sasuke.\n";
	    text += "\t3: Sakura.\n";
	    text += "\t4: Kakashi.\n\n";
	    
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
	text = "\n>> ";
	System.out.print(text);
	
	try {
	    choice = Integer.parseInt ( in.readLine() );
	}
	catch ( Exception e ) { }
    }
	
    
    public void naruto1() {
	text = "\n\n\n\n\n'Believe it!' You shout, hopping out of bed.\n\n";
	System.out.print(text);
	proceed();

	text = "\nToday you have a C-rank mission.\n";
	System.out.print(text);
	proceed();

	text = "\nIt's probably something dumb like chasing cats.\n";
	System.out.print(text);
	proceed();

	text = "\nOh well. Time to leave.\n";
	System.out.print(text);
	proceed();

	text = "\nYou've finally met up with Sasuke and Sakura, but Kakashi is nowhere to be found.\n";
	System.out.print(text);
	proceed();

	text = "\nYou: Where is Kakashi-sensei?\n";
	System.out.print(text);
	proceed();

	text = "\nSasuke: How should I know? What are you, an idiot?\n";
	System.out.print(text);
	proceed();

	text = "\nSakura: Yeah, does he look like he's here?\n";
	System.out.print(text);
	proceed();

	text = "\nBefore you can sputter about how much of a jerk Sasuke is, Kakashi arrives.\n";
	System.out.print(text);
	proceed();

	text = "\nSorry I'm late, a cat just crossed my path...\n";
	System.out.print(text);
	proceed();

	text = "\nIt's an obvious lie and the three of you see right through it!\n";
	System.out.print(text);
	proceed();

	text = "\nSakura: Yeah right, Kakashi-sensei!\n";
	System.out.print(text);
	proceed();

	text = "\nSasuke: Hmph.\n";
	System.out.print(text);
	proceed();

	text = "\nYou: Kakashi-sensei! You better make this up to us with a S-ranked mission!\n";
	System.out.print(text);
	proceed();
	
	text = "\nKakashi (pretends to) think for a moment...\n";
	System.out.print(text);
	proceed();

	text = "\nKakashi: Well, if you insist. The Hokage did ask me to give you an S-ranked mission.\n";
	System.out.print(text);
	proceed();

	text = "\nALL: WHAT?!\n";
	System.out.print(text);
	proceed();
	
	text = "\nKakashi smiles underneath his ninja mask.\n";
	System.out.print(text);
	proceed();	
	
	text = "\nKakashi: Well, if you're not up for it...\n";
	System.out.print(text);
	proceed();
	
	while (choice != 1 && choice != 2) {
	    text = "What do you do?\n";
	    text += "\t1: Go on the S-ranked mission.\n";
	    text += "\t2: Ask for an easier mission.\n\n";
	
	    text += ">> ";
	    System.out.print(text);
	
	    try {
	        choice = Integer.parseInt ( in.readLine() );
	    }
	    catch ( Exception e ) { }
	
	    if (choice != 1 && choice != 2) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.\n\n");
	    }
	}
	
	if (choice == 1) {
	    text = "\nKakashi: Very well, we're off to the Sound village.\n";
	    System.out.print(text);
	    proceed();	    
	    
	    text = "\nYou: Yes! The moment I've been waiting for...\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nThe Sound village is silent... and it's scary.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nKakashi: We're investigating one of Orochimaru's abandoned experiments.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nSakura: Gross, it smells like...\n";
	    System.out.print(text);
	    proceed();
	}
	
	if (choice == 2) {
	    text = "\nKakashi: Very well, a lady in town wants you to help her find her cat.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nNaruto: Not again!\n";
	    System.out.print(text);
	    proceed();
	}	
	    
	text = "\nKakashi: Naruto, get down!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou black out.\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...Naruto...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...\n";
	System.out.print(text);
	proceed();
	    
	text = "\nNaruto!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou open your eyes, and darkness greets you. But somehow you can still hear Sasuke's annoying voice.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nSasuke: Hey, idiot. We need to get to Sakura and Kakashi-sensei.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: Where are we?\n";
	System.out.print(text);
	proceed();
	    
	text = "\nSasuke: I don't know. Someone knocked us out.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nUnknown: Hello, children. I killed your precious friend.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...what?\n";
	System.out.print(text);
	proceed();
	    
	text = "\nUnknown: ...and that bothersome sensei of yours.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nSasuke: Naruto, snap out of it! That's Orochimaru! He has an army with him!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou:...\n";
	System.out.print(text);
	proceed();
	    
	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text = "\nMake a decision.\n";
	    text += "\t1: Ask what is going on.\n";
	    text += "\t2: Unleash the nine-tailed fox within you.\n";
	    text += "\t3: Scream, cry, beg for mercy.\n";
	    text += "\t3: Kill them all.\n\n";
	
	    text += ">> ";
	    System.out.print(text);
	
	    try {
	        choice = Integer.parseInt ( in.readLine() );
	    }
	    catch ( Exception e ) { }
	
	    if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1, 2, 3 or 4 to continue.\n\n");
	    }
	}
	    
	if (choice == 1 || choice == 3) {
	    text = "\nYou: Please... what is going on... don't do this...\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSomething hard hits you on the head. Your eyes open.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSakura: We found the cat without you!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: What?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSasuke: I can't believe you were asleep the entire time. What an idiot.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: HUH?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nKakashi: And you wanted an S-ranked mission?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou end up having to spend all day searching for cats, but at least everyone is safe.\n";
	    System.out.print(text);
	    proceed();
	}
	
	if (choice == 2 || choice == 4) {
	    text = "\nYou: You made a mistake.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nOrochimaru: Hmm?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSasuke: Naruto, no!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: Nine tailed-fox, if you're there. KILL THEM.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nOrochimaru's army is destroyed. They lie on the ground, dead. Orochimaru escapes angrily.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nKakashi and Sakura arrive, appearing unharmed.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSakura jumps into your arms and shouts: 'You did it, Naruto!'\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou end up getting a lot of attention for defeating Orochimaru's army and become the Hokage!\n";
	    System.out.print(text);
	    proceed();	
        }
    }
/*
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
