import java.util.Scanner;
public class Lec2Ex1 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 < num2){
			System.out.println(num2);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}

}
