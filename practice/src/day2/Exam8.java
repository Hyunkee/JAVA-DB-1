package day2;

public class Exam8 {
	public static void main(String[] args) {
		int num = 6;
		/*if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "�� 6�� ���");
		}*/
		if(num % 2 == 0){
			if(num % 3 == 0){
				System.out.println(num + "�� 6�� ���");
			}else{
				System.out.println(num + "�� 2�� ���");
			}
		}else if(num % 3 == 0){
			System.out.println(num + "�� 3�� ���");
		}else{
			System.out.println(num + "�� 2,3,6�� ����� �ƴ�");
		}
	}
}
