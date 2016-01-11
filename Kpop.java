// KPOP SKELETON IN DATABASE

public class Kpop {


    //INSTANCE VARIABLES
    
    public String groupName;

    public String gender;

    public String company;

    public String fanBase;

    public String fanName;

    public String[] members;

    public double rating;

    public int titleSongs;

    public String[] reviews;

    public String description;

    //CONSTRUCTORS

    public String groupName() {
	return groupName;
    }

    public String gender() {
	return gender;
    }

    public String company() {
	return company;
    }

    public String fanBase() {
	return fanBase;
    }

    public String fanName() {
	return fanName;
    }

    public String[] members() {
	return members;
    }

    public double rating() {
	return rating;
    }

    public int titleSongs() {
	return titleSongs;
    }

    public String[] reviews() {
	return reviews;
    }

    public String description() {
	return description;
    }

    //METHODS

    public void groupName(String input) {
	groupName = input;
    }

    public void gender(String input) {
	gender = input;
    }

    public void company(String input) {
	company = input;
    }

    public void fanBase(String input) {
	fanBase = input;
    }

    public void fanName(String input) {
	fanName = input;
    }

    public void members(String[] input) {
	members = input;
    }

    public void rating(double input) {
	rating = input;
    }

    public void titleSongs(int input) {
	titleSongs = input;
    }

    public void reviews(String[] input) {
	reviews = input;
    }

    public void description(String input) {
	description = input;
    }

    //ANIMES

    /*
    public void set() {
	
	groupName = "GOT7";
	gender = "male";
	company = "JYP Entertainment";
	fanBase = "N/A";
	fanName = "IGOT7";
	members = {"Im Jaebum", "Park Jinyoung", "Mark Tuan", "Jackson Wang", "Kumpimook Bwuakul Bambam", "Choi Youngjae", "Kim Yugyeom"};
	rating = 5;
	titleSongs = 5;
	reviews = {"Love them!", "Ew, they suck."};
	description = "JJProject joined to make them. Doing well lately.";

    }
    */



    public static void main(String[] args) {
	Kpop GOT7 = new Kpop();
	//GOT7.groupName("GOT7");

	GOT7.set();

	System.out.println(GOT7.groupName());
	//System.out.println(
	//System.out.println(
	//System.out.println(
	//System.out.println(
	//System.out.println(
	
    }
}    
