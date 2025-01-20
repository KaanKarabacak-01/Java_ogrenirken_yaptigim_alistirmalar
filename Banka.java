package calismalar;

public class Banka {
	String ad;
	private float tl=0;
	private float usd=0;
	private float euro=0;
	double tl_usd_kur=35.59;
	double tl_euro_kur=36.69;
	double usd_euro_kur=0.97;
	
	public Banka(String a,int b,String c) {
		ad=a;
		if(c=="TL")
		this.tl+=b;
		else if(c=="USD")
		this.usd+=b;
		else if(c=="EURO")
		this.euro+=b;
	}
	
	public Banka(String a,int b,String c,int d,String f) {
		ad=a;
		if(c=="TL")
		this.tl+=b;
		else if(c=="USD")
		this.usd+=b;
		else if(c=="EURO")
		this.euro+=b;
		
		if(f=="TL")
		this.tl+=d;
		else if(f=="USD")
		this.usd+=d;
		else if(f=="EURO")
		this.euro+=d;
	}
	
	public Banka(String a,int b,String c,int d,String f,int g,String h) {
		ad=a;
		if(c=="TL")
		this.tl+=b;
		else if(c=="USD")
		this.usd+=b;
		else if(c=="EURO")
		this.euro+=b;
		
		if(f=="TL")
		this.tl+=d;
		else if(f=="USD")
		this.usd+=d;
		else if(f=="EURO")
		this.euro+=d;
		
		if(h=="TL")
		this.tl+=g;
		else if(h=="USD")
		this.usd+=g;
		else if(h=="EURO")
		this.euro+=g;
	}
	
	public void sorgula() {
		System.out.println(ad);
		System.out.println("Türk Lirası bakiyeniz: "+tl+"TL");
		System.out.println("Dolar bakiyeniz: "+usd+"$");
		System.out.println("Euro bakiyeniz: "+euro+"€");
	}
	
	public void paraHarca(int a,String b) {
	if(b=="TL") {if(a>this.tl) {System.out.println("Yetersiz bakiye");return;}else{this.tl+=a;}}
	else if(b=="EURO") {if(a>this.euro) {System.out.println("Yetersiz bakiye");return;}else{this.euro+=a;}}
	else if(b=="USD") {if(a>this.usd) {System.out.println("Yetersiz bakiye");return;}else{this.usd+=a;}}
	}
	
	public void paraYatir(int a,String b) {
		if(b=="TL")
		this.tl+=a;
		else if(b=="USD")
		this.usd+=a;
		else if(b=="EURO")
		this.euro+=a;
	}
	
	public void kurSorgula() {
		System.out.println("TL-USD "+tl_usd_kur);
		System.out.println("TL-EURO "+tl_euro_kur);
		System.out.println("USD-EURO "+usd_euro_kur);
	}
	
	public void dovizBoz(int a,String b,String c) {
		if(b=="TL") {
			if(c=="USD") {
				if(a<=this.tl) {
					tl-=a;
					usd+=a/tl_usd_kur;
					
				}
				else {
					System.out.println("Yetersiz bakiye");
				}
			}
			else if(c=="EURO") {
				if(a<=this.tl) {
					tl-=a;
					euro+=a/tl_euro_kur;
				}
				else {
					System.out.println("Yetersiz bakiye");
				}
			}
		}
		else if(b=="USD") {
			if(c=="TL") {
				if(a<=this.usd) {
					usd-=a;
					tl+=a*tl_usd_kur;
					
				}
				else {
					System.out.println("Yetersiz bakiye");
				}
			}
			else if(c=="EURO") {
				if(a<=this.usd) {
					usd-=a;
					euro+=a*usd_euro_kur;
				}
				else {
					System.out.println("Yetersiz bakiye");
				}
			}
		}
		else if(b=="EURO") {
			if(c=="TL") {
				if(a<=this.euro) {
					euro-=a;
					tl+=a*tl_euro_kur;
					
				}
				else {
					System.out.println("Yetersiz bakiye");
				}
			}
			else if(c=="USD") {
				if(a<=this.euro) {
					euro-=a;
					usd+=a/usd_euro_kur;
				}
				else {
					System.out.println("Yetersiz bakiye");
				}
			}
		}
	}
	
	
	
	
	
}
