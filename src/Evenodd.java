import java.util.Scanner;
public class Evenodd {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		num = input.nextInt();
		if (num%2 == 0) {
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		} else {
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		}
		
		System.out.println("���α׷��� �����մϴ�");
	}
}