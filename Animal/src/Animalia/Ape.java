package Animalia;

public class Ape extends Mamals{
	@Override
	public void reproduce() {
		super.reproduce();
		System.out.println("Apes Reproduce");
	}

	@Override
	public void cell() {
		super.cell();
		System.out.println("Apes has Cells");
	}
}
