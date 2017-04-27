package democlass;

public class parsechar {

	public static void main (String arg[]){
		String array[] = {"l", "o", "u","p","s" };
		String sequencef = "";
		for ( String sequence: array)
			sequencef += sequence;
		System.out.println(sequencef);
	}
	
	/*public static void main (String arg[]){
		String array[][] = new String[2][4];

		for ( String[] row : array)
			for (String element : row)
				{element = "*";
				System.out.println(element);}
	}*/
}
