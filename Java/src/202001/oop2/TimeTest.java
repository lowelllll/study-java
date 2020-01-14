package oop2;

public class TimeTest {

	public static void main(String[] args) {
		Time time = new Time(12, 35, 30);
		time.setHour(time.getHour()+1); // 한시간 뒤로 변
		System.out.println(time);
	}

}

class Time {
	// 이게 캡슐화다! 
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 24) return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}