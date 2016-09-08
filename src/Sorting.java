
public class Sorting {

	public static void qsort(int[] args, int left, int right) {
		if(left < right){
			int pivot = args[left];
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
			args[left] = args[lcount];
			args[lcount] = pivot;
			
			if (left < lcount - 1)
				qsort(args, left, lcount - 1);
			if (lcount + 1 < right)
				qsort(args, lcount + 1, right);
		}
		
		Printer.printer(args, right);
		System.out.print("/");
	}
}
