import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		switch (num) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
		}
	}

}
