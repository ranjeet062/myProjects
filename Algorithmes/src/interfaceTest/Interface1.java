package interfaceTest;

@FunctionalInterface
public interface Interface1 {

	public default void log(String s)
	{
		System.out.println("Inteface1 : "+s);
	}
	public static void print(String s)
	{
		System.out.println("Inteface1 : "+s);
	}
	public void method1();
}
