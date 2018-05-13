package KeyBoardInputTransform;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;


public class KeyBoard {
	private static ByteArrayInputStream in;
	private static Scanner scanner;
	
	/*
	 * 1.存在 Scanner 对象时，修改Scanner对象参数
	 *   Scanner(ByteArrayInputStream in);
	 *   即直接改变Scanner的输入流。
	 */
	public static void input() {
		String data = "Hello, World!";
		InputStream stdin = System.in;
		try {
			// 输入重定向
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			// 此时 System.in 为ByteArrayInputStream对象
			scanner = new Scanner(System.in);
			System.out.println(scanner.nextLine());
		} finally {
			System.setIn(stdin);
		}
	}
	
	/*
	 * 2.直接重定向输入流
	 *   System.setIn((ByteArrayInputStream in);
	 *   即通过重定向，间接改变输入流
	 */
	
	/**
	 * 设置输入字符串作为输入流
	 * @param input - 测试所需输入字符串
	 */
	public void setInput(String input) {
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	}
		
	 
	@Test
	public void testReadFromConsole() {
		// 换行符\n 以匹配多次  Scanner.nextline()  
		String inputMessage = "one\n"
				+ "two\n"
				+ "three\n" 
				+ "four\n"
				+ "five\n"
				+ "";
		
		// 仅设置一次输入流
		setInput(inputMessage);
		// 直接调用需从控制台输入的方法，不需要调用待测类中的输入流设置方法
		ReadFromConsole r = new ReadFromConsole();
		r.ReadAndShow();
		r.ReadAndShow();
		r.ReadAndShow();
		r.ReadAndShow();
		r.ReadAndShow();
	
	}
	
	public static void main(String[] args) {
		KeyBoard k = new KeyBoard();
		k.testReadFromConsole();
	}

}
