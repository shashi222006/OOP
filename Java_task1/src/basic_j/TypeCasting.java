package basic_j;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b; 
		 int i = 257; 
		 double d = 323.142; 
		 // automatic type conversion (Implicit Type casting)
		 d = i;
		 System.out.println("\n Conversion of int to double: " + d);
		 //explicit Type casting
		 System.out.println("\nConversion of int to byte."); 
		 b = (byte) i; 
		 System.out.println("i and b " + i + " " + b); 
		 System.out.println("\nConversion of double to int."); 
		 i = (int) d; 
		 System.out.println("d and i " + d + " " + i); 
		 System.out.println("\nConversion of double to byte."); 
		 b = (byte) d; 
		 System.out.println("d and b " + d + " " + b); 

	}

}
