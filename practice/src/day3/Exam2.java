package day3;

public class Exam2 {

	public static void main(String[] args) {
		//1���� 10������ ¦���� ��
		int i;
		int sum = 0;
		/*���1 : 1���� 10���� �ϳ��� �����ϸ鼭 
		 * 		 ¦���̸� ���ϰ� Ȧ���̸� �����Ѵ�.*/
		for(i=1 ; i<=10 ; i++ ){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("���1 : 1���� 10���� ¦���� �� : " + sum);
		/*���2 : 2���� 10���� 2���� �����ϸ鼭 ���Ѵ�.*/
		for(i=2,sum=0; i<=10; i+=2){
			sum += i;
		}
		System.out.println("���2 : 1���� 10���� ¦���� �� : " + sum);
		/*���3 : 1���� 5���� �ϳ��� �����ϸ鼭 �ش���� 2�� ���� ���Ѵ�.*/
		for(i=1, sum=0; i<=5; i++){
			sum += i*2;
		}
		System.out.println("���3 : 1���� 10���� ¦���� �� : " + sum);
	}

}




