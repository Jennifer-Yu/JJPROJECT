// ANIME SKELETON IN DATABASE

public class Anime {


    //INSTANCE VARIABLES
    
    public String japaneseName;

    public String englishName;

    public String[] genres;

    public String[] characters;

    public double rating;

    public int episodes;

    public String[] reviews;

    public String plot;

    //CONSTRUCTORS

    public String japaneseName() {
	return japaneseName;
    }

    public String englishName() {
	return englishName;
    }

    public String[] genres() {
	return genres;
    }

    public String[] characters() {
	return characters;
    }

    public double rating() {
	return rating;
    }

    public int episodes() {
	return episodes;
    }

    public String[] reviews() {
	return reviews;
    }

    public String plot() {
	return plot;
    }

    //METHODS

    public void japaneseName(String input) {
	japaneseName = input;
    }

    public void englishName(String input) {
	englishName = input;
    }

    public void genres(String[] input) {
	genres = input;
    }

    public void characters(String[] input) {
	characters = input;
    }

    public void rating(double input) {
	rating = input;
    }

    public void episodes(int input) {
	episodes = input;
    }

    public void reviews(String[] input) {
	reviews = input;
    }

    public void plot(String input) {
	plot = input;
    }

    //ANIMES

    /*
    public void set() {
	
	japaneseName = "Naruto";
	englishName = "N/A";
	genres = {"Action", "Ninjas", "Shounen"};
	characters = {"Naruto", "Sakura", "Sasuke"};
	rating = 5;
	episodes = 600;
	reviews = {"Loved it!", "Ew, sucked."};
	plot = "Ninjas and stuff.";

    }
    */



    public static void main(String[] args) {
	Anime Naruto = new Anime();
	//Naruto.japaneseName("Naruto");

	Naruto.set();

	System.out.println(Naruto.japaneseName());
	//System.out.println(
	//System.out.println(
	//System.out.println(
	//System.out.println(
	//System.out.println(
	
    }
}    
