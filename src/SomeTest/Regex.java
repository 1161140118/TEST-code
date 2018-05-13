package SomeTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		String line = " \"0.65\" \"6\" \"String\" ";
		System.out.println(line);
		String pattern = "\"(\\w+(?:\\.\\w+)?)\"";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		while(m.find()) {
			for(int i=1; i <= m.groupCount() ; i++) {
				System.out.println(m.group(i));
			}
			
		}

		System.out.println();

		double weight = 1.22222;
		System.out.println(String.format("%.2f", weight));
		
		/*
		// ��ָ��ģʽ���ַ�������
		line = "This order was placed for QT3000! OK?";
		pattern = "(\\D*)(\\d+)(.*)";

		// ���� Pattern ����
		Pattern r = Pattern.compile(pattern);

		// ���ڴ��� matcher ����
		m = r.matcher(line);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
			System.out.println("Found value: " + m.group(3));
		} else {
			System.out.println("NO MATCH");
		}
		*/

	}

}
