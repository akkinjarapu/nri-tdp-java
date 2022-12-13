package day035;

public class Thread04 implements Runnable {
	private int start;
	private int end;
	private int step;

	public Thread04(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		this.step = 1;
	}
	
	public Thread04(int start, int end, int step) {
		super();
		this.start = start;
		this.end = end;
		this.step = step;
	}

	@Override
	public void run() {
		
		for(int i = start; i <= end; i+=step) {
			System.out.println(i);
		}
		
	}

}
