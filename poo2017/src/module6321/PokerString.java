package module6321;


public class PokerString {
	private String cards[] 
			= {"AC", "RC", "DC", "AP", "RP", "DP"};
	private int nbPlayers;

	public PokerString(int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}

	public String[] play() {
		String []res = new String[nbPlayers];

		for(int i=0;i<nbPlayers;i++) {
			int a = (int)(Math.random()*6);
			res[i] = cards[a];
		}

		return res;
	}
}
