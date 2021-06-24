
public class one_to_ten_prime {
public static void main(String[] args) {
	int count=0;
	for (int i=1;i<=10;i++){
		for (int j=2;j<i;j++){
			if (i%j==0){
				count++;
				break;
			}
		} if (count==0){
			System.out.println(i);
		} else{
			count=0;
		}
	}
	
}
}
