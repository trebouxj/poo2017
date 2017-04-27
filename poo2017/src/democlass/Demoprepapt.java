package democlass;

import java.util.Scanner;

public class Demoprepapt {
	
	public static void main (String[] args){
		//int c []= new int [10];
		int c []= {3,5,7,8};
		
		System.out.printf("%s%8s\n","index","value");
		
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%s%8s\n",i,c[i]);
		}
			
		for (int value : c)
			System.out.printf("%8s\n",value);
		
		//tableau 2 dimensions
		int c3[][]={{2,4,6},{1}};
		int c4[][]={{5,5,5},{32,7}};
		
		System.out.println("voilà les valeurs du premier tableau");
		outpuArray(c3);
		
		System.out.println("voilà les valeurs du deuxième tableau");
		outpuArray(c4);
		
		
		//tableau d'objet
		Voituredemopt v[]= new Voituredemopt[3];
		Scanner input = new Scanner (System.in);
		String temp;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("insérer le modèle");
			temp=input.next();
			v[i]=new Voituredemopt();
			v[i].setModel(temp);
			
		}
		
		System.out.println("les modèles existants sont:\n");
		 
	}

	private static void outpuArray(int[][] c3) {
		
		for (int i = 0; i < c3.length; i++) {
			for (int j = 0; j < c3[i].length; j++) 
				System.out.printf("%d  ",c3[i][j]);
				System.out.println();
			
		}
		
	}

}
