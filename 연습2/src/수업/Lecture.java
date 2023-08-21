package ����;

import java.io.File;
import java.io.IOException;
// Lecture : computerSum�� computerAverageFromFile��� �ΰ��� ����� ���ǵ� ���
// �ƹ��ų� ������ �� ����
public class Lecture {
	
	public void computerAverageUsing() throws IOException {
		File file; //-> �޸� �Ҵ� �� �ּ�����
		file = new File("score.txt"); //-> File�� Open�� -> �� Ư���� ���� = Parameter
		// new : 1. �޸� ���� Ȯ��, 2. �޸� ���� �ּҸ� 'file'�̸��� ��������
		// �������� ���� : �о�� �����̸��� ������ �ʾҴ�.
		Scanner scanner = new Scanner(file); //������ �����о���°��� �ƴ϶�, ���� ���� �о ������ ���ִ� ��
		//scanner.delimiter(); ���� �ν� ���� �����
		//�⺻ delimiter : �������, �����ǵ�, ����ĳ����

		String names[] = new String[10];	// �����ּ� + ���° �ּ�  => HDD�� ������ �޸𸮷� �ø��� ������ 
		float scores[] = new float[10]; // 10���� ������ �Ҹ�     => HDD�� ������ �޸𸮷� �ø��� ������
		char grades[] = new char[10];// ����ؼ� �����ϱ� ����
		//0~9�� ������ �޸� �Ҵ�
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) { //->boolean
			names[count] = scanner.next();//String�� �д� �� -> Space�� ĳ���� ����, ������� ���� ����� / �޸� �̹� Ȯ����
			scores[count] = scanner.nextInt();//���ڿ��� �а� �̰��� Float�� ��ȯ�ض�
			if(scores[count]>90) {
				grades[count]='A';
			}else if(scores[count]>80) {
				grades[count]='B';
			}else if(scores[count]>70) {
				grades[count]='C';
			}else if(scores[count]>60) {
				grades[count]='D';
			}else{
				grades[count]='F';
			}
			sum = sum + scores[count];
			System.out.println(names[count]);
			System.out.println(scores[count]);
			count++; //count = count + 1;
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {//count������ŭ ��
			System.out.print(names[i]);
			System.out.print(scores[i]);//Carriage Return + Line Feed = ln = "\n"
			System.out.println(grades[i]);
		}
		avg = sum/count; // -> 0���� ������ �� �ִ� ������ ����!! -> �ذ��ϴ� ���� ����
		System.out.println("\r\n"+avg);

		//String name1 = scanner.next();// ������ ���� �о��
		//float score1 = scanner.nextFloat();

		scanner.close(); //�̸� �ص� ��, �׸��� �� ���̿� �ڵ��ϱ�


	}
		
}
