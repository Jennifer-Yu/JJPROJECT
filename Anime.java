// ANIME SKELETON IN DATABASE

import java.util.ArrayList;

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
    }

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

    //MAIN METHOD FOR TESTING

    public static void main(String[] args) {

	Anime Naruto = new Anime();
	Naruto.setName("Naruto");
	System.out.println(Naruto.getName());

    }

}    
