package com.tech;

//Java program implementing Singleton class
//with using getInstance() method

//Class 1
//Helper class
class Singleton {
	// Static variable reference of single_instance
	// of type Singleton
	private static Singleton variable = null;
	
	

	// Declaring a variable of type String
	public String s;

	// Constructor
	// Here we will be creating private constructor
	// restricted to this class itself
	private Singleton()
	{
		s = "Hello I am a string part of Singleton class";
	}

	// Static method
	// Static method to create instance of Singleton class
	public static synchronized Singleton student()
	{
		if (variable == null)
			{
			variable = new Singleton();
			}
		

		return variable;
	}
}

//Class 2
//Main class
