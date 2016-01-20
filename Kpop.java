// KPOP SKELETON IN DATABASE

import java.util.ArrayList;

public class Kpop {


    //INSTANCE VARIABLES
    
    private String groupName;

    private String gender;

    private String company;

    private String fanBase;

    private String fanName;

    private ArrayList<String> members;

    private int numMembers;

    private double rating;

    private int titleSongs;

    private ArrayList<String> reviews;

    private String description;


    //CONSTRUCTORS

    public Kpop() {

	groupName = "Name of Group";
	gender = "Girl Group or Boy Group?";
	company = "Company Name";
	fanBase = "Name of Fanbase";
	fanName = "Name of Fans";
	members = new ArrayList<String>();
	rating = 0;
	titleSongs = 0;
	reviews = new ArrayList<String>();
	description = "Description";

    }


    //ACCESSORS

    public String getGroupName() {
	return groupName;
    }

    public String getGender() {
	return gender;
    }

    public String getCompany() {
	return company;
    }

    public String getFanBase() {
	return fanBase;
    }

    public String getFanName() {
	return fanName;
    }

    public ArrayList<String> getMembers() {
	return members;
    }

    public int getNumMembers() {
	return members.size();
    }

    public double getRating() {
	return rating;
    }

    public int getTitleSongs() {
	return titleSongs;
    }

    public ArrayList<String> getReviews() {
	return reviews;
    }

    public String getDescription() {
	return description;
    }


    //MUTATORS

    public void setGroupName(String input) {
	groupName = input;
    }

    public void setGender(String input) {
	gender = input;
    }

    public void setCompany(String input) {
	company = input;
    }

    public void setFanBase(String input) {
	fanBase = input;
    }

    public void setFanName(String input) {
	fanName = input;
    }

    public void setMembers(ArrayList<String> input) {
	members = input;
    }

    public void setNumMembers(int input) {
	numMembers = input;
    }

    public void setRating(double input) {
	rating = input;
    }

    public void setTitleSongs(int input) {
	titleSongs = input;
    }

    public void setReviews(ArrayList<String> input) {
	reviews = input;
    }

    public void setDescription(String input) {
	description = input;
    }


    //MAIN METHOD FOR TESTING    

    public static void main(String[] args) {

	Kpop GOT7 = new Kpop();
	GOT7.setGroupName("GOT7");
	System.out.println(GOT7.getGroupName());
	
    }

}    
