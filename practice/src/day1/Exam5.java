package day1;

public class Exam5 {
	/*���ݱ��� ���� �䰪�� ����Ͽ� ����� ����ϼ���.
	�� �Ϸ翡 3���� �� �԰� �ѳ��� 3000���̴�. ������ �����ϰ�
	���̷θ� ���, ������ ����*/
	public static void main(String[] args) {
		int age = 25;
		int day = 3;
		int money = 3000;
		int year = 365;
		int totalMoney = age * day * money * year;
		
		System.out.println("���ݱ��� ���� �ݾ� : " + totalMoney + "��");
	}

}
