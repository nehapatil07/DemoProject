
//to find out whether the given number is prime or not
public class primenumbers {
public static void main(String[] args) {
	int n=11;
	int count=0;
	 for (int i=2;i<n;i++){
		 if (n%i==0){
			 count++;
			 break;}}
	 if (count==0){
		 System.out.println("prime");
	 } else{
		 System.out.println("Non prime");
	 }
		 }
	 }