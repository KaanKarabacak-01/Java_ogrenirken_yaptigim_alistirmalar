package calismalar;
import java.util.Scanner;
public class sayiPiramidi {
//12
	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz: ");
		int sayi=oku.nextInt();
		oku.close();
		int bosluk=(sayi-1)*2;
			for(int a=1;a<=sayi;a++) {
				for(int d=0;d<=bosluk;d++) {System.out.print(" ");}
				bosluk-=2;
				for(int b=a;b>=1;b--) {System.out.print(b+" ");}
				for(int c=2;c<=a;c++){System.out.print(c+" ");}
				System.out.println();
				
			}

	}

}
