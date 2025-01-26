package sortingAlgorithms;
import java.util.Scanner;
public class MySortingAlgorithm {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Diziniz kaç elemanlı olsun:");
		int a=scan.nextInt();
		int[] myArray=new int[a];
		System.out.println("Elemanları giriniz:");
		for(int i=0;i<a;i++) {
			myArray[i]=scan.nextInt();
			}
		scan.close();
		boolean change=true;
		int temp;
		do {
			change=false;
			for(int y=0;y<a-1;y++) {
			if(myArray[y]>myArray[y+1]) {
				for(int i=y;i<a-1;i++) {
					temp=myArray[i];
					myArray[i]=myArray[i+1];
					myArray[i+1]=temp;
					change=true;
					}
			}
			}
		}while(change);
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]);
		}
		
	}
}
