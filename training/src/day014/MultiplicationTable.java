package day014;

public class MultiplicationTable {
	private int tableFor;
	
	public MultiplicationTable(int tableFor) {
		this.tableFor = tableFor;
	}
	
	public void generate() {
		this.generate(1, 10);
	}
	
	public void generate(int start, int end) {
		this.generate(start, end, 1);
	}
	
	public void generate(int start, int end, int step) {
//		if(start > end) {
//			for(int i = start, v = tableFor * start, s = tableFor * step; i >= end; i -= step, v -= s) {
//				System.out.printf("%d X %d = %d", tableFor, i, v).println();
//			}
//		} else {
//			for(int i = start, v = tableFor * start, s = tableFor * step; i <= end; i += step, v += s) {
//				System.out.printf("%d X %d = %d", tableFor, i, v).println();
//			}
//		}
		
		int sign = Integer.signum(start-end);
		step *= sign;
		
		for(int i = start, v = tableFor * start, s = tableFor * step ;
				sign * (i - end) >= 0; 
				i -= step, v -= s) {
			System.out.printf("%d X %d = %d", tableFor, i, v).println();
		}
		
		
		
		
		
		
		
		
		
//		for(int i = start, v = tableFor * start, s = tableFor * step, sign = Integer.signum(start-end); 
//				sign * (i - end) >= 0; 
//				i = i - sign * step, v = v - sign * s) {
//			System.out.printf("%d X %d = %d", tableFor, i, v).println();
//		}
	}
	
	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable(5);
		mt.generate(6, 2, 3);
	}
}
