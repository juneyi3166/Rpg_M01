package Animalia;

public class Animal implements BioticIF{

	@Override
	public void reproduce() {
		System.out.println("Animals Reproduce");
		
	}	

	@Override
	public void cell() {
		System.out.println("Animals Has Cells");
	}
	
	@Override
	public void name() {
		System.out.println("Animals Has name");
	}
}
