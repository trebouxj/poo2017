package module6321;

@SuppressWarnings("serial")
public class NotEnoughCardsException extends Exception{
   
	public NotEnoughCardsException(){
		super("Error: cannot Play : not enough cards for the number of players");
	   };
	public NotEnoughCardsException(String message){
		super(message);	   
   };
}
