package interfaceTest;

import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {

		MainClass main = new MainClass();
		System.out.println(main.test());
		main.test2();
	}

	public int test() {
		try {
			return 1;
		} finally {
			return 2;
		}

	}

	public void test2() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("--------------------");
			TestB b = new TestB();
			b.print(e);

		}

	}

	public void test3() {
		try {

		} catch (Error e) {
		} finally {
		}
	}

}