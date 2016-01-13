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

    //METHODS

    public void viewAnimeList() {
	System.out.println(uName + "\'s Anime List: ");
	for (Anime x : animeList) {
	    System.out.println(x.getName());
	}
	System.out.println("Anime Count: " + totalAnime);
    }

    public void viewKpopList() {
	System.out.println(uName + "\'s Kpop Group List: ");
	for (Kpop x : kpopList) {
	    System.out.println(x.getName());
	}
	System.out.println("Kpop Group Count: " + totalKpop);
    }

    
}