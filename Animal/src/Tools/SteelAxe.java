package Tools;

public class SteelAxe extends Axe{
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
	public void cut() {
		System.out.println("Steel Axe can cut");
	}
	
	@Override
	public String toString() {
		
		
		return "Steel Axe";
	}
}
