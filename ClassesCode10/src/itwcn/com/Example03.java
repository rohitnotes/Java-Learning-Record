/**
 * 
 */
package itwcn.com;

/**
 * @author Administrator
 *
 */
public class Example03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbA = new StringBuffer();	//����һ���ַ��������� ,�̰߳�ȫ
		StringBuilder sbB = new StringBuilder();	//�̲߳���ȫ���ڶ��̻߳�����
		sbA.append("bcdadefgaaa");		//�����ַ���
		int intA = sbA.indexOf("ade");
		System.out.println("append���ӵĽ����" + intA);
		
		String a = "ababkfhanfsa";
		System.out.println("��Ant�滻�ɴ��빥��ʨ��" + a.replace("Ant", "���빥��ʨ"));

	}

}