package day1;

import java.util.Scanner;

public class Exam3 {
/*	�ֿܼ��� ���ڸ� �Է¹޾� �Է¹��� ���ڰ� 1���� ũ�ų�
	���� 100���� �۰ų� ������ ����ϼ���.
*/	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		// 1 <= num <= 100
		// 1 <= num && num <= 100
		boolean isScore = false;
		isScore = (1 <= num) && (num <= 100);
		System.out.println(isScore);
		//System.out.println(1 <= num && num <= 100);
		scan.close();
	}

}
