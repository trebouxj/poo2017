package module6321;
public class PokerInt {
	
	private int cards[] = new int[52];
	private int nbPlayers;
	
	public PokerInt(int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}
	
	public int[] play() {
		int res[] = new int[nbPlayers];
		
		for(int i=0;i<nbPlayers;i++) {
			int a = (int)(Math.random()*52);
			res[i] = a;
		}		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int[][] play2Dim() {
		int [][]res = new int[nbPlayers][2];
		
		for(int i=0;i<nbPlayers;i++) {
			res[i][0] = (int)(Math.random()*52);
			res[i][1] = (int)(Math.random()*52);
		}
		
		return res;
	}
	
	public int[][] play2DimUnique() {
		int [][]res = new int[nbPlayers][2];
		
		for(int i=0;i<nbPlayers;i++) {
			int a, b;
			
			// first card
			do {
				a = (int)(Math.random()*52); 
				
			} while(cards[a] != 0);
			
			res[i][0] = a;
			cards[a]++;
			
			// second card
			do {
				b = (int)(Math.random()*52); 
				
			} while(cards[b] != 0);
			
			res[i][1] = b;
			cards[b]++;
		}
		
		return res;
	}
}
