// MAIN PROJECT FILE


// IMPORTED PACKAGES
import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;


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
	retrieveAvatars();
	text = "\nWelcome to Kanimop!";
	System.out.println(text);



	while ( choice != 1 && choice != 2 ) {

	    text = "\n\n\n\n\nWould you like to use Kanimop?\n";
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

		user = new Avatar(name,pass);
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
		//+++++++++++++++++++++++++++++++++++++++
		addToCSV(name, pass);
		//+++++++++++++++++++++++++++++++++++++++
		
		text = "\n\n\n\n\nHurray, you've successfully created an avatar!!\n";
		text += "Now go on to take a quiz.\n";
		    
		System.out.print(text);

		//~~~~~~~~~~~~~~~~~~~~~
		
		quiz();
	    }
	}



	if ( choice == 2 ) {
	    choice = 0;
	    text = "\n\n\n\n\nSee you next time!\n";
	    System.out.println(text);
	}
    }

    // RETRIEVE DATA
    public void retrieveAvatars() {
	try {
	    String csv = "Accounts.csv";
	    CSVReader reader = new CSVReader(new FileReader(csv));

	    List<String[]> content =  reader.readAll();
	    content.remove(0);
	
	    for (String[] x : content) {
		String temp = x[0];
		avatarList.add( new Avatar(temp,x[1]) );
		avatarList.get(avatarList.size()-1).setAnimePersona(x[2]);
		avatarList.get(avatarList.size()-1).setKpopPersona(x[3]);
		avatarList.get(avatarList.size()-1).setTotalAnime(Integer.parseInt(x[4]));
		avatarList.get(avatarList.size()-1).setTotalKpop(Integer.parseInt(x[5]));
	    }

	    reader.close();
	}
	catch ( IOException ioe ) { }
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

    // WRITE TO CSV
    public void addToCSV(String n, String p) {
	try {
	    String csv = "Accounts.csv";
	    //with true, appends; without true, overwrites 
	    CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
	
	    String[] record = {n,p,"N/A","N/A","0","0"};
	    writer.writeNext(record);

	    writer.close();
	}
	catch ( IOException ioe ) { }
    }

    // OVERWRITE CSV DATA
    public void overwriteCSV(String ap, String kp, String ta, String tk) {
	try {
	    String csv = "Accounts.csv";

	    CSVReader reader = new CSVReader(new FileReader(csv));
	    List<String[]> content =  reader.readAll();
	    String[] header = content.get(0);
	    content.remove(0);

	    reader.close();

	    String tempPass = "";
	    for ( Avatar x : avatarList ) {
		if ( user.getUName().equals(x.getUName()) ) { 
		    user = x;
		    tempPass = user.getUPass();
		}
	    }
	    
	    String[] newLine = {user.getUName(),tempPass,ap,kp,ta,tk};
	    for (int x = 0; x < content.size(); x++) {
		String temp = content.get(x)[0];
		if (user.getUName().equals(temp)) {
		    content.set(x, newLine);
		}
	    }

	    content.add(0, header);
	    
	    CSVWriter writer = new CSVWriter(new FileWriter(csv));
	
	    writer.writeAll(content);

	    writer.close();
	}
	catch ( IOException ioe ) { }
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
	    kpopQuiz();
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

	if (c == values.get(0)) {
	    numofwinners += 1;
	    winner = C.get((int)(Math.random() * 4));
	}
	if (x == values.get(0)) {
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
	if (i == values.get(0)) {
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
	if (l == values.get(0)) {
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
	overwriteCSV(user.getAnimePersona(),user.getKpopPersona(),""+user.getTotalAnime(),""+user.getTotalKpop());
	text = "\n\n\n\n\nYour avatar is...";
	text += "\n\n\n\t" + winner + "\n\n\n";
				
	System.out.println(text);
	
	if (winner.equals("Haruhi")) {
    	    text = "Haruhi is from the anime: Ouran High School Host Club.\n\n";
    	    text += "She is forced to join Ouran Academy's host club of handsome boys after breaking an expensive vase.\n\n";
       	    text += "She has a straightforward nature and believes that gender doesn't define your choices.\n\n";
    	    text += "Her character is strong and understanding, just like you!\n\n";
    	    text += "Read more about your character here: http://ouran.wikia.com/wiki/Haruhi_Fujioka\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Kaori")) {
    	    text = "Kaori is from the anime: Your Lie In April.\n\n";
    	    text += "She is a violinist who helps a dear friend return to the piano world after his mother's death.\n\n";
    	    text += "She is often friendly and encouraging, but is also independent, unpredictable, and short-tempered.\n\n";
    	    text += "Her character is passionate and powerful, just like you!\n\n";
    	    text += "Read more about your character here: http://shigatsu-wa-kimi-no-uso.wikia.com/wiki/Kaori_Miyazono\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Teresa")) {
       	    text = "Teresa is from the anime: Claymore.\n\n";
    	    text += "She is the 182nd Claymore of the 77th generation in the Organization, known to be strongest.\n\n";
    	    text += "She guides the main character and slaughters her enemies with a smile, earning the nickname 'Teresa of the Faint Smile'.\n\n";
    	    text += "Her character is often ruthless, but also caring, just like you!\n\n";
    	    text += "Read more about your character here: http://claymore.wikia.com/wiki/Teresa\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Gintoki")) {
     	    text = "Gintoki is from the anime: Gintama.\n\n";
    	    text += "He is the president of the Yorozuya Gin-Chan and is a highly skilled samurai.\n\n";
    	    text += "He is extremely lazy, often imparting wise, sage-like advice that makes no sense, but his personality attracts friends.\n\n";
    	    text += "His character is dorky but charismatic, just like you!\n\n";
    	    text += "Read more about your character here: http://gintama.wikia.com/wiki/Sakata_Gintoki\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Kise")) {
    	    text = "Kise is from the anime: Kuroko no Basket.\n\n";
    	    text += "He is part of the Generation of Miracles Basketball Players and also works as a model with a pretty face.\n\n";
    	    text += "He has a very outgoing personality and tries to be friends with everybody, while he can also be competitive and stubborn.\n\n";
    	    text += "His character is funny and lovable, just like you!\n\n";
    	    text += "Read more about your avatar here: http://kurokonobasuke.wikia.com/wiki/Ry%C5%8Dta_Kise\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Yuno")) {
    	    text = "Yuno is from the anime: Future Diary.\n\n";
    	    text += "She is known as 'Second' in a Survival Game and she is the owner of a stalker diary all about the main character she loves.\n\n";
       	    text += "She is sweet and shy around main character, but is actually a ruthless, calculating psychopath.\n\n";
    	    text += "Her character is crazy and dedicated, just like you!\n\n";
    	    text += "Read more about your character here: http://futurediary.wikia.com/wiki/Yuno_Gasai\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Izaya")) {
    	    text = "Izaya is from the anime: Durarara!!\n\n";
    	    text += "He is a powerful information broker and gives information for his own enjoyment, claiming to love the entire human race.\n\n";
    	    text += "He greatly enjoys putting people in enjoyable or chaotic situations in order to observe their reactions.\n\n";
    	    text += "His character is exciting and unique, just like you!\n\n";
    	    text += "Read more about your character here: http://durarara.wikia.com/wiki/Izaya_Orihara\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Kaneki")) {
       	    text = "Kaneki is from the anime: Tokyo Ghoul.\n\n";
    	    text += "He was a human living a normal life until he has ghoul parts transplanted in him and became a One-Eyed Ghoul.\n\n";
    	    text += "After being tortured, he underwent a drastic personality change to protect the ones precious to him and exterminate enemies.\n\n";
    	    text += "His character is adapting and straightforward, just like you!\n\n";
    	    text += "Read more about your character here: http://tokyoghoul.wikia.com/wiki/Ken_Kaneki\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Shiro")) {
     	    text = "Shiro is from the anime: No Game No Life.\n\n";
    	    text += "She is a genius in logic and problems, but has difficulty understanding emotions or behaviour.\n\n";
    	    text += "She is shown to have a dry and somewhat twisted sense of humor, is addicted to games and is extremely attached to her brother.\n\n";
    	    text += "Her character is cute and intelligent, just like you!\n\n";
    	    text += "Read more about your character here: http://gintama.wikia.com/wiki/Sakata_Gintoki\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Alice")) {
    	    text = "Alice is from the anime: Pandora Hearts.\n\n";
    	    text += "She is introduced as the B-Rabbit or Blood-Stained Black Rabbit and helps the main character while searching for her lost memories.\n\n";
    	    text += "She is cold and rude at the start and turns out to be hotheaded, loud spoken and blunt. However she is powerful and wants to do what's right.\n\n";
    	    text += "Her character is simple and awesome, just like you!\n\n";
    	    text += "Read more about your avatar here: http://pandorahearts.wikia.com/wiki/Alice\n\n";
    	    System.out.print(text);
        }

        if (winner.equals("Homura")) {
    	    text = "Homura is from the anime: Puella Magi Madoka Magica.\n\n";
    	    text += "She gets caught in a horrific destiny to save the main character from her fate.\n\n";
       	    text += "She is shown to be very intelligent, athletic, distant, and cold because she understands suffering.\n\n";
    	    text += "Her character is loyal and unbelievable, just like you!\n\n";
    	    text += "Read more about your character here: http://madoka.wikia.com/wiki/Homura_Akemi\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Guila")) {
    	    text = "Guila is from the anime: Seven Deadly Sins.\n\n";
    	    text += "She is a powerful Holy Knight and a caring older sister that is sent to assassinate the protagonists.\n\n";
    	    text += "She is a very dedicated knight and is confident in her abilities in the best kind of way.\n\n";
    	    text += "Her character is intense and kind, just like you!\n\n";
    	    text += "Read more about your character here: http://nanatsu-no-taizai.wikia.com/wiki/Guila\n\n";
    	    System.out.print(text);
        }
 
        if (winner.equals("Kirito")) {
       	    text = "Kirito is from the anime: Sword Art Online.\n\n";
    	    text += "He was chosen as one of the 1,000 beta testers for the closed beta of the first ever virtual reality video game.\n\n";
    	    text += "After being trapped in the game, he fights his way through, calmly and fearlessly, still managing to enjoy the gaming world.\n\n";
    	    text += "His character is collected and talented, just like you!\n\n";
    	    text += "Read more about your character here: http://swordartonline.wikia.com/wiki/Kirito\n\n";
    	    System.out.print(text);
        }
  
        if (winner.equals("Ichigo")) {
     	    text = "Ichigo is from the anime: Bleach.\n\n";
    	    text += "He becomes a temporary soul reaper and has to fight countless enemies, including entire races of beings.\n\n";
    	    text += "Ichigo has a complex sense of honor; he seeks to exact revenge, often taunting, but maintaining the good within, also seen as an older brother figure.\n\n";
    	    text += "His character is fierce and evolving, just like you!\n\n";
    	    text += "Read more about your character here: http://bleach.wikia.com/wiki/Ichigo_Kurosaki\n\n";
    	    System.out.print(text);
        }
     
        if (winner.equals("Edward")) {
    	    text = "Edward is from the anime: Fullmetal Alchemist.\n\n";
    	    text += "He becomes the youngest State Alchemist in history by achieving his certification at age twelve, seeking to restore his armored-brother.\n\n";
    	    text += "Although he is often immature and rebellious, he shows his deeper nature of selflessness, unflinching loyalty, and great compassion.\n\n";
    	    text += "His character is deep and honest, just like you!\n\n";
    	    text += "Read more about your avatar here: http://fma.wikia.com/wiki/Edward_Elric\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("L")) {
    	    text = "L is from the anime: Death Note.\n\n";
    	    text += "He is a world-renowned detective (first, second and third best) who takes on the challenge of catching the serial killer known only as Kira.\n\n";
       	    text += "He is secretive, strange, odd but extremely, extremely intelligent with a sense of justice.\n\n";
    	    text += "His character is quirky and brilliant, just like you!\n\n";
    	    text += "Read more about your character here: http://deathnote.wikia.com/wiki/L_(character)\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Lelouch")) {
    	    text = "Lelouch is from the anime: Code Geass.\n\n";
    	    text += "He is the eleventh prince of the Holy Britannian Empire, the leader of the Black Knights and the key player in a rebellion.\n\n";
    	    text += "He pretends to be easygoing and kind, but in reality he is a calm, sophisticated, and arrogant aristocrat with great ambitions.\n\n";
    	    text += "His character is clever and ambitious, just like you!\n\n";
    	    text += "Read more about your character here: http://codegeass.wikia.com/wiki/Lelouch_vi_Britannia\n\n";
    	    System.out.print(text);
        }
      
        if (winner.equals("Itachi")) {
       	    text = "Itachi is from the anime: Naruto.\n\n";
    	    text += "He is a prodigy who joins a criminal organization after murdering his entire clan with the exception of his brother.\n\n";
    	    text += "He is quiet, insightful, distant, carrying himself in a polite, violent manner.\n\n";
    	    text += "His character is steel-hearted and soft-spoken, just like you!\n\n";
    	    text += "Read more about your character here: http://naruto.wikia.com/wiki/Itachi_Uchiha\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Mikasa")) {
     	    text = "Mikasa is from the anime: Attack on Titan.\n\n";
    	    text += "At the 104th Trainees Squad's graduation, she is ranked first in the class of Titan killers.\n\n";
    	    text += "After the murder of her family, she gains a cynical view that the world is cruel, and is blindly devoted to the main character whom she loves.\n\n";
    	    text += "Her character is sharp and devoted, just like you!\n\n";
    	    text += "Read more about your character here: http://shingekinokyojin.wikia.com/wiki/Mikasa_Ackerman\n\n";
    	    System.out.print(text);
        }
    
        if (winner.equals("Erza")) {
    	    text = "Erza is from the anime: Fairy Tail.\n\n";
    	    text += "She is an S-Class Mage of the Fairy Tail Guild and the strongest member of Team Natsu, with a dark past.\n\n";
    	    text += "She is a very strict person, often criticizing the bad behavior and habits of the other guild members, but also has a cute, innocent side. \n\n";
    	    text += "Her character is adorable and flawless, just like you!\n\n";
    	    text += "Read more about your avatar here: http://fairytail.wikia.com/wiki/Erza_Scarlet\n\n";
    	    System.out.print(text);
        }
    }	
			
    public void kpopQuiz() {
				
	ArrayList<String> C = new ArrayList<String>(Arrays.asList("Jimin", "Suzy", "Yoseob", "Sunggyu", "Daehyun"));
	ArrayList<String> X = new ArrayList<String>(Arrays.asList("Amber", "Jackson", "Eunji", "Minah", "Sungjae"));
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
	    text = "How do you look?\n";
	    text += "\t1: I look good.\n";
	    text += "\t2: Mirrors love me.\n";
			
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
	    i += 1;
	    c += 1;
	    choice = 0;
	}
			
	if (choice == 2) {
	    l += 1;
	    x += 1;
	    choice = 0;
	}
			
	//2
	while (choice != 1 && choice != 2) {
	    text = "\n\n\n\n\nWhich is more like you?\n";
	    text += "\t1: I'm a leader, rapper, composer, dreamer.\n";
	    text += "\t2: I'm a singer, dancer, smiler, rocker.\n";
			
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
	    i += 1;
	    l += 1;
	    choice = 0;
	}
			
	if (choice == 2) {
	    c += 1;
	    x += 1;
	    choice = 0;
	}
			
	//3
	while (choice != 1 && choice != 2) {
	    text = "\n\n\n\n\nWhich would you rather be?\n";
	    text += "\t1: The most fun person in the world.\n";
	    text += "\t2: The most famous person in the world.\n";
			
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
	    text = "\n\n\n\n\nWhich part of your body are you more confident in?\n";
	    text += "\t1: Pssh, my hair.\n";
	    text += "\t2: Duh, my personality.\n";
			
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
	    i += 1;
	    l += 1;
	    choice = 0;
	}
			
	if (choice == 2) {
	    x += 1;
	    c += 1;
	    choice = 0;
	}
			
	//5
	while (choice != 1 && choice != 2) {
	    text = "\n\n\n\n\nHow strong are you?\n";
	    text += "\t1: Strong enough to withstand pressure.\n";
	    text += "\t2: Strong enough to withhold anger.\n";
			
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
	    text = "\n\n\n\n\nHow trusting are you?\n";
	    text += "\t1: Trusting enough to be taken advantage of.\n";
	    text += "\t2: Trusting too little to be trusted.\n";
			
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
	    x += 1;
	    choice = 0;
	}
			
	if (choice == 2) {
	    l += 1;
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
			
	if (c == values.get(0)) {
	    numofwinners += 1;
	    winner = C.get((int)(Math.random() * 4));
	}
	if (x == values.get(0)) {
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
	if (i == values.get(0)) {
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
	if (l == values.get(0)) {
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
	overwriteCSV(user.getAnimePersona(),user.getKpopPersona(),""+user.getTotalAnime(),""+user.getTotalKpop());
	text = "\n\n\n\n\nYour avatar is...";
	text += "\n\n\n\t" + winner + "\n\n\n";
	
	System.out.println(text);
	
	if (winner.equals("Jimin")) {
    	    text = "Jimin is from the kpop girl group: AOA.\n\n";
    	    text += "She is the leader and main rapper of AOA.\n\n";
       	    text += "She looks young, is very cheerful and can have a childish personality when messing around.\n\n";
    	    text += "She's sweet and small, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/aoa-ace-of-angels-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Suzy")) {
    	    text = "Suzy is from the kpop girl group: Miss A.\n\n";
    	    text += "She is the main vocalist, maknae and visual of Miss A.\n\n";
       	    text += "She is quite well-known for her acting and is often called the nation's first love.\n\n";
    	    text += "She's pretty inside and out, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/miss-a-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Yoseob")) {
    	    text = "Yoseob is from the kpop boy group: BEAST.\n\n";
    	    text += "He is the main vocalist of BEAST.\n\n";
       	    text += "He is funny and likes to act cute on variety shows, not to mention good at soccer.\n\n";
    	    text += "He's endearing and popular, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/beast-b2st-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Sunggyu")) {
    	    text = "Sunggyu is from the kpop boy group: Infinite.\n\n";
    	    text += "He is the leader and main vocalist of Infinite.\n\n";
       	    text += "He has a judging personality at times, but cares about the people close to him and is pretty hilarious.\n\n";
    	    text += "He's witty and responsible, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/infinite-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Daehyun")) {
    	    text = "Daehyun is from the kpop boy group: BAP.\n\n";
    	    text += "He is the main vocalist and visual of BAP.\n\n";
       	    text += "He has one of the best voices in all of kpop, beautiful high notes and a crazy hyper personality.\n\n";
    	    text += "He's energetic (about food), just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/b-a-p-best-absolute-perfect-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Amber")) {
    	    text = "Amber is from the kpop girl group: f(x).\n\n";
    	    text += "She is the sub-vocalist, main dancer and main rapper of f(x).\n\n";
       	    text += "She's a tomboyish American idol that jokes around and honestly loves music and life.\n\n";
    	    text += "She's awesome and relatable, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/fx-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Jackson")) {
    	    text = "Jackson is from the kpop boy group: GOT7.\n\n";
    	    text += "He is the lead rapper, main dancer and sub-vocalist of GOT7.\n\n";
       	    text += "He's from Hong Kong, can speak multiple languages, is down-to-earth and insanely funny.\n\n";
    	    text += "He's the bestest everest, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/got7-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Eunji")) {
    	    text = "Eunji is from the kpop girl group: A Pink.\n\n";
    	    text += "She is the main vocalist of A Pink.\n\n";
       	    text += "She acted in dramas, has a majestic voice and smile!\n\n";
    	    text += "She's magical and majestic, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/a-pink-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Minah")) {
    	    text = "Minah is from the kpop girl group: Girl's Day.\n\n";
    	    text += "She is the main vocalist and visual of Girl's Day.\n\n";
       	    text += "She seems easygoing at first, but is often more timid than most and is super cute.\n\n";
    	    text += "She's bubbly and cheerful, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/girls-day-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Sungjae")) {
    	    text = "Sungjae is from the kpop boy group: BTOB.\n\n";
    	    text += "He is the main vocalist, sub rapper and maknae of BTOB.\n\n";
       	    text += "He has a childish, friendly personality and shows affection for other people.\n\n";
    	    text += "He's playful, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/btob-born-to-beat-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Taeyeon")) {
    	    text = "Taeyeon is from the kpop girl group: Girl's Generation.\n\n";
    	    text += "She is the leader and main vocalist of Girl's Generation.\n\n";
       	    text += "She released a solo album and is praised for her multiple talents as an all-rounded all-star!\n\n";
    	    text += "She's like a elegant, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/girls-generation-snsd-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Jungkook")) {
    	    text = "Jungkook is from the kpop boy group: BTS.\n\n";
    	    text += "He is the main vocalist, lead dancer, rapper and maknae of BTS.\n\n";
       	    text += "He's one of the youngest idols and is called the Golden Maknae for being good at everything including art and sports.\n\n";
    	    text += "He's one-of-a-kind, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/bts-bangtan-boysbulletproof-boy-scouts-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Baekhyun")) {
    	    text = "Baekhyun is from the kpop boy group: EXO.\n\n";
    	    text += "He is the main vocalist of EXO.\n\n";
       	    text += "He's known for being a jokester, social, talkative, funny, friendly and handsome with a powerful voice.\n\n";
    	    text += "He's talented and likable, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/exo-k-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Hani")) {
    	    text = "Hani is from the kpop girl group: EXID.\n\n";
    	    text += "She is the lead vocalist of EXID.\n\n";
       	    text += "She is often credited with EXID's boom in popularity, their sexy songs and her captivating personality.\n\n";
    	    text += "She's sexy, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/exid-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Taemin")) {
    	    text = "Taemin is from the kpop boy group: SHINee.\n\n";
    	    text += "He is the lead vocalist, main dancer and maknae of SHINee.\n\n";
       	    text += "Debuting at one of the youngest ages, Taemin has essentially lived his life as an idol, and now he is promoting solo activities as well.\n\n";
    	    text += "He's come a long way, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/shinee-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("G-Dragon")) {
    	    text = "G-Dragon is from the kpop boy group: BIG BANG.\n\n";
    	    text += "He is the leader, main rapper and visual of BIG BANG.\n\n";
       	    text += "Probably the most popular idol around, GD has been in entertainment for a long time, expressing a unique style.\n\n";
    	    text += "He's hardworking and different, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/big-bang-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("CL")) {
    	    text = "CL is from the kpop girl group: 2NE1.\n\n";
    	    text += "She is the leader, main rapper and main vocalist of 2NE1.\n\n";
       	    text += "She has made it big internationally and is one of the most famous korean rappers in the industry.\n\n";
    	    text += "She's a legend, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/2ne1-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Hyuna")) {
    	    text = "Hyuna is from the kpop girl group: 4Minute.\n\n";
    	    text += "She is the main rapper, main dancer and visual of 4Minute.\n\n";
       	    text += "She made it big in Psy's music video Gangnam Style, then formed a subunit and finally is promoting solo activities.\n\n";
    	    text += "She's working hard, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/girl-groups/4minute-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Heechul")) {
    	    text = "Heechul is from the kpop boy group: Super Junior.\n\n";
    	    text += "He is a vocalist, rapper and visual of Super Junior.\n\n";
       	    text += "He's probably the craziest korean idol for being so open and born for entertainment.\n\n";
    	    text += "He's eccentric, just like you!\n\n";
    	    text += "Read more about your idol here: https://sumandu.wordpress.com/kpop-profiles/boy-groups/super-junior-profile/\n\n";
    	    System.out.print(text);
        }
        
        if (winner.equals("Hyorin")) {
    	    text = "Hyorin is from the kpop group: SISTAR.\n\n";
    	    text += "She is the leader, main vocalist and visual of SISTAR.\n\n";
       	    text += "She's hyper and energetic, has made her own solo debut, and has tried rapping as well.\n\n";
    	    text += "She's cool, just like you!\n\n";
    	    text += "Read more about your idol here:https://sumandu.wordpress.com/kpop-profiles/girl-groups/sistar-sisters-and-stars-profile/\n\n";
    	    System.out.print(text);
        }
        
        choice = 0;
        String search = "";
        /*
        while () {
	    text = "\n\n\n\n\nType in the anime / kpop group that you would like to search for!\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		search = in.readLine();
	    }
	    catch ( Exception e ) { }
	    
	    //check if anime / kpop exists
	    if (  ) { //does not exist
		System.out.print("\n\n\n\n\nThat does not exist. Would you like to add this to your list?");
		
		//idk how to add the anime / kpop?
	    }	    
	}

//anime exists

	while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
	    text = "\n\n\n\n\nWhat would you like to do?\n";
	    text += "\t1: Update rating.\n";
	    text += "\t2: Update number of episodes watched.\n";
	    text += "\t1: Edit/Add Review\n";
	    text += "\t2: Change your favorite character.\n";
	    text += "\t1: Go back!\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1, 2, 3, 4 or 5 to continue.");
	    }
	}

	if (choice == 1) {
	}

	if (choice == 2) {
	}
	
	if (choice == 3) {
	}
	
	if (choice == 4) {
	}
	
	if (choice == 5) {
	}
	
	
//kpop group exists

	while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
	    text = "\n\n\n\n\nWhat would you like to do?\n";
	    text += "\t1: Update rating.\n";
	    text += "\t2: Update number of title songs.\n";
	    text += "\t1: Edit/Add Review\n";
	    text += "\t2: Change your favorite member.\n";
	    text += "\t1: Go back!\n";
	    
	    text += ">> ";
	    System.out.print(text);
	    
	    try {
		choice = Integer.parseInt( in.readLine() );
	    }
	    catch ( Exception e ) { }
	    if ( choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
		System.out.print("\n\n\n\n\nSorry! You need to pick 1, 2, 3, 4 or 5 to continue.");
	    }
	}

	if (choice == 1) {
	}

	if (choice == 2) {
	}
	
	if (choice == 3) {
	}
	
	if (choice == 4) {
	}
	
	if (choice == 5) {
	}
	*/
        
	while (choice != 1 && choice != 2) {
	    text = "\n\n\n\n\nTry our Naruto demo!\n";
	    text += "\t1: YES!\n";
	    text += "\t2: No thanks!\n";
	    
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
	    Anime Naruto = new Anime();
   	    Naruto.setName("Naruto");
   	    Naruto.demo();
	}

	if (choice == 2) {
	    choice = 0;
	    text = "\n\n\n\n\nSee you later then!\n";
	    System.out.print(text);
	}
}


    public static void main(String[] args) {
	Kanimop jubjubjub = new Kanimop();
    }



}
