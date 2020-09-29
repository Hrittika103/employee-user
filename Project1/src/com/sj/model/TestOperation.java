package com.sj.model;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
        invokeOperation(x,y,(x1,  y1)->{return (x1+y1);});
        invokeOperation(x,y,( x1,  y1)->{return (x1-y1);});
        invokeOperation(x,y,( x1,  y1)->{return (x1/y1);});
        invokeOperation(x,y,( x1,  y1)->{return (x1*y1);});
        
	}

	public static void invokeOperation(int a, int b, MathOperation op) {
		// TODO Auto-generated method stub
		System.out.println(op.operate(a,b));
	}
}


	