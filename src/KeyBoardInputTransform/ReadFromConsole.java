package KeyBoardInputTransform;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ReadFromConsole {
	private Scanner in = new Scanner(System.in);
	
	/**
	 * ��ò��������׼�����ַ�������ΪScanner�����ȡԴ
	 * @param baIn - ���������׼�����ַ������ֽ������ɲ����ഫ��
	 */
	public void setIn(ByteArrayInputStream baIn) {
		// �������� in �Ķ�ȡ����Ϊ �����ֽ��� baIn
		this.in = new Scanner(baIn);
	}
	
	public void ReadAndShow() {
		String line = in.nextLine();
		System.out.println("This is the input: \n"+line);
	}
	
	public static void main(String[] args) {
		ReadFromConsole r = new ReadFromConsole();
		// �����ַ����е� \n ���з����� Scanner.nextline()����ʶ��
		ByteArrayInputStream in1 = new ByteArrayInputStream("1\n2".getBytes());
		r.setIn(in1);
		r.ReadAndShow();
		r.ReadAndShow();
		// ���µ���setIn�������������÷����ַ���
		ByteArrayInputStream in2 = new ByteArrayInputStream("3".getBytes());
		r.setIn(in2);
		r.ReadAndShow();
		
	}
	
}
