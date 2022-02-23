package com.andersen.pre_intensive.patterns_prototype;

public class Table extends Furniture {
	
	String Colour;
	
	public Table() {
	}
	
	public Table(Table target) {
		super(target);
		if(target != null) {
			this.Colour = target.Colour;
		}
	}

	@Override
	public Furniture clone() {
		return new Table(this);
	}

	@Override
	public String toString() {
		return "Table [Colour=" + Colour + ", material=" + material + ", weight=" + weight + "]";
	}

}
