package module6321;
public class PokerObjet {
	private static final short nbCards = 52;
	private Card cards[] = new Card[nbCards];
	private int nbPlayers;

	public PokerObjet(int nbPlayers) {
		this.nbPlayers = nbPlayers;
		initCards();
	}
	
	public Card[] play() {
		Card res[] = new Card[nbPlayers];
		int a;
		/* to do Check if there are enough 
		available cards return an empty array*/
		for(int i=0;i<nbPlayers;i++) {
			//random card 
			a = (int)(Math.random()*nbCards);
			//insure not played
			while(cards[a].isPlayed()){
				a = (int)(Math.random()*nbCards);
			}
			//distribute the card
			cards[a].distribute();
			res[i] = cards[a];
		}
		return res;
	}
	
	private void initCards() {
		cards[0] =  new Card("A", "Coeur");
		cards[1] =  new Card("R", "Coeur");
		cards[2] =  new Card("D", "Coeur");
		cards[3] =  new Card("V", "Coeur");
		cards[4] =  new Card("10", "Coeur");
		cards[5] =  new Card("9", "Coeur");
		cards[6] =  new Card("8", "Coeur");
		cards[7] =  new Card("7", "Coeur");
		cards[8] =  new Card("6", "Coeur");
		cards[9] =  new Card("5", "Coeur");
		cards[10] =  new Card("4", "Coeur");
		cards[11] =  new Card("3", "Coeur");
		cards[12] =  new Card("2", "Coeur");

		cards[13] =  new Card("A", "Pique");
		cards[14] =  new Card("R", "Pique");
		cards[15] =  new Card("D", "Pique");
		cards[16] =  new Card("V", "Pique");
		cards[17] =  new Card("10", "Pique");
		cards[18] =  new Card("9", "Pique");
		cards[19] =  new Card("8", "Pique");
		cards[20] =  new Card("7", "Pique");
		cards[21] =  new Card("6", "Pique");
		cards[22] =  new Card("5", "Pique");
		cards[23] =  new Card("4", "Pique");
		cards[24] =  new Card("3", "Pique");
		cards[25] =  new Card("2", "Pique");

		cards[26] =  new Card("A", "Carreau");
		cards[27] =  new Card("R", "Carreau");
		cards[28] =  new Card("D", "Carreau");
		cards[29] =  new Card("V", "Carreau");
		cards[30] =  new Card("10", "Carreau");
		cards[31] =  new Card("9", "Carreau");
		cards[32] =  new Card("8", "Carreau");
		cards[33] =  new Card("7", "Carreau");
		cards[34] =  new Card("6", "Carreau");
		cards[35] =  new Card("5", "Carreau");
		cards[36] =  new Card("4", "Carreau");
		cards[37] =  new Card("3", "Carreau");
		cards[38] =  new Card("2", "Carreau");

		cards[39] =  new Card("A", "Trefle");
		cards[40] =  new Card("R", "Trefle");
		cards[41] =  new Card("D", "Trefle");
		cards[42] =  new Card("V", "Trefle");
		cards[43] =  new Card("10", "Trefle");
		cards[44] =  new Card("9", "Trefle");
		cards[45] =  new Card("8", "Trefle");
		cards[46] =  new Card("7", "Trefle");
		cards[47] =  new Card("6", "Trefle");
		cards[48] =  new Card("5", "Trefle");
		cards[49] =  new Card("4", "Trefle");
		cards[50] =  new Card("3", "Trefle");
		cards[51] =  new Card("2", "Trefle");
	}

	/*
	public int  nbCardsAvailable() {
		int cpt=0;

		for(int i=0;i<cards.length;i++)
			if(!cards[i].isPlayed())
				cpt++;

		return cpt;		
	}
	public Card[] cardsAvailable() {
		int cpt=0;

		for(int i=0;i<cards.length;i++)
			if(!cards[i].isPlayed())
				cpt++;

		Card res[] = new Card[cpt];

		cpt=0;

		for(int i=0;i<cards.length;i++)
			if(!cards[i].isPlayed())
				res[cpt++] = cards[i];

		return res;		
	}*/
}

/*
public Card[] play() throws NotEnoughCardsException{
		Card [] res = new Card[nbPlayers];
		int a;

		//Check if there are enough available cards return an empty array
		if (nbCardsAvailable() < nbPlayers){
			throw new NotEnoughCardsException();
		}
		for(int i=0;i<nbPlayers;i++) {

			//random card 
			a = (int)(Math.random()*nbCards);

			//insure not played
			while(cards[a].isPlayed()){
				a = (int)(Math.random()*nbCards);
			}

			//distribute the card
			cards[a].distribute();
			res[i] = cards[a];

		}
		return res;
	}
*/