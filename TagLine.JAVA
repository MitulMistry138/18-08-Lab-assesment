/*
Program : Tagline of brands By using Switch Case.
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class TagLine
{

	static void printBrandName()   //  method name  PrintBrandName
	{
		String brand= "puma"; //input given 
        
        switch(brand)
		{
		case "addidas"-> System.out.println( " tagline of " + brand +" is :- Addidas is all ");
			                                                     
			case "nike"->  System.out.println( " tagline of " + brand +" is :- Just do it ");
			        
 			case "puma"->  System.out.println( " tagline of " + brand +" is :- FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD.");
			        
			case "mcdonals"->  System.out.println( " tagline of " + brand +" is :- i'm loving it ");
			        
			case "dominos"->  System.out.println( " tagline of " + brand +" is :- OH yes We did It ");
			       
						        
			default-> System.out.println("Wrong input");		// for looping out if the input is wrong
		}
 				
	}

	public static void main(String args[])
	{
		printBrandName();		// calling method as printBrandName
	}
}	