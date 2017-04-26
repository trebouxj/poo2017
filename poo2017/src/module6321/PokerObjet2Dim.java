package module6321;

public class PokerObjet2Dim {
	private static final short nbCartes = 52;
	private Card cartes[] = new Card[nbCartes];
	private int nbJoueurs;
	
	public PokerObjet2Dim(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
		initCartes();
	}
	
	private void initCartes() {
		cartes[0] =  new Card("A", "Coeur");
		cartes[1] =  new Card("R", "Coeur");
		cartes[2] =  new Card("D", "Coeur");
		cartes[3] =  new Card("V", "Coeur");
		cartes[4] =  new Card("10", "Coeur");
		cartes[5] =  new Card("9", "Coeur");
		cartes[6] =  new Card("8", "Coeur");
		cartes[7] =  new Card("7", "Coeur");
		cartes[8] =  new Card("6", "Coeur");
		cartes[9] =  new Card("5", "Coeur");
		cartes[10] =  new Card("4", "Coeur");
		cartes[11] =  new Card("3", "Coeur");
		cartes[12] =  new Card("2", "Coeur");
		
		cartes[13] =  new Card("A", "Pique");
		cartes[14] =  new Card("R", "Pique");
		cartes[15] =  new Card("D", "Pique");
		cartes[16] =  new Card("V", "Pique");
		cartes[17] =  new Card("10", "Pique");
		cartes[18] =  new Card("9", "Pique");
		cartes[19] =  new Card("8", "Pique");
		cartes[20] =  new Card("7", "Pique");
		cartes[21] =  new Card("6", "Pique");
		cartes[22] =  new Card("5", "Pique");
		cartes[23] =  new Card("4", "Pique");
		cartes[24] =  new Card("3", "Pique");
		cartes[25] =  new Card("2", "Pique");
		
		cartes[26] =  new Card("A", "Carreau");
		cartes[27] =  new Card("R", "Carreau");
		cartes[28] =  new Card("D", "Carreau");
		cartes[29] =  new Card("V", "Carreau");
		cartes[30] =  new Card("10", "Carreau");
		cartes[31] =  new Card("9", "Carreau");
		cartes[32] =  new Card("8", "Carreau");
		cartes[33] =  new Card("7", "Carreau");
		cartes[34] =  new Card("6", "Carreau");
		cartes[35] =  new Card("5", "Carreau");
		cartes[36] =  new Card("4", "Carreau");
		cartes[37] =  new Card("3", "Carreau");
		cartes[38] =  new Card("2", "Carreau");
		
		cartes[39] =  new Card("A", "Trefle");
		cartes[40] =  new Card("R", "Trefle");
		cartes[41] =  new Card("D", "Trefle");
		cartes[42] =  new Card("V", "Trefle");
		cartes[43] =  new Card("10", "Trefle");
		cartes[44] =  new Card("9", "Trefle");
		cartes[45] =  new Card("8", "Trefle");
		cartes[46] =  new Card("7", "Trefle");
		cartes[47] =  new Card("6", "Trefle");
		cartes[48] =  new Card("5", "Trefle");
		cartes[49] =  new Card("4", "Trefle");
		cartes[50] =  new Card("3", "Trefle");
		cartes[51] =  new Card("2", "Trefle");
	}
	
	public Card[][] tirages() {
		Card [][]res = new Card[nbJoueurs][2];
		
		for(int i=0;i<nbJoueurs;i++) {
			int a, b;
			
			do {
				a = (int)(Math.random()*nbCartes);
			}while(cartes[a].isPlayed());
			
			cartes[a].distribute();
			
			do {
				b = (int)(Math.random()*nbCartes);
			}while(cartes[b].isPlayed());
						
			
			cartes[b].distribute();
			
			res[i][0] = cartes[a];
			res[i][1] = cartes[b];
		}
		
		return res;
	}
	
	public Card[] cartesDisponibles() {
		int cpt=0;
		
		for(int i=0;i<cartes.length;i++)
			if(!cartes[i].isPlayed())
				cpt++;
		
		Card res[] = new Card[cpt];
		
		cpt=0;
		
		for(int i=0;i<cartes.length;i++)
			if(!cartes[i].isPlayed())
				res[cpt++] = cartes[i];
		
		return res;		
	}
}
