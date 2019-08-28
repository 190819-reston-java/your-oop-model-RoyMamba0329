package com.revature.oop;

import java.util.Random;

public class Pokemon extends Monster implements Fight {
	
	public static int pokedexNumber = 0;
	Random rand = new Random();

	public Pokemon(String name, int size) {
		super(name, size);
		pokedexNumber = rand.nextInt(689);
	}

	public Pokemon(String Name) {
		super(Name);
		pokedexNumber = rand.nextInt(689);
	}

	public void Rumble() {
		System.out.println("Lets get ready to rumble!");

	}

	@Override
	public void roar() {
		Rumble();

	}
	
	@Override
	public void Stomp() {
		super.Stomp();
		
		if (getSize() > 200) {
			System.out.println("Pokemon is Stomping.");
		}else {
			System.out.println("Pokemon is to small to stomp.");
		}
		
	}

	@Override
	public String toString() {
		return "Pokemon [Pokedex Entry: #" + pokedexNumber + ", getName()=" + getName() + ", getSize()=" + getSize() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	

}
