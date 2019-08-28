package com.revature.oop;

import java.io.Serializable;

public class Digimon extends Monster implements Fight, Serializable {

	private boolean Digivolve;
	
	public Digimon(String name, int size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	public Digimon(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	public void Rumble() {
		// TODO Auto-generated method stub

	}
	
	public void DDigivolve() {
		if (Digivolve == true) {
			System.out.println(this.getName() + " can Digivolve");
		}else {
			System.out.println(this.getName() + " can't Digivolve");
		}
	}

	@Override
	public void roar() {
		// TODO Auto-generated method stub

	}

	public boolean isDigivolve() {
		return Digivolve;
	}

	public void setDigivolve(boolean digivolve) {
		Digivolve = digivolve;
	}

	@Override
	public String toString() {
		return "Digimon [Digivolve=" + Digivolve + ", getName()=" + getName() + ", getSize()=" + getSize()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ "]";
	}
	
	
	
	
	
	

}
