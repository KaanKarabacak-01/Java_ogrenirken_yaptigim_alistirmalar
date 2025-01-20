package calismalar;

public class BankaKullanıciPaneli {

	public static void main(String[] args) {
		Banka kaan=new Banka("Kaan Karabacak",500,"TL");
		Banka ozgur=new Banka("Özgür Bardakçı",250,"TL",20,"USD");
		Banka fikret=new Banka("Fikret Çöldür",1000,"TL",50,"EURO",60,"USD");
		kaan.sorgula();
		ozgur.sorgula();
		fikret.sorgula();
		kaan.paraHarca(270,"TL");
		ozgur.paraYatir(40,"USD");
		kaan.kurSorgula();
		fikret.dovizBoz(40,"EURO","TL");
		System.out.println("-------------------");
		kaan.sorgula();
		kaan.dovizBoz(385,"TL","USD");
		kaan.dovizBoz(385,"TL","EURO");
		kaan.sorgula();
		kaan.paraHarca(50,"TL");
	}

}
