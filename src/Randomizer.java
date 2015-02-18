//this class is meant to generate the random password
// Chanloeu Ek
import java.util.Scanner;

public class Randomizer {
	
	private static String[] lettersLOWER = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	private static String[] lettersUPPER = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private static String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
	private static String[] symbols = {"!", "@", "#", "$", "%", "&", "*", "?"};
	private static String[] password;
	static int input;

	
	public static String lettersLowerRANDOM()
	{
		int random =(int)(Math.random()*26);
		String temp = lettersLOWER[random];
		return temp;
	}
	
	public static String lettersUpperRANDOM()
	{
		int random =(int)(Math.random()*26);
		String temp = lettersUPPER[random];
		return temp;
	}
	
	public static String numbersRANDOM()
	
	{
		int random =(int)(Math.random()*9);
		String temp = numbers[random];
		return temp;
	}
	
	public static String symbolsRANDOM()
	{
		int random =(int)(Math.random()*8);
		String temp = symbols[random];
		return temp;
	}
	
	public static String pickRANDOM()
	{
		int random =(int)(Math.random()*3);
		if(random==0)
			return lettersLowerRANDOM();
		if(random==1)
			return lettersUpperRANDOM();
		if(random==2)
			return numbersRANDOM();
		else
			return symbolsRANDOM();
	}
	
	public static void createPASSWORD()
	{
		for(int i=0;i<input;i++)
		{
			password[i]=pickRANDOM();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many characters do you want to create?");
		input = keyboard.nextInt();
		password = new String[input];
		keyboard.close();
		
		System.out.println("");
		
		createPASSWORD();
		
		for(int i=0;i<input;i++)
		{
			System.out.print(password[i]);
		}
		
		
	}

}
