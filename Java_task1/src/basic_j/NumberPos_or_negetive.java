package basic_j;
import java.util.Scanner;
public class NumberPos_or_negetive {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=inp.nextInt();
		if(num>0) {
			System.out.println("positive");
		}
		else if(num<0) {
			System.out.println("Negetive");
		}
		else {
			System.out.println("Num is zero");
		}
		// TODO Auto-generated method stub

	}

}
