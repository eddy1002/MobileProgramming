
public class Searching {

	public static void search(int[] args, int start, int end, int searchnum) {
		int center = (start + end) / 2;
		
		if (args[center] == searchnum)
			System.out.println(searchnum + "�� �迭�� �����մϴ�.");
		
		else if (args[center] > searchnum){
			if (center > end)
				System.out.println(searchnum + "�� �迭�� �������� �ʽ��ϴ�.");
			else
				search(args, start, center - 1, searchnum);
		}
		
		else if (args[center] < searchnum){
			if (center < start)
				System.out.println(searchnum + "�� �迭�� �������� �ʽ��ϴ�.");
			else
				search(args, center + 1, end, searchnum);
		}

	}

}
