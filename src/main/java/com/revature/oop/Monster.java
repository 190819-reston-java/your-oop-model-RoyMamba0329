package com.revature.oop;

public abstract class Monster {
	
	private String name;
	private int size;
	
	public Monster(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public Monster(String Name) {
		this(Name, 100);
	}
	
	public void Stomp() {
		if (this.size > 50) {
			System.out.println(this.name + " is stomping");
		}else {
			System.out.println(this.name + " is not stomping.");
		}
	}
	
	public abstract void roar();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monster other = (Monster) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", size=" + size + "]";
	}
	
	
	
	
	
}
