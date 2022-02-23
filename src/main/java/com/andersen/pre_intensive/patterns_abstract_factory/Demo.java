package com.andersen.pre_intensive.patterns_abstract_factory;

public class Demo {

	private static Application configApp(int i) {

		Application app;
		InstrumentFactory factory;

		if (i == 1) {
			factory = new MetaboFactory();
			app = new Application(factory);
		} else {
			factory = new MakitaFactory();
			app = new Application(factory);
		}

		return app;
	}
	
	public static void main(String []args) {
		
		Application app = configApp(2);
		app.work();
	}
}
