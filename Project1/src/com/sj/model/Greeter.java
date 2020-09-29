package com.sj.model;
@FunctionalInterface

interface Greeting{
	 public void perform();
}
  class A
{

	public void perform() {
		// TODO Auto-generated method stub
		 System.out.println("A message");
		
	}
	
}
public class Greeter {

	
     public void greet(Greeting greeting)
     {
    	 greeting.perform();
     }
     //static class HelloGreeting implements Greeting
     //{

     	//public void perform() {
     		// TODO Auto-generated method stub
     		// System.out.println("Hello Greeting");
     		
     	//}
     	
     //}
    //static  class HiGreeting implements Greeting
     //{

     	//@Override
     	//public void perform() {
     		// TODO Auto-generated method stub
     		// System.out.println("Hi Greeting");
     		
     	//}
     	
     //}
    
}

