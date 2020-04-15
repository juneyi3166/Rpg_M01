package Animalia;

import Tools.*;
import Inventory.*;
import java.util.*;

public class Main {
	
	static Tool stoneAxe = new StoneAxe();
	static Tool steelAxe = new SteelAxe();
	static Tool gun = new Gun();
	
	Tool tool = new Tool();

	public static void main(String[] args){
		Inventory suminInv = new Inventory("Sumin", new Tool[3]);
		Inventory sugwanInv = new Inventory("Sugwan", new Tool[3]);
		Human sumin = new Human(suminInv, "sumin", 14);
		Human sugwan = new Human(sugwanInv, "sugwan", 10);
		
		
//		checkInput(sumin);
//		System.out.println("sumin can obtain");
//		
//		checkInput(sumin);
//		
//		checkInput(sumin);
//		System.out.println("sumin can discard");
//
//		checkInput(sumin);
		
		checkInput(sumin);
		
		checkInput(sugwan);
	}

	public static void checkInput(Human human) {;
		Scanner scanner = new Scanner(System.in);
		
		String answer = scanner.next();
		
		if(answer.equals("human")) { // if input is human
			System.out.println("Name: " + human.name);
			System.out.println("Age: " + human.age);
			
			System.out.println();
			
			human.inventory.showInventory(); //show inventory
			
			System.out.println();
			
			human.humanAct(); // show what human can do
			System.out.println();
			
		} else if (answer.equals("obtain")){ // if input is obtain
			
			human.obtain(stoneAxe, human.inventory); // put stone axe in the inventory
			
			human.inventory.showInventory(); //show inventory
			
			
			System.out.println();
			
		} else if (answer.equals("discard")) { // if input is discard
			
			human.discard(stoneAxe, human.inventory); // discard stone axe
			
			human.inventory.showInventory(); //show inventory
			
			System.out.println();
			
		}
	}
}
