import java.util.Scanner;


public class practise_ab_bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		String binary=Integer.toBinaryString(a*b);
		//System.out.print(binary);
		int no_bits_set_to_one = binary.length() - binary.replace("1", "").length();
		System.out.print(no_bits_set_to_one);
		
	}

}