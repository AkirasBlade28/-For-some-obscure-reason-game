//comments are done 'by the flow'
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to 'For Some Obscure Reason' game!\n\n");
		System.out.println("To play enter four digit number in range from 0 to 9.");
		System.out.println("If one digit is in correct place it's a Bulll\notherwise, it's a Cow!\nGood Luck!\n\n\n");
		
		Scanner in= new Scanner(System.in);//input
		
		BoolOrACowMain(in);
		 		
	}

	private static void BoolOrACowMain(Scanner in) {
		/////////////flow
				
				boolean trys = false;
				
				int dig = ranDigit(); 					// ran dig to be 'static' in every turn
				int numTrys = 0;						   //  count num of try
				
				do{									 //    loop for user unput
					int bullScore = 0;
					int cowScore = 0;
					
					String digStr=dig+"";	//  in java string has powerful methods calls 
										   //   we can convert, as shown here, number literals of type int
										  //    to a type str, with it's length being the number of digits
						//+digStr				 //		that number has
				System.out.print("Enter four digit number: ");
				
				int inNum = in.nextInt();// user input
				String inStr = inNum+ ""; // convert to string
				++numTrys; // count try's 
				
				for(int i=0; i<4; ++i)
				{
					if(inStr.charAt(i)==digStr.charAt(i)) // method call 'check if char at position num i is equal to char at position num i'
					{
						++bullScore; 
					}
					else
					if(digStr.contains(inStr.charAt(i)+""))// method call 'check if str contains char at position number i'
					{
						++cowScore;                      // if so, thats a cow
					}
				}
				
				if(bullScore==4 | (bullScore==3 && cowScore==1))
				{
					trys=true;
					System.out.println(bullScore+" Bulls!\nYou Win!");
					System.out.println("You won afet "+numTrys+" trys!\n");
					System.out.println("Play next round?\n(type: Yes or No)");
					String nextRound = in.next();
					if(nextRound.equalsIgnoreCase("YES"))
					{
						trys=false;
						dig = ranDigit();
						numTrys=0;
						continue;
					}
					else if(nextRound.equalsIgnoreCase("NO"))
					{
						System.out.println("Game Closed");
					}
				}
				else
				{
					System.out.println(cowScore+" Cow and "+bullScore+" Bull\n\n");
				}
					if(inNum==666777) // use it to show the answer
					{
						System.out.println(digStr);
					}
				}while(!trys);
	}
	
	static int ranDigit() // generated random number
	{
		
		double ran= 1000+Math.random()*9000;
		int ran00=(int)ran;
		return ran00;
	}
	
	static int digSep(int inNum)// digit separator method
	{ 
		int inNum00 = inNum%10;	
		
	    return inNum00;		
	}
	
}