package rock_papperGame;

import java.util.*;

public class BlackJack {
	
	
	public static String playersCards() {
		
		String[]playersCards;
    	playersCards = new String[10];
    	playersCards[0] = "1";
    	playersCards[1] = "2";
    	playersCards[2] = "3";
    	playersCards[3] = "4";
    	playersCards[4] = "5";
    	playersCards[5] = "6";
    	playersCards[6] = "7";
    	playersCards[7] = "8";
    	playersCards[8] = "9";
    	playersCards[9] = "10";
		
		int random = (int) (Math.random()*10);
			{
				System.out.println("Here are your cards are: " + playersCards[random]);
				return playersCards[random];
			}
	}
	public static String playersCards2() {
				
				String[]playersCards2;
		    	playersCards2 = new String[10];
		    	playersCards2[0] = "1";
		    	playersCards2[1] = "2";
		    	playersCards2[2] = "3";
		    	playersCards2[3] = "4";
		    	playersCards2[4] = "5";
		    	playersCards2[5] = "6";
		    	playersCards2[6] = "7";
		    	playersCards2[7] = "8";
		    	playersCards2[8] = "9";
		    	playersCards2[9] = "10";
				
				int random2 = (int) (Math.random()*10);
				System.out.println("Here are your cards are: " + playersCards2[random2]);
				
				return playersCards2[random2];
			}
	


	
	public static int computerCards() {
		
		
	
		String[]computerCards;
    	computerCards = new String[10];
    	computerCards[0] = "1";
    	computerCards[1] = "2";
    	computerCards[2] = "3";
    	computerCards[3] = "4";
    	computerCards[4] = "5";
    	computerCards[5] = "6";
    	computerCards[6] = "7";
    	computerCards[7] = "8";
    	computerCards[8] = "9";
    	computerCards[9] = "10";
		
		int random = (int) (Math.random()*10);
		
			
			{
				System.out.println("NPC Got: " + computerCards[random]);
				
				String[]computerCards2;
		    	computerCards2 = new String[10];
		    	computerCards2[0] = "1";
		    	computerCards2[1] = "2";
		    	computerCards2[2] = "3";
		    	computerCards2[3] = "4";
		    	computerCards2[4] = "5";
		    	computerCards2[5] = "6";
		    	computerCards2[6] = "7";
		    	computerCards2[7] = "8";
		    	computerCards2[8] = "9";
		    	computerCards2[9] = "10";
				
				int random3 = (int) (Math.random()*10);
				return random3; 
				//System.out.println("NPC Got: " + computerCards2[random3]);
			}
	}

	public static String playersExtra() {
		
		String[]playersExtra;
		playersExtra = new String[10];
		playersExtra[0] = "1";
		playersExtra[1] = "2";
		playersExtra[2] = "3";
		playersExtra[3] = "4";
		playersExtra[4] = "5";
		playersExtra[5] = "6";
		playersExtra[6] = "7";
		playersExtra[7] = "8";
		playersExtra[8] = "9";
		playersExtra[9] = "10";
		
		int random4 = (int) (Math.random()*10);
		
		return playersExtra[random4];
		
	}
	public static void hitMe() {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Will you Hold, Or Hit?");
	    String userInput = myObj.nextLine();  
	    
	    String getCard = playersExtra();
	    
	    if( userInput.equalsIgnoreCase( "Hit")){
	    	System.out.println("Your New Card:" + getCard);
	    }; 
	      if( userInput.equalsIgnoreCase( "hold"));
	    System.out.println("You choose to Hold!");
}
	
		

		
		
		
			  

	public static void main(String[] args) {

		playersCards();
		playersCards2();
		computerCards();
		hitMe();
		playersExtra();
	}
}
