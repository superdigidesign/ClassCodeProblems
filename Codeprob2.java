
/*Question   ===    How old are you? 17*/

import java.util.Scanner;

public class Codeprob2 {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
	    int age1 = 18;
	    System.out.print("How old are you?" + " ");	    
	    age1 =  keyboardInput.nextInt();
	    
	if (age1 < 18) {
		System.out.println("You are: ");
		System.out.println("	too young to get a tattoo");
		System.out.println("	too young to drink alcohol"); 
        System.out.println("	too young to run for President of the U.S.");
        System.out.print("		(How sad!)");
}
	}
}

/* Output
 *  
You are:
    too young to get a tattoo
    too young to drink alcohol
    too young to run for President of the U.S.
        (How sad!)*/



/*
public class Codeprob2 {
    
    public static void main(String []args){
        int a = 2;
        int b = 4;
        int c = 6;
        
        System.out.println( (a + b) + c + " = " + a + b + c);
        //System.out.println( a + (b + c) + " = " + (a + b) + c);
    }
}
*/