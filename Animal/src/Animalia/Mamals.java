package Animalia;

public class Mamals extends Animal{
	@Override
	public void reproduce() {
		super.reproduce();
		System.out.println("Mamals Reporduce");
	}

	@Override
	public void cell() {
		super.cell();
		System.out.println("Mamals has Cells");
	}
}
