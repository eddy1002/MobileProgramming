import java.util.*;

public class Main {
	static Scanner in;
	static int maxnum = 100;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int[] fnumbers = new int[maxnum];
		int count = 0;
		
		System.err.println("���ڸ� ���ʴ�� �Է��ϼ���. q�� �Է½� �Է��� ����");
		
		while(true){
			String numbers = in.next();
			if (numbers.equals("q") || numbers.equals("Q"))
				break;
			
			fnumbers[count++] = Integer.parseInt(numbers);
		}
		System.out.println(count);
		Sorting.qsort(fnumbers, 0, count - 1);
		Printer.printer(fnumbers, count);
	}

}
