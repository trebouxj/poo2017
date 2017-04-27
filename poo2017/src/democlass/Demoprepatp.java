package democlass;

import java.util.Scanner;

public class Demoprepatp {
	
	public static void main (String [] args){
		int c[] = new int [10];
		int c1[] ={4,5,88};
		
		System.out.printf("%s%8s","index","value");
		System.out.println();
		
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%s%8s\n",i,c[i]);
		}
		
		for ( int valeur : c1){
			System.out.printf("%8s\n", valeur);
		}
		
		// création tableau 2 dim
		
		int c3[][]={{1,3},{55,77,88}};
		int c4[][]={{2,4,5},{5,8}};
		
		System.out.println("valeur du tableau c3");
		outputArray(c3);
		
		System.out.println("valeur du tableau c4");
		outputArray(c4);
		
		//Tableau d'objet
		Voituredemotp mesvoitures[] = new Voituredemotp[3];	
		Scanner input = new Scanner (System.in);
		String temp;
		
		for (int i = 0; i < mesvoitures.length; i++) {
			System.out.println("insérer votre modèle");
			temp=input.next();
			mesvoitures[i]=new Voituredemotp();
			mesvoitures[i].setModel(temp);
		}
		
		System.out.println("Les modèles présents sont: \n");
		for (int i = 0; i < mesvoitures.length; i++) {
			System.out.println(mesvoitures[i].getModel());
		}
		
		
	}

	private static void outputArray(int[][] c3) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c3.length; i++) {
			for (int j = 0; j < c3[i].length; j++) {
				System.out.printf("%d ",c3[i][j]);
			}
			System.out.println();
		}
	}

}
