package calismalar;
import java.util.Scanner;
import java.lang.Math;
public class intToBinary {
	public static void main(String[] args){
		Scanner oku = new Scanner(System.in);
		int sayi=oku.nextInt();
		oku.close();
		double  us=1;
		double binary=1;
		
		do {
			binary=(int)Math.pow(2.0, us);
			us++;

			
		}while(sayi>binary);
		us--;		
		if(binary>sayi) {
			us--;
		}
		binary=(int)Math.pow(2, us);
		
		while(us>=0) {
			System.out.print(sayi/(int)binary);

			sayi%=binary;
			us--;
			binary=(int)Math.pow(2, us);
		}

		


		
		
		
		
	}

}
