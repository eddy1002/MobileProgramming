import java.util.*;

public class Main {
	static Scanner in;
	static int maxnum = 100; //받을 수 있는 숫자의 최대 개수
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int[] fnumbers = new int[maxnum];
		int count = 0; int searchNum;
		
		System.out.println("숫자를 차례대로 입력하세요.(최대 " + maxnum + "개) q를 입력시 입력이 종료");
		
		while(true){
			String numbers = in.next();
			if (numbers.equals("q") || numbers.equals("Q"))
				break;
			
			fnumbers[count++] = Integer.parseInt(numbers);
		}
		
		Sorting.qsort(fnumbers, 0, count - 1); //퀵소트
		
		Printer.printer(fnumbers, count); //결과 출력
		
		System.out.println("\n찾을 숫자를 입력해주세요. q를 입력시 입력이 종료");
		
		while(true){
			String numbers = in.next();
			if (numbers.equals("q") || numbers.equals("Q"))
				break;
			
			searchNum = Integer.parseInt(numbers);
			
			Searching.search(fnumbers, 0, count, searchNum);
		}
	}

}
