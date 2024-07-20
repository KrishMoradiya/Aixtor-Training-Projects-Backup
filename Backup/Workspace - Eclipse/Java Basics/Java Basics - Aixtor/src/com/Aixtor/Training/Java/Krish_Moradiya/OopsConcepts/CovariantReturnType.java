package com.Aixtor.Training.Java.Krish_Moradiya.OopsConcepts;
class A2{
	protected A2 get() {
		return this;
	}
}
class B2 extends A2{
	public B2 get() {
		return this;
	}
	public void msg() {
		System.out.println("This is B that extend A...");
	}
}
class CovariantReturnType {
	public static void main(String[] args) {
		new B2().get().msg();	
	}
}
