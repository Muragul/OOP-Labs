import java.util.*;
public class Time {
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
//Долго думала что должен делать метод add
//Оказалось просто нужно создать список всех времен и туда добавлять
//Еще 2 дня ушло на то, чтобы понять разницу статик-не статик
//Даже зная теорию условие не понимала, но когда просто попробовала написать
//сразу поняла разницу
//Если статик - то выведет все таймы
//Если нет - то таймы для того тайма, от которого мы вызвали метод
//Типа тогда у каждого свой список таймов, а в статике один общий
//Прям как и объясняли на лекциях, я это знала, просто оказывается я не умею 
//использовать теорию на практике