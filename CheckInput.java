/*
Program : Check whether the number is vowel or consonant or special number and print there ascii value
@author:  Mitul Mistry
@date :18 -08 -2022
*/

class CheckInput
{
 static void checkValue()                                             // method name checkValue
   {
     
	 char ch = 'o';                                                  // giving value 
	 int num = ch;

        if(ch =='a'||ch=='e'||ch=='i'||ch == 'o'||ch == 'u')        // logic for getting the given input as a vowel,consonant
		{
	    System.out.println(ch + " is vowel");                       // Input is vowel
		}
        else 
		{
            System.out.println(ch + " is consonant");               // Input is consonant 
		}
	   
   char c1= ch;                                                     //asciii value for the given input 
   int num2= c1;                                                    // converting character to integer 
    System.out.println(" ascii value : "+ c1 + " is: "+ num2);      // Print ascii value for the given input  
   } 
	public static void main(String args[])
	{		
     checkValue();	                                                // Calling method checkValue	
	}	
}	