package PlusJunitTest;

public class Plus {

	public int plus(int a , int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Plus p = new Plus();
		int a = p.plus(1, 2);
		System.out.println(a);
	}
}
