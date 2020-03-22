package assignment.OOP.Interface;

interface IShowAdvertisement{
//	int MAX=100;
	String getCorpName();
	void showContnt();
}
class Arman implements IShowAdvertisement{
	
	@Override
	public String getCorpName() {
//		System.out.println(MAX);
		return "Arman";
	}
	
	@Override
	public void showContnt() {
		System.out.println("Sizning saghlamlighingiz bizning Armanimiz");		
	}	
}

class Nike implements IShowAdvertisement{

	@Override
	public String getCorpName() {
		// TODO Auto-generated method stub
		return "Nike";
	}

	@Override
	public void showContnt() {
		// TODO Auto-generated method stub
		System.out.println("Nothing Impossible");
	}	
}

class Motorola implements IShowAdvertisement{

	@Override
	public String getCorpName() {
		// TODO Auto-generated method stub
		return "Motorola";
	}

	@Override
	public void showContnt() {
		// TODO Auto-generated method stub
		System.out.println("Hello Moto!");
	}
	
}


public class AdvPanel {
	public static void main(String[] args) {
//		System.out.println(IShowAdvertisement.MAX);
		AdvPanel adv=new AdvPanel();
		IShowAdvertisement company=new Arman();
		adv.showBrandAdv(new Arman());
		company=new Nike();
		adv.showBrandAdv(company);
		adv.showBrandAdv(new Motorola());
	}
	
	void showBrandAdv(IShowAdvertisement ad){
		System.out.println(ad.getCorpName()+ " corporation's advertisement is:");
		ad.showContnt();
	}
}
