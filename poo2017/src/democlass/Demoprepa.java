package democlass;

import java.util.Scanner;

public class Demoprepa {

	public static void main (String[] args){
		//Déclaration de base
		int c[] = new int[10];
		//String s[]= new String[5];
		
		//sysout avec le printf
		System.out.printf("%s%8s\n","index","value");
		
		//première boucle..
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%s%8s\n",i,c[i]);
		}
		
		//boucle avec le param
		for (int value : c){
			System.out.printf("%8s\n",value);
		}
		
		//initialisaion directement avec des valeurs
		int c2[]={3,4,17};
		for (int i = 0; i < c2.length; i++) {
			System.out.printf("%s%8s\n",i,c[i]);
		}
		
		//initialisaion 2D directement avec des valeurs
		int c3[][]={{1,3,4},{4,5,5}};
		int c4[][]={{1,3},{4,6,9},{5}};
		
		System.out.println("valeurs dans le tableau c3");
		outpuArray(c3);
		
		System.out.println("valeurs dans le tableau c4");
		outpuArray(c4);
		
		
		//Tableau d'objet
		Voituredemo v[]= new Voituredemo[3];
		Scanner input = new Scanner (System.in);
		String temp;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("insérer vos modèles");
			temp=input.next();
			v[i]=new Voituredemo();
			v[i].setModel(temp);
		}
		
		System.out.println("les modèles existants sont:\n");
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].getModel());
		}
		
		}

		private static void outpuArray(int[][] c3) {
		
			for (int i = 0; i < c3.length; i++) {
				for (int j = 0; j < c3[i].length; j++) 
					System.out.printf("%d  ",c3[i][j]);
			
				System.out.println();
		}
		
	}


}
