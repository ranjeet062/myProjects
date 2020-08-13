package interfaceTest;

public class MyClass implements Interface1,Interface2{

	@Override
	public void method2() {
		System.out.println("MyClass method 2");
	}

	@Override
	public void method1() {
		System.out.println("MyClass method 1");
	}

	
	@Override
	public void log(String s) {
		// TODO Auto-generated method stub
	}
	static void print()
	{
		Interface1.print("test");
		System.out.println("MyClass print method");
	}

	public static void main(String[] args) {
		MyClass m  = new MyClass();
		m.log("Ranjeet");
		m.print();
	}
}
