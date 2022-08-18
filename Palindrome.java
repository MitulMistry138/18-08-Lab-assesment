/*
Program : Java Program to check the number is palindrome( class test assesment )  
@author:  Mitul Mistry
@date :18 -08 -2022
*/

class Palindrome
{
	static void checkPalindrome()                                               // method named checkPalindrome
	{
	   	int num= 2662;                                                          // input given
	    int r,num2= 0;

       int temp= num;                                                           // comparing the temp value as num
	   while(num>0)                            
	   {
            r= num%10;
			num2 =(num2*10)*r;
			num= num/10;
	   }
		if(num2==temp)
			System.out.println(" the number  "+ temp +" is a palindrome");      // if input is a palindrome 
		else
			System.out.println("the number "+ temp +" is not palindrome");      // if input is not palindrome
			
	}

public static void main(String args[])
   {
		checkPalindrome();                                                      // calling checkPalindrome
   }	
}