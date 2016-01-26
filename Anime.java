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
	text += "You are about to begin your path to becoming a ninja.\n";
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
	    sasuke();
	}

	if (choice == 3) {
	    choice = 0;
	    sakura();
	}

	if (choice == 4) {
	    choice = 0;
	    kakashi();
	}
    }
	

    public void proceed() {
	text = "\n>> ";
	System.out.print(text);
	
	try {
	    choice = Integer.parseInt ( in.readLine() );
	}
	catch ( Exception e ) { }
	
	System.out.println("");
	System.out.println("");
    }
	
    
    public void naruto1() {
    	text = "\n\n\n\n\nThe day has begun...\n";
	System.out.print(text);
	proceed();
	
	text = "\n\n'Believe it!' You shout, hopping out of bed.\n";
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
	    text = "\nWhat do you do?\n";
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
	    choice = 0;
	    text = "\n\nKakashi: Very well, we're off to the Sound village.\n";
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
	    choice = 0;
	    text = "\n\nKakashi: Very well, a lady wants you to help her find her cat.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou: Not again!\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nSakura: Oh, stop complaining.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou enter the outskirts of the village and... it's scary.\n";
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
	    
	text = "\n...Naruto!!!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou open your eyes, and darkness greets you. But somehow you can still hear Sasuke's annoying voice.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nSasuke: Hey, idiot! We need to get to Sakura and Kakashi-sensei!\n";
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
	    
	text = "\nSasuke: Naruto, snap out of it! That's Orochimaru! He has an army with him too!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...\n";
	System.out.print(text);
	proceed();
	    
	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text = "\nMake a decision.\n";
	    text += "\t1: Ask what is going on.\n";
	    text += "\t2: Unleash the nine-tailed fox within you.\n";
	    text += "\t3: Scream, cry, beg for mercy.\n";
	    text += "\t4: Kill them all.\n\n";
	
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
	    choice = 0;
	    text = "\n\nYou: Please... what is going on... don't do this...\n";
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
	    choice = 0;
	    text = "\n\nYou: Orochimaru, you made a mistake.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nOrochimaru: Hmm?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSasuke: Naruto, no!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: Nine tailed-fox, if you're there. KILL THEM ALL.\n";
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

    public void sasuke() {
    	text = "\n\n\n\n\nThe day has begun...\n";
	System.out.print(text);
	proceed();
	
	text = "\n\nYou get out of bed and start getting dressed.\n";
	System.out.print(text);
	proceed();

	text = "\nToday you have a C-rank mission.\n";
	System.out.print(text);
	proceed();

	text = "\nIt's probably something dumb like chasing cats.\n";
	System.out.print(text);
	proceed();

	text = "\nWhatever. Time to leave.\n";
	System.out.print(text);
	proceed();

	text = "\nYou've finally met up with Naruto and Sakura, but Kakashi is nowhere to be found.\n";
	System.out.print(text);
	proceed();

	text = "\nNaruto: Where is Kakashi-sensei?\n";
	System.out.print(text);
	proceed();

	text = "\nYou: How should I know? What are you, an idiot?\n";
	System.out.print(text);
	proceed();

	text = "\nSakura: Yeah, does he look like he's here?\n";
	System.out.print(text);
	proceed();

	text = "\nBefore you can say something about this sensei of yours, Kakashi arrives.\n";
	System.out.print(text);
	proceed();

	text = "\nKakashi: Sorry I'm late, a cat just crossed my path...\n";
	System.out.print(text);
	proceed();

	text = "\nIt's an obvious lie and the three of you see right through it!\n";
	System.out.print(text);
	proceed();

	text = "\nSakura: Yeah right, Kakashi-sensei!\n";
	System.out.print(text);
	proceed();

	text = "\nYou: Hmph.\n";
	System.out.print(text);
	proceed();

	text = "\nNaruto: Kakashi-sensei! You better make this up to us with a S-ranked mission!\n";
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
	    text = "\nWhat do you do?\n";
	    text += "\t1: Go on the S-ranked mission.\n";
	    text += "\t2: It's clearly a lie, don't fall for it.\n\n";
	
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
	    choice = 0;
	    text = "\n\nKakashi: Very well, we're off to the Sound village.\n";
	    System.out.print(text);
	    proceed();	    
	    
	    text = "\nYou: Really now... this might be worthwhile...\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nThe Sound village is silent... and the air is thick.\n";
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
	    choice = 0;
	    text = "\n\nKakashi: Very well, a lady wants you to help her find her cat.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou: Ugh...\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nSakura: Don't worry Sasuke! We can work as a team and...\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou enter the outskirts of the village and... the air is thick.\n";
	    System.out.print(text);
	    proceed();
	}	
	    
	text = "\nKakashi: Sasuke, get down!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou black out.\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...Sasuke...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...Sasuke!!!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou open your eyes, and darkness greets you. But somehow you can still hear Naruto's annoying voice.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nNaruto: Hey! We need to get to Sakura and Kakashi-sensei!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: Where are we?\n";
	System.out.print(text);
	proceed();
	    
	text = "\nNaruto: I don't know. Someone knocked us out or something.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nUnknown: Hello, children. I killed your precious friend.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...\n";
	System.out.print(text);
	proceed();
	    
	text = "\nUnknown: ...and that bothersome sensei of yours.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nNaruto: Sasuke, snap out of it! That's Orochimaru! He has an army with him too!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...\n";
	System.out.print(text);
	proceed();
	    
	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text = "\nMake a decision.\n";
	    text += "\t1: Figure out the situation.\n";
	    text += "\t2: Threaten him.\n";
	    text += "\t3: Do nothing.\n";
	    text += "\t4: Kill them all.\n\n";
	
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
	    choice = 0;
	    text = "\n\nYou: ...what is this...\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSomething hard hits you on the head. Your eyes open.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSakura: We found the cat, Sasuke!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: ...?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nNaruto: I can't believe you wandered off!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: ...\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nKakashi: And you wanted an S-ranked mission, Sasuke?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou glare and end up having to spend all day searching for cats.\n";
	    System.out.print(text);
	    proceed();
	}
	
	if (choice == 2 || choice == 4) {
	    choice = 0;
	    text = "\n\nYou: Die.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nOrochimaru: Hmm?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nNaruto: Sasuke, no!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: I'll KILL THEM ALL, your eyes glow red and purple armor engulfs you.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nOrochimaru's army is destroyed. They lie on the ground, dead. Orochimaru escapes angrily.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nKakashi and Sakura arrive, appearing unharmed.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSakura jumps into your arms and shouts: 'You did it, Sasuke!'\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou end up finding your traitor brother after defeating Orochimaru's army and end him.\n";
	    System.out.print(text);
	    proceed();	
        }
    }

    public void sakura() {
    	text = "\n\n\n\n\nThe day has begun...\n";
	System.out.print(text);
	proceed();
	
	text = "\n\n'CHAA!' You shout, hopping out of bed.\n";
	System.out.print(text);
	proceed();

	text = "\nToday you have a C-rank mission.\n";
	System.out.print(text);
	proceed();

	text = "\nIt's probably something dumb like chasing cats.\n";
	System.out.print(text);
	proceed();

	text = "\nBut Sasuke will be there, so it's okay. Time to leave!\n";
	System.out.print(text);
	proceed();

	text = "\nYou've finally met up with Naruto and Sasuke, but Kakashi is nowhere to be found.\n";
	System.out.print(text);
	proceed();

	text = "\nYou: Where is Kakashi-sensei?\n";
	System.out.print(text);
	proceed();

	text = "\nSasuke: How should I know?\n";
	System.out.print(text);
	proceed();

	text = "\nNaruto: You're such a jerk, Sasuke! Sakura, how about we look for him together?\n";
	System.out.print(text);
	proceed();

	text = "\nBefore you can refuse because ew, Kakashi arrives.\n";
	System.out.print(text);
	proceed();

	text = "\nKakashi: Sorry I'm late, a cat just crossed my path...\n";
	System.out.print(text);
	proceed();

	text = "\nIt's an obvious lie and the three of you see right through it!\n";
	System.out.print(text);
	proceed();

	text = "\nYou: Yeah right, Kakashi-sensei!\n";
	System.out.print(text);
	proceed();

	text = "\nSasuke: Hmph.\n";
	System.out.print(text);
	proceed();

	text = "\nNaruto: Kakashi-sensei! You better make this up to us with a S-ranked mission!\n";
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
	    text = "\nWhat do you do?\n";
	    text += "\t1: Go on the S-ranked mission to impress Sasuke.\n";
	    text += "\t2: Don't go so Naruto doesn't end up getting himself killed.\n\n";
	
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
	    choice = 0;
	    text = "\n\nKakashi: Very well, we're off to the Sound village.\n";
	    System.out.print(text);
	    proceed();	    
	    
	    text = "\nYou: Finally, I can show what I've learned...\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nThe Sound village is silent... and it's scary.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nKakashi: We're investigating one of Orochimaru's abandoned experiments.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nNaruto: Gross, it smells like...\n";
	    System.out.print(text);
	    proceed();
	}
	
	if (choice == 2) {
	    choice = 0;
	    text = "\n\nKakashi: Very well, a lady wants you to help her find her cat.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou're secretly disappointed but Naruto and Sasuke are upset enough for all three of you.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou: Oh, it's not that bad guys.\n";
	    System.out.print(text);
	    proceed();
	    
	    text = "\nYou enter the outskirts of the village and... it's scary.\n";
	    System.out.print(text);
	    proceed();
	}	
	    
	text = "\nKakashi: Sakura, get down!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou black out.\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...Sakura...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...\n";
	System.out.print(text);
	proceed();
	    
	text = "\n...Sakura!!!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou open your eyes, and darkness greets you. But somehow you can hear Kakashi's voice.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nKakashi: We need to get to Naruto and Sasuke!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: Where are we?\n";
	System.out.print(text);
	proceed();
	    
	text = "\nKakashi: Orochimaru's cave. Naruto and Sasuke got taken, and you were knocked out so I took you with me.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...what should we do?\n";
	System.out.print(text);
	proceed();
	    
	text = "\nKakashi: There are enemies around us.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...I know.\n";
	System.out.print(text);
	proceed();
	    
	text = "\nKakashi: I have a jutsu that can call for your future self... want to give it a try?!\n";
	System.out.print(text);
	proceed();
	    
	text = "\nYou: ...\n";
	System.out.print(text);
	proceed();
	    
	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text = "\nMake a decision.\n";
	    text += "\t1: No, the future me might not be strong enough.\n";
	    text += "\t2: Yes, I want to fight too.\n";
	    text += "\t3: BUT WHAT IF FUTURE ME DIES?\n";
	    text += "\t4: Let's kill them all.\n\n";
	
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
	    choice = 0;
	    text = "\n\nYou: ...what is going on...\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSomething hard hits you on the head. Your eyes open.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nNaruto: We found the cat!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: What?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nSasuke: Where were you?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: Wha...?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nKakashi: And you wanted an S-ranked mission? I'm disappointed, Sakura.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou end up having to spend all day searching for cats, but at least everyone is safe.\n";
	    System.out.print(text);
	    proceed();
	}
	
	if (choice == 2 || choice == 4) {
	    choice = 0;
	    text = "\n\nYou: Whoever you are, I'll TAKE YOU DOWNNN.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nUnknown: Hmm?\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nKakashi: Go Sakura!\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou: CHAAAAAAA! Your forehead has a weird looking diamond and your hands glow.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nOrochimaru's army is destroyed. They lie on the ground, dead. Orochimaru escapes angrily.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nNaruto and Sasuke arrive, appearing unharmed.\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nThey shout: 'Sakura! Oh my god!'\n";
	    System.out.print(text);
	    proceed();
	        
	    text = "\nYou end up getting a lot of attention for defeating Orochimaru's army and become the strongest kunoichi! Plus you get to marry whoever you want.\n";
	    System.out.print(text);
	    proceed();	
        }
    }

    public void kakashi() {
    	text = "\n\n\n\n\nThe day has begun...\n";
	System.out.print(text);
	proceed();
	
	text = "\n\nYou stand at the gravestone of your dearest friend, Obito.\n";
	System.out.print(text);
	proceed();

	text = "\nToday the team has a C-rank mission.\n";
	System.out.print(text);
	proceed();

	text = "\nIt's probably something dumb like chasing cats, but it reminds you of what you used to do with Obito and Rin.\n";
	System.out.print(text);
	proceed();

	text = "\nThe time ticks by...\n";
	System.out.print(text);
	proceed();

	text = "\nAt this rate, you'll be late...\n";
	System.out.print(text);
	proceed();

	text = "\nUnknown: 'Obito is alive...'\n";
	System.out.print(text);
	proceed();

	text = "\nYou spin around, scanning for the voice.\n";
	System.out.print(text);
	proceed();

	text = "\nHmm...\n";
	System.out.print(text);
	proceed();

	text = "\nMaybe it was your imagination.\n";
	System.out.print(text);
	proceed();
    }
	
	

    //MAIN METHOD FOR TESTING

    public static void main(String[] args) {

	Anime Naruto = new Anime();
	Naruto.setName("Naruto");
	Naruto.demo();

    }

}    
