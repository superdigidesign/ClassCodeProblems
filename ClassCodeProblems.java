
public class ClassCodeProblems {

	public static void main(String[] args) {


//What is the output of each of the following code fragments?
//(given the declaration int a=1, b=2, c=3;):

//Question 1. ============================
/*
		if(6 < 2 * 5) {
			System.out.println("Hello");
			 System.out.println(" There");
		 }
	}
}

Output is Hello
           There

*/
//Question 2. =============================
/*
		int a = 1;
		int b = 2;
		int c = 3;
		
		if(a>b) {
			System.out.println("1111");
		}
		 if(a>c) {	
			System.out.println("2222");
		}
	}
}

//No output both, statements are False

*/

//Question 3.  =========================== 
/*		
		int a = 1;
		int b = 2;
		int c = 3;

	  if (a < c) {
		System.out.println("*");
	  }else if  (a == b) {
		System.out.println("&");
	  }else {
		System.out.println("$");
	}
  }
}

//Output is *
*/

//Question 4.  =========================== 
/*
		int a = 1;
		int b = 2;
		int c = 3;

		if(a<b) {
			System.out.println("####");
		}else {
			System.out.println("&&&&");
		    System.out.println("****");
	}
  }
}

//Output is ####
*/
		
//Question 5.  =========================== 

		if(a>b)
			System.out.println("####");
		else
		{System.out.println("&&&&");
		System.out.println("****");}

//Output is ****

//Question 6.  ===========================  

		int x = 100; int y = 200;
		if (x > 100 && y <=200)
		System.out.print(x+" "+y+" "+(x+y));
		else
		System.out.print(x+" "+y+" "+(2*x-y));
//   (x+" "+y+" "+(2*x-y))

//Question 7.  =========================== 

		if (a < c)
		System.out.println("*");
        else if (a == c)
        System.out.println("&");
        else
        System.out.println("$");
//   *
   
//Question 8.  =========================== 

		if(++a > b++ || a-- > 0)
		c++;
        else
        c--;
        System.out.println(a+" "+b+" "+c);


//Question 9.  =========================== 
        
        if(a<b){
        System.out.println("####");
        System.out.println("****");
        }
        else
        System.out.println("&&&&");
//   ####  ****

//Question 10.  =========================== 
        
        if ('a' > 'b' || 66 > (int)('A'))
        System.out.println("#*#");
//   #*#
*/