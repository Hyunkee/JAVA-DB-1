package day3;

public class Exam4 {

	public static void main(String[] args) {
		/*�� ���� ���μ����� �Ǻ��ϼ���.*/
		int num1=3, num2=7;
		int i, gcd=1;
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		if(gcd == 1){
			System.out.println(num1+"�� " + num2+"�� ���μ� ����");
		}else{
			System.out.println(num1+"�� " + num2+"�� ���μ� ���谡 �ƴ�");
		}
	}

}
