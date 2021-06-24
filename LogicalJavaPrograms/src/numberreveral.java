
public class numberreveral {
public static void main(String[] args) {
	int number=1234;
	int temp=0;
	int reversednumber=0;
	while(number>0){
		temp=number%10;
		reversednumber=reversednumber*10+temp;
		number=number/10;
	}
	System.out.println(reversednumber);
}
}
