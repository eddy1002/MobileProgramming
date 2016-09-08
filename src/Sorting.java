
public class Sorting {

	public static void qsort(int[] args, int left, int right) {
		if(left < right){
			int pivot = args[left]; //제일 첫 인덱스를 pivot으로
			int lcount = left + 1;
			int rcount = right;
			
			while(lcount < rcount){
				while(rcount > left && pivot < args[rcount])
					rcount--;
				
				if (rcount < left + 1){
					lcount = left;
					break;
				}
				
				while(lcount < right && lcount < rcount && pivot >= args[lcount])
					lcount++;
				
				if (lcount < rcount){
					int bank = args[lcount];
					args[lcount] = args[rcount];
					args[rcount] = bank;
				}
			}
			
			if (args[left] > args[lcount]){
				args[left] = args[lcount];
				args[lcount] = pivot;
			}
			
			if (lcount + 1 < right)
				qsort(args, lcount + 1, right);
			if (lcount - 1 > left)
				qsort(args, left, lcount - 1);
		}
	}
}
