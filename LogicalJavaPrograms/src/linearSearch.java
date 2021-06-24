import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to search");
		int a[]={11,12,31};
		int temp=0;
		int n=sc.nextInt();
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==n){
				System.out.println(n);
				temp++;
			} 
			}
		if (temp==0){
			System.out.println("number not found int the list");
		}
		}
	}


