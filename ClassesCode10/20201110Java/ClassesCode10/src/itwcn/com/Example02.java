/**
 * 
 */
package itwcn.com;

import java.io.IOException;
import java.util.Random;

/**
 * @author Administrator
 *
 */
public class Example02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefgadeabcadefgh";	//��ʼ���ַ���
		String a = "AmbiTIOUS Ant";		//��ʼ��a�ַ���
		String b = "           Original Coder       ";
		System.out.println("�ַ������ȣ�" + s.length());
		System.out.println("�ַ����ĵ�һ���ַ���" + s.charAt(0));
		System.out.println("��ĸc��һ�γ��ֵ�λ�ã�" + s.indexOf('c'));
		System.out.println("��ĸc���һ�γ��ֵ�λ�ã�" + s.lastIndexOf('c'));
		System.out.println("���ַ�����һ�γ��ֵ�λ�ã�" + s.indexOf("abc"));
		System.out.println("���ַ������һ�γ��ֵ�λ�ã�" + s.lastIndexOf("abc"));
		System.out.println("���ַ���ȫ��ת��Ϊ��д��ĸ��" + s.toUpperCase());
		System.out.println("��a�ַ���ת��ΪСд��ĸ��" + a.toLowerCase());
		System.out.println("��ȡade�����Ժ�����ݣ�" + s.substring(7));
		System.out.println("ָ����ȡ�����ݣ�" + s.substring(3, 9));
		String res = b.trim();
		System.out.println("����һ�����ַ�����ȥ����β�Ŀո�" + b.trim() + "b�ַ����ĳ��ȣ�" + res.length());
		System.out.println("b���ַ�����" + b + "b�ַ����ĳ���Ϊ��" + b.length());
		
		System.out.println("��Ant�滻�ɴ��빥��ʨ��" + a.replace("Ant", "���빥��ʨ"));
		
		long t = System.currentTimeMillis();  		//�����Ժ���Ϊ��λ�ĵ�ǰʱ��
		System.out.println("��ǰʱ�䣺" + t);
		
		System.out.println("��1234ת�����ַ�����" +  String.valueOf(1234));
		System.out.println("===================================================");
		System.out.println("��asd,df,aaa,g,rrr�ֽ�Ϊ���飺");
		String str = "asd,df,aaa,g,rrr";
		String[] strArr = str.split(",");
		for(String m:strArr) {
			System.out.println(m);
		}
		
		
		
		//runtime��  ������ִ��DOS����Ĵ���
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("javac hello.java");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//����ֵ
		double dA = Math.abs(-9);
		System.out.println(dA);
		
		//���ɶ���
		double dB = Math.pow(3, 2);
		double dC = Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
		System.out.println("�ҳ���" + dC);
		
		
		//��ȡ�����
		Random random  = new Random();
		int iR = random.nextInt();
		int i = 0;
		do {
			iR = random.nextInt(10);
			System.out.println("�������" + iR);
			i++;
		} while(i<10);
		
		
		
		
		//��װ��
		Double dd1 = 0.00;		//����ͨ��doule���з�װ��������һ��Double��
		double dd2 = 0.00;		//������������
		//��Double������
		Double dd3 = new Double(0.00);
	}

}