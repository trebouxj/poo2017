package module6321;


public class PokerTest {


	public static void main(String[] args) {
		
		
		System.out.println("Poker int :");
		PokerInt p = new PokerInt(3);
		int tirages[] = p.play();

		for(int i=0;i<tirages.length;i++)
			System.out.print(tirages[i] + " ");
		
		//testsPokerInt();
		//testsPokerString();
		//testsPokerObjet();
		//testsPokerObjet2Dim();
	}

	
	
//	
//	public static void testsPokerInt() {
//		System.out.println("Poker int :");
//		PokerInt p = new PokerInt(3);
//		int tirages[] = p.play();
//
//		for(int i=0;i<tirages.length;i++)
//			System.out.print(tirages[i] + " ");
//	}

	
	
	
	
	
	
	
	public static void testsPokerString() {
		System.out.println("Poker string :");
		PokerString p = new PokerString(3);
		String tirages[] = p.play();

		for(int i=0;i<tirages.length;i++)
			System.out.print(tirages[i] + " ");
	}

	public static void testsPokerObjet() {
		System.out.println("Poker objet :");
		PokerObjet p = new PokerObjet(3);
		Card cards[]= null;
		//try {
			//throw an exception if there is not enough cards
			cards = p.play();

			System.out.println("Plays :");
			for(int i=0;i<cards.length;i++)
				System.out.println(cards[i] + " ");

			/*System.out.println("Cartes restantes :");
			Card reste[] = p.cardsAvailable();
			for(int i=0;i<reste.length;i++)
				System.out.print(reste[i] + " ");*/

		//} catch(NotEnoughCardsException e){
		//	System.out.println(e.getMessage());
		//}
		

	}

	public static void testsPokerObjet2Dim() {
		System.out.println("Poker objet 2Dim :");
		PokerObjet2Dim p = new PokerObjet2Dim(3);
		Card tirages[][] = p.tirages();

		System.out.println("Tirages :");
		for(int i=0;i<tirages.length;i++)
			System.out.println("Joueur" + (i+1) + ": " + tirages[i][0] + " " + tirages[i][1] + " ");
	}
}