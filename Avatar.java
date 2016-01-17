// AVATAR SKELETON IN DATABASE

import java.util.ArrayList;
import java.util.Comparator;

public class Avatar {


    //INSTANCE VARIABLES
    
    private String uName;

    private ArrayList<Anime> animeList;

    private ArrayList<Kpop> kpopList;

    private String animePersona;

    private String kpopPersona;

    private int totalAnime;

    private int totalKpop;


    //CONSTRUCTORS
    
    public Avatar(String username) {

	uName = username;
	animeList = new ArrayList<Anime>();
	kpopList = new ArrayList<Kpop>();
	animePersona = "N/A"; // to be updated after quiz
	kpopPersona = "N/A"; // to be updated after quiz
	totalAnime = 0;
	totalKpop = 0;
	
    }


    //ANIME METHODS

    public void sortAnimeName() {
	Collections.sort(animeList, new Comparator<Anime>() {
		public int compare(final Anime a1, final Anime a2) {
		    return a1.getName().compareTo(a2.getName());	
		}
	    } );
    }

    public void sortAnimeRating() {
	Collections.sort(animeList, new Comparator<Anime>() {
		public int compare(final Anime a1, final Anime a2) {
		    return a1.getRating().compareTo(a2.getRating());
		}
	    } );
    }
	
    public String viewAnimeInfo(String animeName) {
	String retStr = "";
	for (Anime x : animeList) {
	    if (x.getName().equals(animeName)) {
		retStr += x.getName() +
		    "\nInformation:" +
		    "\n Alternative Titles: " + x.getAlternateName() +
		    "\n Episodes: " + x.getEpisodes() + 
		    "\n Producers: " +   +
		    +; //insert info
	    }
	}
	retStr = "Sorry, this anime is not on your list.";
	return retStr;
    }

    public void viewAnimeList() {
	System.out.println(uName + "\'s Anime List: ");
	for (Anime x : animeList) {
	    System.out.println(x.getName());
	}
	System.out.println("Anime Count: " + totalAnime);
    }

    //KPOP METHODS

    public void sortGroupName() {
	Collections.sort(kpopList, new Comparator<Kpop>() {
		public int compare(final Kpop k1, final Kpop k2) {
		    return k1.getName().compareTo(k2.getName());	
		}
	    } );
    }

    public void sortGroupRating() {
	Collections.sort(kpopList, new Comparator<Kpop>() {
		public int compare(final Kpop k1, final Kpop k2) {
		    return k1.getRating().compareTo(k2.getRating());
		}
	    } );
    }
    
    public String viewKpopInfo(String groupName) {
	String retStr = "";
	for (Kpop x : kpopList) {
	    if (x.getGroupName().equals(groupName)) {
		retStr += ; //insert info
	    }
	}
	retStr = "Sorry, this group is not on your list.";
	return retStr;
    }

    public void viewKpopList() {
	System.out.println(uName + "\'s Kpop Group List: ");
	for (Kpop x : kpopList) {
	    System.out.println(x.getGroupName());
	}
	System.out.println("Kpop Group Count: " + totalKpop);
    }


    //MAIN METHOD FOR TESTING

    public static void main(String[] args) {
	
    }

}
