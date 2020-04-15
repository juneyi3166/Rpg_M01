package Tools;

public class Gun extends Tool{
	@Override
	public void name() {
		super.name();
		System.out.println("Steel Axe has name");
		
	}

	@Override
	public void purpose() {
		super.purpose();
		System.out.println("Steel Axe has purpose");
		
	}

	@Override
	public void material() {
		super.material();
		System.out.println("Steel Axe is made out of steel");
		
	}
	
	public void shoot() {
		System.out.println("Gun can shoot");
	}
	
	@Override
	public String toString() {
		
		
		return "Gun";
	}
}
