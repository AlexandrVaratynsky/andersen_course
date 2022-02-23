package com.andersen.pre_intensive.patterns_abstract_factory;

public class Application {
	
	private Drill drill;
	private Saw saw;
	
	public Application(InstrumentFactory factory) {
		
		drill = factory.createDrill();
		saw = factory.createSaw();
	}
	
	public void work() {
		
		drill.work();
		saw.work();
	}
}
