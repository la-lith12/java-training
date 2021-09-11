package java;

public class kcg {

	public static void main(String args[])  /* the error is : a[] , which has been 
	changed to args[] due to this 'a' couldnt be named as a variable in main */
	{
		char a = 's';
		int s = 95;
		a = (char)s; /* since 's' is integer datatype , to copy the value of variable
		's' to string 'a' .. 'char' datatype should be added to 's'  */
		
				

	}

}

