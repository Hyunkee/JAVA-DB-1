package day3;

public class Exam6 {

	public static void main(String[] args) {
		//i�� num1�� ��� : i % num1 == 0
		/*�ݺ�ȸ�� : i�� 1���� num1*num2���� �ϳ��� ����
		���๮
		i�� num1�� ����̰� i�� num2�� ����̸�
		lcm�� i�� �����ϰ� �ݺ����� �������´�.
		�ݺ����� ����� �� lcm�� ����Ѵ�.*/
		int num1 = 10000, num2 = 20000;
		int i, lcm = 1;
		for(i=1; i<=num1*num2; i+=1){
			if(i % num1 == 0 && i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ּ� ����� : " + lcm);
		for(i=num1; i<=num1*num2; i+=num1){
			if(i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ּ� ����� : " + lcm);
		int tmp;
		if(num2 > num1){
			// �� ���� �ٲ۴�
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(i=num1; i<=num1*num2; i+=num1){
			if(i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ּ� ����� : " + lcm);
	}

}
