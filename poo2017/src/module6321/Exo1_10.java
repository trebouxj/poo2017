package module6321;

import java.util.Scanner;


public class Exo1_10 {

	public static void main (String args[]){
		
	//exo 5
		int tab5[] = {2,4,6,8};
		
		for (int i= 0 ; i < tab5.length ; i++)
		{
			System.out.println(tab5[i]);
		}
	
	//exo 6
	String array[] = {"j", "a", "v","a","!" };
	String sequencefinal = "";
	
	for ( String sequencetemp: array){
	
		System.out.println(sequencetemp);
		sequencefinal += sequencetemp;
		
	}
	
	System.out.println(sequencefinal);
	
	//exo 9
	int array9 [][] = new int [3][4];
	array9[0][0] = 1;
	array9[0][1] = 2;
	array9[1][0] = 1;
	array9[1][1] = 2;
	array9[1][2] = 3;
	array9[1][3] = 4;
	array9[2][0] = 1;
	
	for (int i = 0 ; i < array.length-2; i++){
		System.out.println(" \n ");
		for (int values : array9[i])
		System.out.printf(values + " - ");
		System.out.println(" \n ");
	}
	
	//exo10
	int biarray[][];
	Scanner input = new Scanner(System.in);
	System.out.println("saisissez la longueur de ligne");
	int i= input.nextInt();
	System.out.println("saisissez la longueur de colonne");
	int j= input.nextInt();
	
	biarray = new int [i][j];
	// version avec deux boucles
	
	for (int row = 0; row < biarray.length; row++)
	{
		for (int column = 0; column < biarray[row].length; column++)
			System.out.printf("%d   ", biarray [row][column]);
			System.out.println();
	}
	
	// version avec la syntaxe for (parameter : array)
	for (int row = 0 ; row < biarray.length; row++)
	{
		System.out.println(" \n ");
		for (int values : biarray[row])
		System.out.printf(values + " * ");
	}
}
}
