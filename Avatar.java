// AVATAR SKELETON IN DATABASE

import java.io.*;
import java.util.*;

public class Avatar {


    //INSTANCE VARIABLES
    
    private String uName;

    private String uPass;

    private ArrayList<Anime> animeList;

    private ArrayList<Kpop> kpopList;

    private String animePersona;

    private String kpopPersona;

    private int totalAnime;

    private int totalKpop;


    //CONSTRUCTORS
    
    public Avatar(String username, String password) {

	uName = username;
	uPass = password;
	animeList = new ArrayList<Anime>();
	kpopList = new ArrayList<Kpop>();
	animePersona = "N/A"; // to be updated after quiz
	kpopPersona = "N/A"; // to be updated after quiz
	totalAnime = 0;
	totalKpop = 0;
	
    }


    //ACCESSORS

    public String getUName() {
	return uName;
    }

    public String getUPass() {
	return uPass;
    }

    public String getAnimePersona() {
	return animePersona;
    }

    public String getKpopPersona() {
	return kpopPersona;
    }

    public int getTotalAnime() {
	return animeList.size();
    }

    public int getTotalKpop() {
	return kpopList.size();
    }
    

    //MUTATORS

    public void setUPass(String pass) {
	uPass = pass;
    }

    public void setAnimePersona(String aPersona) {
	animePersona = aPersona;
    }

    public void setKpopPersona(String kPersona) {
	kpopPersona = kPersona;
    }

    public void setTotalAnime(int numA) {
	totalAnime = numA;
    }

    public void setTotalKpop(int numK) {
	totalKpop = numK;
    }
    

    //ANIME METHODS

    /* public void sortAnimeName() {
	Collections.sort(animeList, animeNameComparator);
    }
    
    public static Comparator<Anime> animeNameComparator = new Comparator<Anime>() {
		public int compare(Anime a1, Anime a2) {
		    String animeName1 = a1.getName().toUpperCase();
		    String animeName2 = a2.getName().toUpperCase();
		    
		    return animeName1.compareTo(animeName2);	
		}
		};

    public void sortAnimeRating() {
	Collections.sort(animeList, animeRatingComparator);
    }

    public static Comparator<Anime> animeRatingComparator = new Comparator<Anime>() {
	    public int compare(Anime a1, Anime a2) {
		double animeRating1 = a1.getRating();
		double animeRating2 = a2.getRating();
		
		return animeRating1.compareTo(animeRating2);
	    }
	    };*/

    public void animeSearch(String name) {
	ArrayList<String> nameList = new ArrayList<String>(animeList.size);
	for (Anime x : animeList) {
	    nameList.add(x.getName());
	}
	Collections.sort(nameList);
	int index = Collections.binarySearch(nameList,name);
	if (index == -1) {
	    System.out.println("Sorry. This entry does not exist.");
	}
	else {
	    Anime search = nameList.get(index);
	    viewAnimeInfo;
	}
    }
	
    public String viewAnimeInfo(String animeName) {
	String retStr = "";
	for (Anime x : animeList) {
	    if (x.getName().equals(animeName)) {
		retStr += x.getName() +
		    "\nInformation:" +
		    "\n Alternative Titles: " + x.getAlternateName() +
		    "\n Episodes: " + x.getNumEpisodes() + 
		    "\n Producers: " + "TO BE INSERTED NOT DONE"  +
		    "TO BE INSERTED NOT DONE"; //insert info
	    }
	}
	retStr = "Sorry, this anime is not on your list.";
	return retStr;
    }

    public String viewAnimeList() {
	String retStr = uName + "\'s Anime List: ";
	for (Anime x : animeList) {
	    retStr += x.getName();
	}
	retStr += "Anime Count: " + getTotalAnime();
	return retStr;
    }

    
    //KPOP METHODS

	    /* public void sortGroupName() {
	Collections.sort(kpopList, groupNameComparator);
    }

    public static Comparator<Kpop> groupNameComparator = new Comparator<Kpop>() {
	    public int compare(Kpop k1, Kpop k2) {
		String groupName1 = k1.getGroupName().toUpperCase();
		String groupName2 = k2.getGroupName().toUpperCase();
		
		return groupName1.compareTo(groupName2);	
	    }
	};



    public void sortGroupRating() {
	Collections.sort(kpopList, groupRatingComparator);
    }

    public static Comparator<Kpop> groupRatingComparator = new Comparator<Kpop>() {
	    public int compare(Kpop k1, Kpop k2) {
		String groupRating1 = k1.getRating();
		String groupRating2 = k2.getRating();
		
		return groupRating1.compareTo(groupRating2);	
	    }
	    };*/

    public void kpopSearch(String name) {
	ArrayList<String> groupNameList = new ArrayList<String>(kpopList.size);
	for (Kpop x : kpopList) {
	    groupNameList.add(x.getGroupName());
	}
	Collections.sort(groupNameList);
	int index = Collections.binarySearch(groupNameList,name);
	if (index == -1) {
	    System.out.println("Sorry. This entry does not exist.");
	}
	else {
	    Kpop search = groupNameList.get(index);
	    viewKpopInfo;
	}
    }
    
    public String viewKpopInfo(String groupName) {
	String retStr = "";
	for (Kpop x : kpopList) {
	    if (x.getGroupName().equals(groupName)) {
		retStr += "Group: " + x.getGroupName() +
		    "Type: " + x.getGender() +
		    "Company: " + x.getCompany() +
		    "Fanbase: " + x.getFanbase() +
		    "Fan Name: " + x.getFanName() +
		    "Members: " + x.returnAlStr(x.getMembers()) +
		    "Number of Members: " + x.getNumMembers()+
		    "Ratings: " + x.getRating() +
		    "Number of Title Songs: " + x.getTitleSongs()+
		    "Reviews: " + x.returnAlStr(x.getReviews())+
		    "Description: " + x.getDescription(); 
	    }
	}
	retStr = "Sorry, this group is not on your list.";
	return retStr;
    }

    public String viewKpopList() {
	String retStr = uName + "\'s Kpop Group List: ";
	for (Kpop x : kpopList) {
	    retStr += x.getGroupName();
	}
	retStr += "Kpop Group Count: " + getTotalKpop();
	return retStr; 
    }


    //METHODS
    public String viewProfile() {
	String retStr = uName + "\'s Profile:\n";
	retStr += "\t" + viewAnimeList() + "\n";
	retStr += "\tAnime Persona: " + animePersona + "\n";
	retStr += "\t" + viewKpopList() + "\n";
	retStr += "\tKpop Persona: " + kpopPersona + "\n";
	return retStr;
    }
    
    
    //MAIN METHOD FOR TESTING

    public static void main(String[] args) {
	
    }

}
