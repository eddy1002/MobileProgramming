import java.util.*;

public class Main {
	static Scanner in;
	static int maxnum = 100; //���� �� �ִ� ������ �ִ� ����
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int[] fnumbers = new int[maxnum];
		int count = 0; int searchNum;
		
		System.out.println("���ڸ� ���ʴ�� �Է��ϼ���.(�ִ� " + maxnum + "��) q�� �Է½� �Է��� ����");
		
		while(true){
			String numbers = in.next();
			if (numbers.equals("q") || numbers.equals("Q"))
				break;
			
			fnumbers[count++] = Integer.parseInt(numbers);
		}
		
		Sorting.qsort(fnumbers, 0, count - 1); //����Ʈ
		
		Printer.printer(fnumbers, count); //��� ���
		
		System.out.println("\nã�� ���ڸ� �Է����ּ���. q�� �Է½� �Է��� ����");
		
		while(true){
			String numbers = in.next();
			if (numbers.equals("q") || numbers.equals("Q"))
				break;
			
			searchNum = Integer.parseInt(numbers);
			
			Searching.search(fnumbers, 0, count, searchNum);
		}
	}

}
