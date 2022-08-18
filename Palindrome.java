/*
Program : Java Program to check the number is palindrome( class test assesment )  
@author:  Mitul Mistry
@date :18 -08 -2022
*/

class Palindrome
{
	static void checkPalindrome() //calling method checkPalindrome
	{
	   	int num= 26632;           // input given
	    int r,num2= 0;

       int temp= num;            // giving value to temp as an temporary space
	   while(num>0)                            
	   {
            r= num%10;
			num2 =(num2*10)*r;
			num= num/10;
	   }
		if(num2==temp)
			System.out.println(" the number  "+ temp +" is a palindrome");
		else
			System.out.println("the number "+ temp +" is not palindrome");
			
	}

public static void main(String args[])
   {
		checkPalindrome();  // calling checkPalindrome
   }	
}