package chapter09.exam06;

public class TimeChecker {
	
	long start;
	long end;
	
	public void timeStart() {
		start = System.currentTimeMillis();
	}
	
	public long timeEnd() {
		end = System.currentTimeMillis();
		return end-start;
	}

}