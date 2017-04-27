package democlass;

import java.util.Scanner;

public class Voiture {
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	
	Voiture mesvoitures[];
	int numvoiture;
	String modelvoiture;
	
	System.out.println("saisissez la longueur de votre tableau");
	numvoiture= input.nextInt();
	mesvoitures=new Voiture[numvoiture];
	for (int i = 0; i < mesvoitures.length; i++) {
		int j=0;
		j=i+1;
		System.out.println("insérer votre modèle "+j);
		modelvoiture=input.next();
		mesvoitures[i]=new Voiture();
		mesvoitures[i].setModel(modelvoiture);
	}
	
	for (int i = 0; i < mesvoitures.length; i++) {
		int j=0;
		j=i+1;
		System.out.println("Voici votre modèle de voiture "+j);
		System.out.println(mesvoitures[i].getModel());
	}
}
}






















//public class Voiture {
//
//	private String model;
//	
//	public String getModel(){
//		return model;
//	}
//	
//	public void setModel(String model){
//		this.model=model;
//	}
//	
//	public static void main (String args[]){
//		Scanner input = new Scanner(System.in);
//		Voiture mesvoitures[];
//		int innumv;
//		String inmodv;
//		
//		System.out.println("saisissez la longueur de votre tableau");
//		innumv = input.nextInt();
//		mesvoitures= new Voiture [innumv];
//		
//		for (int i = 0; i < mesvoitures.length; i++) {
//			int j=0;
//			j=i+1;
//			System.out.println("Insérer votre modèle de voiture numéro "+j);
//			inmodv= input.next();
//			mesvoitures[i] = new Voiture();
//			mesvoitures[i].setModel(inmodv);	
//			//System.out.println("*****"+mesvoitures[i]);
//		}
//		
//		
//		for (int i = 0; i < mesvoitures.length; i++) {
//			int j=0;
//			j=i+1;
//			System.out.println("Voici votre modèle de voiture numéro "+j);
//			System.out.println(mesvoitures[i].getModel());
//			
//		}
//		
//	}
//
//}
//
