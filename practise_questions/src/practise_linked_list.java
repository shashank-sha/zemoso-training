import java.util.Arrays;
import java.util.Scanner;


public class practise_linked_list {
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		int len=1;
		int next=a[0];
		while(next!=-1){
			next=a[next];
			len++;
		}
		
		System.out.print(len);
	}

}
