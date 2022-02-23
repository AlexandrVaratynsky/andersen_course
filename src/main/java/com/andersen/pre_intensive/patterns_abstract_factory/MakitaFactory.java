package com.andersen.pre_intensive.patterns_abstract_factory;

public class MakitaFactory implements InstrumentFactory {

	@Override
	public Drill createDrill() {
		return new MakitaDrill();
	}

	@Override
	public Saw createSaw() {
		return new MakitaSaw();
	}

}
