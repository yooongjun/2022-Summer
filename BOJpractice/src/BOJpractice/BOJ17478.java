package BOJpractice;

import java.util.Scanner;

public class BOJ17478 {
	static int N;
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		N = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		func(0);
	}
	
	public static void func(int depth) {
		String s = new String();
		for(int i = 0; i<depth; i++) {
			s = s.concat("____");
		}
		System.out.println(s+"\"����Լ��� ������?\"");
		if(depth == N)
		{
			System.out.println(s+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(s + "��� �亯�Ͽ���.");
			return;}
		System.out.println(s+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n" + s+
				"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n" + 
				s + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		func(depth+1);
		System.out.println(s + "��� �亯�Ͽ���.");
	}

}
