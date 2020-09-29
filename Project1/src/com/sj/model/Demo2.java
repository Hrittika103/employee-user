package com.sj.model;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p =(num1)->(num1>50)?true:false;
		System.out.println(p.test(46));
		Supplier <String> s = ()-> "someName";
		Consumer <String> c = (str)->System.out.println("Hello...."+str);
		c.accept(s.get());

	}

}
