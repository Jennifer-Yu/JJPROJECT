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
    private ArrayList<Avatar> avatarList;
    private Avatar user;


    // DEFAULT CONSTRUCTOR
    public Kanimop() {
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	avatarList = new ArrayList<Avatar>();
	start();
    }



    // START
    public void start() {
	String name = "";
	String pass = "";
	String check = "";
	text = "\nWelcome to Kanimop!";
	System.out.println(text);



	while ( choice != 1 && choice != 2 ) {

	    text = "\n\n\n\n\nWould you like to create a new avatar?\n";
	    text += "\t1: Yeah, let's go!\n";
	    text += "\t2: Nah, maybe later.\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
		    System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
		}
	    }

	    if (choice == 1) {
		choice = 0;
		//~~~~login check~~~~~
		text = "\n\n\n\n\nType in your username.\n";
		
		text += ">> ";
		System.out.print(text);
		
		try {
		    name = in.readLine();
		}
		catch ( IOException e ) { }

		while ( !exists(name) ) { //checks if avatar exists
		    text = "\n\n\n\n\nThis avatar does not exist. Try again. Enter your username.\n";
		    
		    text += ">> ";
		    System.out.print(text);
		    
		    try {
			name = in.readLine();
		    }
		    catch ( IOException e ) { }
		}

		setAvatar(name);

		text = "\n\n\n\n\nType in your password.\n";
		
		text += ">> ";
		System.out.print(text);
			
		try {
		    pass = in.readLine();
		}
		catch ( IOException e ) { }
			
		while ( !matches(pass, user.getUPass()) ) {
		    text = "\n\n\n\n\nTry again. Type in your password.\n";
		
		    text += ">> ";
		    System.out.print(text);
			
		    try {
			pass = in.readLine();
		    }
		    catch ( IOException e ) { }
		}

		//setAvatar(name);
		text = "\n\n\n\n\nHurray, you've successfully logged in!!\n";
		text += "Now go on to take a quiz.\n";
		    
		System.out.print(text);
		
		//~~~~~~~~~~~~~~~~~~~~~
		
		quiz();
	    }
	    
	    if (choice == 2) {
		choice = 0;
		//~~~~create avatar~~~~
		text = "\n\n\n\n\nType in the name you want to be called.\n";
		
		text += ">> ";
		System.out.print(text);
		
		try {
		    name = in.readLine();
		}
		catch ( IOException e ) { }

		while ( exists(name) ) { //keep doing this until name is unique
		    text = "\n\n\n\n\nSorry, this name is taken. Try a different name.\n";
		
		    text += ">> ";
		    System.out.print(text);
		
		    try {
			name = in.readLine();
		    }
		    catch ( IOException e ) { }
		}

		setAvatar(name);
		
		text = "\n\n\n\n\nType in your desired password.\n";
		
		text += ">> ";
		System.out.print(text);
			
		try {
		    pass = in.readLine();
		}
		catch ( IOException e ) { }

		text = "\n\n\n\n\nReenter in your desired password.\n"; //verify pass
		
		text += ">> ";
		System.out.print(text);
			
		try {
		    check = in.readLine();
		}
		catch ( IOException e ) { }

		while ( !matches(pass,check) ) {
		    text = "\n\n\n\n\nTry again. Reenter in your desired password.\n";
		
		    text += ">> ";
		    System.out.print(text);
			
		    try {
			check = in.readLine();
		    }
		    catch ( IOException e ) { }
		}

		avatarList.add(new Avatar(name,pass));
		//setAvatar(name);	
		text = "\n\n\n\n\nHurray, you've successfully created an avatar!!\n";
		text += "Now go on to take a quiz.\n";
		    
		System.out.print(text);

		//~~~~~~~~~~~~~~~~~~~~~
		
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

    // NAME CHECK
    public boolean exists(String name) {
	for ( Avatar x : avatarList ) {
	    if ( name.equals(x.getUName()) ) { //checks if avatar exists
		return true;
	    }
	}
	return false;
    }

    // PASSWORD CHECK
    public boolean matches(String pass, String check) {
	if ( pass.equals(check) ) {
	    return true;
	}
	return false;
    }

    // SET AVATAR
    public void setAvatar(String aName) {
	for ( Avatar x : avatarList ) {
	    if ( aName.equals(x.getUName()) ) { 
		user = x;
	    }
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
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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

	text = "\n\n\n\n\nAnswer the questions to generate your avatar!\n";
	System.out.println(text);

	//1
	while (choice != 1 && choice != 2) {
	    text = "Would you hug a stranger?\n";
	    text += "\t1: Yeah, why not.\n";
	    text += "\t2: Ew, no.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nAre you active or a lazy potato?\n";
	    text += "\t1: Mostly active, a little potato.\n";
	    text += "\t2: A little active, mostly potato.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nIf you could, would you take over the world?\n";
	    text += "\t1: Yeah, sounds cool.\n";
	    text += "\t2: No, okay, maybe a little.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nAre you good at keeping secrets?\n";
	    text += "\t1: Sure, there was that one time when...\n";
	    text += "\t2: I guess.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nEvil-o-meter?\n";
	    text += "\t1: Secretly evil, but outwardly nice.\n";
	    text += "\t2: Evil, of course.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nAre you an honest person?\n";
	    text += "\t1: Maybe.\n";
	    text += "\t2: Yeah, most of the time.\n";

	    text += ">> ";
	    System.out.print(text);

	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nIs there anyone that you would die for?\n";
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
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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

	//System.out.println(c);
	//System.out.println(i);
	//System.out.println(x);
	//System.out.println(l);

	ArrayList<Comparable> values = new ArrayList<Comparable>(4);
	values.add(c);
	values.add(x);
	values.add(i);
	values.add(l);

	//for (Comparable yum : values) {
	//    System.out.print(yum + " ");
	//}

	int passes = 0;
	while (passes < 4) {
	    for (int ctr = 0; ctr < values.size()-1; ctr++) {
		if ((values.get(ctr)).compareTo(values.get(ctr+1)) < 0) {
		    values.set(ctr+1,values.set(ctr,values.get(ctr+1)));
		}
	    }
	    passes++;
	}

	//for (Comparable yum : values) {
	//    System.out.print(yum + " ");
	//}

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
	if (l == values.get(3)) {
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

	user.setAnimePersona(winner);
	text = "\n\n\n\n\nYour avatar is...";
	text += "\n\n\n\t" + winner + "\n\n\n";
				
	System.out.println(text);
    }	
			
    public void kpopQuiz() {
				
	ArrayList<String> C = new ArrayList<String>(Arrays.asList("Jimin", "Suzy", "Yoseob", "Sunggyu", "Daehyun"));
	ArrayList<String> X = new ArrayList<String>(Arrays.asList("Amber", "Jackson", "Eunji", "Minah", "Eunji"));
	ArrayList<String> I = new ArrayList<String>(Arrays.asList("Taeyeon", "Jungkook", "Baekhyun", "Hani", "Taemin"));
	ArrayList<String> L = new ArrayList<String>(Arrays.asList("G-Dragon", "CL", "Hyuna", "Heechul", "Hyorin"));
					
	int c = 0;
	int x = 0;
	int i = 0;
	int l = 0;
			
	text = "\n\n\n\n\nAnswer the questions to generate your avatar!\n";
	System.out.println(text);
			
	//1
	while (choice != 1 && choice != 2) {
	    text = "Would you hug a stranger?\n";
	    text += "\t1: Yeah, why not.\n";
	    text += "\t2: Ew, no.\n";
			
	    text += ">> ";
	    System.out.print(text);
			
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nAre you active or a lazy potato?\n";
	    text += "\t1: Mostly active, a little potato.\n";
	    text += "\t2: A little active, mostly potato.\n";
			
	    text += ">> ";
	    System.out.print(text);
			
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nIf you could, would you take over the world?\n";
	    text += "\t1: Yeah, sounds cool.\n";
	    text += "\t2: No, okay, maybe a little.\n";
			
	    text += ">> ";
	    System.out.print(text);
			
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nAre you good at keeping secrets?\n";
	    text += "\t1: Sure, there was that one time when...\n";
	    text += "\t2: I guess.\n";
			
	    text += ">> ";
	    System.out.print(text);
			
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nEvil-o-meter?\n";
	    text += "\t1: Secretly evil, but outwardly nice.\n";
	    text += "\t2: Evil, of course.\n";
			
	    text += ">> ";
	    System.out.print(text);
			
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nAre you an honest person?\n";
	    text += "\t1: Maybe.\n";
	    text += "\t2: Yeah, most of the time.\n";
			
	    text += ">> ";
	    System.out.print(text);
			
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 ) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
	    text = "\n\n\n\n\nIs there anyone that you would die for?\n";
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
		System.out.print("\n\n\n\n\nSorry! You need to pick 1 or 2 to continue.");
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
			
	//System.out.println(c);
	//System.out.println(i);
	//System.out.println(x);
	//System.out.println(l);
			
	ArrayList<Comparable> values = new ArrayList<Comparable>(4);
	values.add(c);
	values.add(x);
	values.add(i);
	values.add(l);
			
	//for (Comparable yum : values) {
	//    System.out.print(yum + " ");
	//}
			
	int passes = 0;
	while (passes < 4) {
	    for (int ctr = 0; ctr < values.size()-1; ctr++) {
		if ((values.get(ctr)).compareTo(values.get(ctr+1)) < 0) {
		    values.set(ctr+1,values.set(ctr,values.get(ctr+1)));
		}
	    }
	    passes++;
	}
			
	//for (Comparable yum : values) {
	//    System.out.print(yum + " ");
	//}
			
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
	if (l == values.get(3)) {
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
			
	user.setKpopPersona(winner);
	text = "\n\n\n\n\nYour avatar is...";
	text += "\n\n\n\t" + winner + "\n\n\n";
	
	System.out.println(text);
    }	

    public static void main(String[] args) {
	Kanimop jubjubjub = new Kanimop();
    }



}
