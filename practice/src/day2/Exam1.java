package day2;

import java.util.Scanner;

public class Exam1 {
/*	������ �Է¹޾� �Է¹��� ������ ¦������ �ƴ��� Ȯ���ϴ�
	�ڵ带 �ۼ��ϼ���.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		
		//¦�� : num�� 2�� (�������� �� ������)�� 0�� (����)
		boolean isEven = num % 2 == 0;
		System.out.println(isEven);
		scan.close();
	}

}





