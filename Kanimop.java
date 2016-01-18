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
	    animeQuiz();
	}

	if (choice == 2) {
	    choice = 0;
	    //    kpopQuiz();
	}
    }

    public void animeQuiz() {
	
	ArrayList<String> C = new ArrayList<String>(Arrays.asList("Haruhi", "Kaori", "Teresa", "Gintoki", "Kise"));
	ArrayList<String> X = new ArrayList<String>(Arrays.asList("Yuno", "Izaya", "Kaneki", "Shiro", "Alice"));
	ArrayList<String> I = new ArrayList<String>(Arrays.asList("Homura", "Guila", "Kirito", "Ichigo", "Edward"));
	ArrayList<String> L = new ArrayList<String>(Arrays.asList("L", "Lelouch", "Itachi", "Mikasa", "Erza"));
		
	int c = 0;
	int x = 0;
	int i = 0;
	int l = 0;

	text = "\n\n\n\n\nAnswer the questions to generate your avatar!\n\n\n\n\n";

	//1
	while (choice != 1 && choice != 2) {
	    text += "\n\nWould you hug a stranger?\n";
	    text += "\t1: Yeah, why not.\n";
	    text += "\t2: Ew, no.\n";

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
	    x += 1;
	    c += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    l += 1;
	    i += 1;
	    choice = 0;
	}

	//2
	while (choice != 1 && choice != 2) {
	    text += "\n\nAre you active or a lazy potato?\n";
	    text += "\t1: Mostly active, a little potato.\n";
	    text += "\t2: A little active, mostly potato.\n";

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
	    x += 1;
	    l += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    c += 1;
	    i += 1;
	    choice = 0;
	}

	//3
	while (choice != 1 && choice != 2) {
	    text += "\n\nIf you could, would you take over the world?\n";
	    text += "\t1: Yeah, sounds cool.\n";
	    text += "\t2: No, okay, maybe a little.\n";

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
	    x += 1;
	    i += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    c += 1;
	    l += 1;
	    choice = 0;
	}

	//4
	while (choice != 1 && choice != 2) {
	    text += "\n\nAre you good at keeping secrets?\n";
	    text += "\t1: Sure, there was that one time when...\n";
	    text += "\t2: I guess.\n";

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
	    x += 1;
	    c += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    l += 1;
	    i += 1;
	    choice = 0;
	}

	//5
	while (choice != 1 && choice != 2) {
	    text += "\n\nEvil-o-meter?\n";
	    text += "\t1: Secretly evil, but outwardly nice.\n";
	    text += "\t2: Evil, of course.\n";

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
	    x += 1;
	    l += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    c += 1;
	    i += 1;
	    choice = 0;
	}	

	//6
	while (choice != 1 && choice != 2) {
	    text += "\n\nAre you an honest person?\n";
	    text += "\t1: Maybe.\n";
	    text += "\t2: Yeah, most of the time.\n";

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
	    x += 1;
	    i += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    l += 1;
	    c += 1;
	    choice = 0;
	}

	//7
	while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	    text += "\n\nIs there anyone that you would die for?\n";
	    text += "\t1: Yes.\n";
	    text += "\t2: No.\n";
	    text += "\t3: I'm not sure.\n";
	    text += "\t4: Never really thought about it.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.\n\n\n\n\n");
	    }
	}

	if (choice == 1) {
	    l += 1;
	    choice = 0;
	}

	if (choice == 2) {
	    x += 1;
	    choice = 0;
	}

	if (choice == 3) {
	    c += 1;
	    choice = 0;
	}

	if (choice == 4) {
	    i += 1;
	    choice = 0;
	}

	ArrayList<Comparable> values = new ArrayList<Comparable>(4);
	values.add(c);
	values.add(x);
	values.add(i);
	values.add(l);

	selectionSort(values);
	
	String winner = "";

	int numofwinners = 0;

	if (c == values.get(3)) {
	    numofwinners += 1;
	    winner = C.get((int)(Math.random() * 4));
	}
	if (x == values.get(3)) {
	    if (numofwinners > 0) { 
		if (((int)(Math.random() * 10)) > 4) {
		    winner = X.get((int)(Math.random() * 4));
		}
	    }
	    else {
		winner = X.get((int)(Math.random() * 4));
		numofwinners += 1;
	    }
	}
	if (i == values.get(3)) {
	    if (numofwinners > 0) { 
		if (((int)(Math.random() * 10)) > 4) {
		    winner = I.get((int)(Math.random() * 4));
		}
	    }
	    else {
		winner = I.get((int)(Math.random() * 4));
		numofwinners += 1;
	    }
	}
	if (l == values.get(x)) {
	    if (numofwinners > 0) { 
		if (((int)(Math.random() * 10)) > 4) {
		    winner = L.get((int)(Math.random() * 4));
		}
	    }
	    else {
		winner = I.get((int)(Math.random() * 4));
		numofwinners += 1;
	    }
	}

	text = "\n\n\n\n\nYour avatar is...";
	text += "\n\n\n\t" + winner + "\n\n\n";
	
    }	

    public static void selectionSort( ArrayList<Comparable> data) {
	ArrayList<Comparable> values = new ArrayList<Comparable>(data.size());
	for (Comparable x : data) {
	    values.add(x);
	}
	int p = data.size()-1;
	int ctr = 0;
	while (p > 0) {
	    Comparable a = min(values);
	    int b = data.indexOf(a);
	    for (int x = b; x > ctr; x--) {
		data.set(x, data.get(x-1));
	    }
	    data.set(ctr, a);
	    values.remove(b-ctr);
	    p--;
	    ctr++;
	}
    }

    public static Comparable min( ArrayList<Comparable> data ) {
	Comparable smallest = data.get(0);
	for (Comparable x : data) {
	    if (x.compareTo(smallest) < 0) {
		smallest = x;
	    }
	}
	return smallest;
    }
	
    public static void main(String[] args) {
	Kanimop jubjubjub = new Kanimop();
    }



}
