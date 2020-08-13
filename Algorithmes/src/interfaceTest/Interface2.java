package interfaceTest;

@FunctionalInterface
public interface Interface2 {

	public default void log(String s)
	{
		System.out.println("Inteface1 default log method: "+s);
	}
	public static void print(String s)
	{
		System.out.println("Inteface1 static print method: "+s);
	}
	public void method2();
}
