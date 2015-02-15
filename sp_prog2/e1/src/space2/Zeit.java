package space2;

public class Zeit {

	private int seconds;
	private int minutes;
	private int hours;

	public Zeit(){
		seconds= minutes= hours= 0;
	}

	public Zeit(int seconds, int minutes, int hours){
		this.seconds= seconds;
		this.minutes= minutes;
		this.hours= hours;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public int setMinutes(int minutes) {
		this.minutes = minutes;
		return minutes;
	}

	public int getHours() {
		return hours;
	}

	public int setHours(int hours) {
		this.hours = hours;
		return hours;
	}

}
