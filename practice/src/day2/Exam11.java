package day2;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 3;
		//min~ max������ ������ �������� �����ϴ� �ڵ�
		//com�� ����(1), ����(2), ��(3)�߿��� �������� �ϳ� ����
		int com = (int)(Math.random()*(max-min+1) + min);
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ��� : >");
		user = scan.nextInt();
		switch(user-com){
		case 0:
			System.out.println("���º��Դϴ�.");
			break;
		case -1: case 2:
			System.out.println("��ǻ�� ���Դϴ�.");
			break;
		case 1: case -2://default:
			System.out.println("����� ���Դϴ�.");
			break;
		}
		scan.close();
	}
}
