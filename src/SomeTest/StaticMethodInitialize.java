package SomeTest;

public class StaticMethodInitialize {
	public static String a = "1";
	
	// ������
	static {
		a = "2";
	}
	
	public static void main(String[] args) {
		System.out.println(StaticMethodInitialize.a);
	}
	
}
