package com.andersen.pre_intensive.patterns_prototype;

public class Chair extends Furniture {
	
	String Colour;
	
	public Chair() {
	}
	
	public Chair(Chair target) {
		super(target);
		if (target != null) {
			this.Colour = target.Colour;
		}
	}

	@Override
	public Furniture clone() {
		return new Chair(this);
	}

	@Override
	public String toString() {
		return "Chair [Colour=" + Colour + ", material=" + material + ", weight=" + weight + "]";
	}

}
