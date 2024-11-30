package calismalar;
import java.util.Scanner;
public class baklavaDilimi {
	public static void main(String[] args) {
    Scanner oku=new Scanner(System.in);
    System.out.println("Lütfen sayı giriniz: ");
    int sayi=oku.nextInt();
    oku.close();
    int bosluk=sayi*2;
    int n,b=0,i=0;
    for(n=0;n<=sayi;n+=2)
    {
    	for(b=0;b<bosluk;b+=2)
    	{
    		System.out.print(" ");	
    	}

    	for(i=0;i<=n;i++)
    	{
    		System.out.print("*");
    		
    	}
    	bosluk-=2;
 
	System.out.println();

    }
    bosluk-=2;
    for(n=n;n>=0;n-=2)
    {
    	for(int a=0;a<=bosluk;a+=2)
    	{
    		System.out.print(" ");	
    	}
    	bosluk+=2;
    	for(int c=0;c<=n;c++)
    	{
    		System.out.print("*");

    	}
	System.out.println("");
    }
    
    
    
	}

}
