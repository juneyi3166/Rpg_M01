package Animalia;

import Tools.*;
import Inventory.*;
import java.util.Scanner;

public class Human extends Ape{
	Inventory inventory = null;
	public String name;
	public int age;
	 
	public Human(Inventory inv, String name, int age) {
		this.inventory = inv;
		
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void reproduce() {
		super.reproduce();
		System.out.println("Human Reproduce");
	}

	@Override
	public void cell() {
		super.cell();
		System.out.println("Human has Cells");
	}
	
	public void obtain (Tool t, Inventory inv) {
		int i = 0;

		for (Tool object : inv.toolInventory) {
			
			if (object == null) {
				inv.toolInventory[i] = t;
				System.out.println(inv.toolInventory[i] + " is obtained");
				break;
			}
			
			i ++;
		}
	}

	public void discard (Tool tool, Inventory inv) {
		int count = 0;
		
		for (Tool t : inv.toolInventory) {
			if (t.equals(tool)) {
				inv.toolInventory[count] = null;
				System.out.println("The tool has been discarded.");
				break;
				
			} else if(!t.equals(tool) && count == inv.toolInventory.length - 1) {
				System.out.println("item not found");
			}
		}
		
		count++;
	}
	
	public void humanAct() {
		reproduce();
		cell();
	}
}