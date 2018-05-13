package KeyBoardInputTransform;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ReadFromConsole {
	private Scanner in = new Scanner(System.in);
	
	/**
	 * 获得测试所需标准输入字符串，作为Scanner对象读取源
	 * @param baIn - 测试所需标准输入字符串的字节流，由测试类传入
	 */
	public void setIn(ByteArrayInputStream baIn) {
		// 更改类内 in 的读取对象为 输入字节流 baIn
		this.in = new Scanner(baIn);
	}
	
	public void ReadAndShow() {
		String line = in.nextLine();
		System.out.println("This is the input: \n"+line);
	}
	
	public static void main(String[] args) {
		ReadFromConsole r = new ReadFromConsole();
		// 输入字符串中的 \n 换行符将被 Scanner.nextline()方法识别
		ByteArrayInputStream in1 = new ByteArrayInputStream("1\n2".getBytes());
		r.setIn(in1);
		r.ReadAndShow();
		r.ReadAndShow();
		// 重新调用setIn方法以重新设置分配字符串
		ByteArrayInputStream in2 = new ByteArrayInputStream("3".getBytes());
		r.setIn(in2);
		r.ReadAndShow();
		
	}
	
}
