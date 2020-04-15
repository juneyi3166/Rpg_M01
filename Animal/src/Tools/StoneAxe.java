package Tools;

public class StoneAxe extends Axe{
	@Override
	public void name() {
		super.name();
		System.out.println("Stone Axe has name");
		
	}

	@Override
	public void purpose() {
		super.purpose();
		System.out.println("Stone Axe has purpose");
		
	}

	@Override
	public void material() {
		super.material();
		System.out.println("Stone Axe is made out of stone");
		
	}
	
	public void cut() {
		System.out.println("Stone Axe can cut");
	}
	
	@Override
	public String toString() {
		
		
		return "Stone Axe";
	}
}
