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

    public ArrayList<String> reviews;

    public String plot;

    //CONSTRUCTORS

    public Anime() {
	
	/*name = "Naruto";
	alternateName = "N/A";
	genres = {"Action", "Ninjas", "Shounen"};
	characters = {"Naruto", "Sakura", "Sasuke"};
	rating = 5;
	episodes = 600;
	reviews = {"Loved it!", "Ew, sucked."};
	plot = "Ninjas and stuff.";*/
	
	name = "Name";
	alternateName = "N/A";
	rating = 0;
	episodes = 0;
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

    public void setReviews(ArrayList<String> input) {
	reviews = input;
    }

    public void setPlot(String input) {
	plot = input;
    }

    //main method for testing

    public static void main(String[] args) {
	Anime Naruto = new Anime();
	//Naruto.name("Naruto");

	//Naruto.set();

	System.out.println(Naruto.name());
	//System.out.println(
	//System.out.println(
	//System.out.println(
	//System.out.println(
	//System.out.println(
	
    }
}    
