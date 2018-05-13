package KeyBoardInputTransform;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;


public class KeyBoard {
	private static ByteArrayInputStream in;
	private static Scanner scanner;
	
	/*
	 * 1.���� Scanner ����ʱ���޸�Scanner�������
	 *   Scanner(ByteArrayInputStream in);
	 *   ��ֱ�Ӹı�Scanner����������
	 */
	public static void input() {
		String data = "Hello, World!";
		InputStream stdin = System.in;
		try {
			// �����ض���
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			// ��ʱ System.in ΪByteArrayInputStream����
			scanner = new Scanner(System.in);
			System.out.println(scanner.nextLine());
		} finally {
			System.setIn(stdin);
		}
	}
	
	/*
	 * 2.ֱ���ض���������
	 *   System.setIn((ByteArrayInputStream in);
	 *   ��ͨ���ض��򣬼�Ӹı�������
	 */
	
	/**
	 * ���������ַ�����Ϊ������
	 * @param input - �������������ַ���
	 */
	public void setInput(String input) {
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	}
		
	 
	@Test
	public void testReadFromConsole() {
		// ���з�\n ��ƥ����  Scanner.nextline()  
		String inputMessage = "one\n"
				+ "two\n"
				+ "three\n" 
				+ "four\n"
				+ "five\n"
				+ "";
		
		// ������һ��������
		setInput(inputMessage);
		// ֱ�ӵ�����ӿ���̨����ķ���������Ҫ���ô������е����������÷���
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
