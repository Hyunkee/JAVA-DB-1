package day2;

public class Exam6 {
	//num�� 2�� ����̸� 2�� ������ ����ϰ�
	//num�� 3�� ����̸� 3�� ������ ����ϰ�
	//num�� 6�� ����̸� 6�� ������ ����ϰ�
	//num�� 2,3,6�� ����� �ƴϸ� 2,3,6�� ����� �ƴմϴ�
	//��� ����ϴ� ����
	//num = 6 => 6�ǹ���Դϴٸ� ����ؾ� �Ѵ�
	//������ ���� : ���ǹ����� ������ �߿��ϴٴ� �� Ȯ��
	public static void main(String[] args) {
		int num = 6;
		if(num  % 2 == 0 && num % 3 != 0 ){
			System.out.println(num+"�� 2�� ���");
		}else if(num % 3 == 0 && num % 2 != 0){
			System.out.println(num+"�� 3�� ���");
		}else if(num % 6 == 0){
			System.out.println(num+"�� 6�� ���");
		}else{
			System.out.println(num+"�� 2,3,6�� ����� �ƴ�");
		}
	}
}





