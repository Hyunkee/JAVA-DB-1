package day3;

public class Exam3 {
	public static void main(String[] args){
		int num1=8, num2=12;
		int i, gcd=1;
		/*�ݺ�Ƚ�� : i�� 1���� num1���� �ϳ��� ����
		���๮
		i�� num1�� num2�� ������̸�
		=>i�� num1�� �����(��) i�� num2�� �����(��)
		gcd�� i�� �����Ѵ�.
		�ݺ����� ����� �� gcd�� ����Ѵ�.*/
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ִ� ����� : " + gcd);
	}
}


