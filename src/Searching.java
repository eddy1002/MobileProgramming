
public class Searching {

	public static void search(int[] args, int start, int end, int searchnum) {
		int center = (start + end) / 2;
		
		if (args[center] == searchnum)
			System.out.println(searchnum + "은 배열에 존재합니다.");
		
		else if (args[center] > searchnum){
			if (center > end)
				System.out.println(searchnum + "은 배열에 존재하지 않습니다.");
			else
				search(args, start, center - 1, searchnum);
		}
		
		else if (args[center] < searchnum){
			if (center < start)
				System.out.println(searchnum + "은 배열에 존재하지 않습니다.");
			else
				search(args, center + 1, end, searchnum);
		}

	}

}
