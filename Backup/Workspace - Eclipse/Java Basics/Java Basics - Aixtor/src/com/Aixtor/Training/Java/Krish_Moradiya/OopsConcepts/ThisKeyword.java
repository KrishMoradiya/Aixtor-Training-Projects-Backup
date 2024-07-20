package com.Aixtor.Training.Java.Krish_Moradiya.OopsConcepts;
class A{
	A(){
		System.out.println("This is A Class Constructor..");
		this.ruleOfThis();
	}
	A(A a){
		this();
		System.out.println("This is parameterized constructor...");
	}
	private A getThisClass() {
		return this;
	}
	private void thisClassMethod() {
		System.out.println("this is the method of this class...");
	}
	private void thisClassMethod(A a) {
		a = new A(this);
		System.out.println("this is the parameterized method of this class...");
	}
	public void ruleOfThis() {
		System.out.println(this+" : "+this.getClass()+" : "+this.getClass().getName());
		this.thisClassMethod();
		this.thisClassMethod(this);
		A a1 = new A(this);
		A a = this.getThisClass();
		
		
	}
}
class B{ 
	B getB(){  
		return this;  
	}  
	void msg(){
		System.out.println("Hello java");
	}  
}
class Test1{  
	public void main(){  
		new B().getB().msg(); //Hello java
	} 
} 
class ThisKeyword {
	public static void main(String[] args) {
		A a = new A();
	}
}
