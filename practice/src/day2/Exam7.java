package day2;

import java.util.Scanner;

public class Exam7 {
	/*
	������ �־����� ������ �´� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
	90���̻� ~ 100������ : A
	80���̻� ~ 90���̸� : B
	70���̻� ~ 80���̸� : C
	60���̻� ~ 70���̸� : D
	0���̻� ~ 60���̸� : F
	0���̸�, 100�� �ʰ� : �߸��� �����Դϴ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double score = scan.nextDouble();
		/*if(score>=90 && score <= 100){
			System.out.println("A");
		}else if(score>=80 && score < 90){
			System.out.println("B");
		}else if(score>=70 && score < 80){
			System.out.println("C");
		}else if(score>=60 && score < 70){
			System.out.println("D");
		}else if(score>=0 && score < 60){
			System.out.println("F");
		}else{//else if(score<0 || score>100){
			System.out.println("�߸��� �����Դϴ�.");
		}*/
		if((int)score/10 == 9 || score == 100){
			System.out.println("A");
		}else if((int)score/10 == 8){
			System.out.println("B");
		}else if(score>=70 && score < 80){
			System.out.println("C");
		}else if(score>=60 && score < 70){
			System.out.println("D");
		}else if(score>=0 && score < 60){
			System.out.println("F");
		}else{//else if(score<0 || score>100){
			System.out.println("�߸��� �����Դϴ�.");
		}
		scan.close();
	}

}
