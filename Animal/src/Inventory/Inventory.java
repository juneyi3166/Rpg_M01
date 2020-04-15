package Inventory;

import Animalia.Human;
import Tools.Tool;

public class Inventory {
	public Tool[] toolInventory = null;
	public String owner;
	
	public Inventory(String owner, Tool[] tool) {
		this.owner = owner;
		toolInventory = tool;
	}
	
	public void showInventory() {
		
		System.out.println("Owner: " + owner);
		
		System.out.println("ITEM: \n"); // show inventory
		for(int i = 0; i < toolInventory.length; i ++) {
			System.out.println(toolInventory[i]);
		}
	}
}