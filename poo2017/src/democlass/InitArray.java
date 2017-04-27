package democlass;

public class InitArray {
	

//	public static void main(String[] args) {
//		//Déclarer un tableau en 2 étapes
//		int array[];
//		array = new int [3];
//		System.out.printf("%s%8s\n","index","value");
//		for (int i = 0; i < array.length; i++) {
//			System.out.printf("%s%8s\n",i,array[i]);
//		}
//	}

	public static void main(String[] args) {
		
		int array[][]={{1,3,6},{2,4}};
		//int array[][]= new int[2][2];
		//System.out.println(array);
		outputArray(array);
	}

	

	public static void outputArray(int array[][]){
		
		for (int row = 0; row < array.length; row++){
			for (int column = 0; column < array[row].length; column++)
				
				System.out.printf("%d ", array[row][column]);
				System.out.println();		
			}
			
		}

}
