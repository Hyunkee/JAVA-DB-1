package day2;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		//�ݺ�Ƚ�� : i�� 1���� num���� �۰ų� ���� ������ 1�� �����Ѵ�
		for(i=1,cnt=0; i<=num; i++ ){
			//i�� num�� ����̸� ����� ������ �ϳ� ����
			//num�� i�� �������� �� �������� 0�� ���� => i�� num�� ���
			if(num % i == 0){
				cnt++;//cnt +=1;//cnt = cnt+1;//++cnt;
			}
		}
		//����� ������ 2���̸� �Ҽ���� ���
		if(cnt == 2){
			System.out.println(num+"�� �Ҽ�");
		}
		//2���� �ƴϸ� �Ҽ��� �ƴ��̶�� ���
		else{
			System.out.println(num+"�� �Ҽ��� �ƴ�");
		}
		scan.close();
	}

}
