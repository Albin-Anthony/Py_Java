import java.util.Scanner;
class Sum_of_natural{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
		int n,i,sum=0;
	System.out.println("enter limit:");
		n=obj.nextInt();
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
	System.out.println("the SUM of given limit:"+sum);
	}
}
	