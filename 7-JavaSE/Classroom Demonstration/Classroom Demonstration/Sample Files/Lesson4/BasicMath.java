/* This class demonstrates the basic arithmetic operations */
public class BasicMath 
{
       public static void main(String args[]) 
	   {	
			// arithmetic using integers
	        System.out.println("Integer Arithmetic");
	       
			// a is a an integer type of variable.
			int a = 1 + 1; 
			
			// here b,c,d,e are all integer type variables.
	        int b = a * 3;
	        int c = b / 4;
	        int d = c - a;
	        int e = -d;                  
	        
			int x = 22;

			// initializes z as a byte type variables.
			// casting into byte type
			byte z=(byte)(x+23);     
			
			// this prints the value of z
	        System.out.println("z = " + z);
			
			// this prints the value of a
	        System.out.println("a = " + a);              
	        
			// this prints the value of b
			System.out.println("b = " + b);             
	        
			// this prints the value of c
			System.out.println("c = " + c);
			
	        // this prints the value of d
			System.out.println("d = " + d);
			
	        // this prints the value of e
			System.out.println("e = " + e);
			
	 // arithmetic using doubles
            System.out.println("\nFloating Point Arithmetic");

            double da = 1 + 1;
			double db = da * 3;
			double dc = db / 4;
			double dd = dc - a;
	        double de = -dd;
	        
			System.out.println("da = " + da);

	        System.out.println("db = " + db);
            
			System.out.println("dc = " + dc);
	        
			System.out.println("dd = " + dd);
	  
			System.out.println("de = " + de);
	  
			System.out.println("Modulo operations: ");

	        System.out.println("\t  5 %  3 \t = " + ( 5%3 ) );

		    System.out.println("\t -5 %  3 \t = " + ( -5%3 ) );
			
			System.out.println("\t  5 % -3 \t = " + ( 5%-3 ) );
	     }
 }
