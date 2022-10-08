import java.util.Scanner;
class Swapper{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 values for X and Y :");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("Befor swapping value of X: "+x+"\nBefor swapping value of Y: "+y);
		x=x+y;			// x=(x+y)
		y=x-y;			// y=(x+y)-y  =>  y=x    inga (x) oda value ipo 'y' assign aayirukum 
		x=x-y;			// x=x+y-(x)  =>  x=y    inga (y) oda value ipo 'x' assign aayirukum
		System.out.println("After swappping the value of X:"+x+"\nAfter swappping the value of Y:"+y); //ippo melaaye ellam '<swap>''ayidichu  so,EX (X:+x) nera [map] pannale ,corecta oppositela vanthurum..  
	}

}