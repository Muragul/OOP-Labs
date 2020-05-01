package Task4;
import java.util.ArrayList;
public class Time implements Comparable<Object>{
	public int hour;
	public int minute;
	public int second;
	
	public static ArrayList<Time> times = new ArrayList<>();		
	public Time(){}
	public Time(int hour, int minute, int second) {
		if (hour<24 && minute<60 && second<60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;			
		}
	}
	
	public int compareTo(Object c) {
		Time time = (Time)c;
		if (time.hour>this.hour)return -1; else
		if (time.hour<this.hour)return 1; else
		{
			if (time.minute>this.minute)return -1; else
			if (time.minute<this.minute)return 1; else
			{
				if (time.second>this.second)return -1; else
				if (time.second<this.second)return 1;
			}
		}
		return 0;
	}
	public void add(Time t2) {
		times.add(t2);
	}
	
	public String toUniversal() {
		String s = hour+":";
		if (minute<10) {
			s+="0"+minute+":";
		} else {
			s+=minute+":";
		}
		if (second<10) {
			s+="0"+second;
		} else {
			s+=second;
		}
		return s;
	}
	public String toString() {
		return toStandart();
	}
	public String toStandart() {
		if (hour<13) {
			return toUniversal()+" AM";
		} else {
			String s = (hour-12)+":";
			if (minute<10) {
				s+="0"+minute+":";
			} else {
				s+=minute+":";
			}
			if (second<10) {
				s+="0"+second;
			} else {
				s+=second;
			}
			return s+" PM";
		}
	}
	
	public ArrayList<Time> getTimes(){
		return times;
	}

}