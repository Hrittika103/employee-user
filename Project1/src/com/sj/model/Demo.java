package com.sj.model;

//import com.sj.model.Greeter.Greeting;

public class Demo 
{
    public static void main(String[] args)
	{
		
		//Greeting greeting = new HiGreeting();
		
		//Greeter.Greeting g1 = new Greeter.HelloGreeting();
		//Greeter.Greeting g2 = new Greeter.HiGreeting();
		//new Greeter().greet(g1);
		//new Greeter().greet(g2);
		/*Greeter greeter = new Greeter();
		greeter.greet(new Greeting(){
		public void perform(){
			System.out.println("hello world");
		}
	});
	
		greeter.greet(new Greeting(){
			public void perform(){
				System.out.println("hi world");
			}
		});
		greeter.greet(new Greeting(){
			public void perform(){
				System.out.println("welcome");
		}
		});*/
	
		Greeter greeter = new Greeter();
		greeter .greet( ()->System.out.println("Hello World"));
		greeter.greet(()->System.out.println("Hi world"));
	}
}



