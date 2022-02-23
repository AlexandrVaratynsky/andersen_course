package com.andersen.pre_intensive.patterns_abstract_factory;

public class MetaboFactory implements InstrumentFactory {

	@Override
	public Drill createDrill() {
		return new MetaboDrill ();
	}

	@Override
	public Saw createSaw() {
		return new MetaboSaw();
	}

}
