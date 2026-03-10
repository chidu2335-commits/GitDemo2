package coreJava;

import java.util.Calendar;

import java.text.SimpleDateFormat;

public class calendarDemo {
	//305 video lecture date time year in java program
	public static void main(String[] args) {
	
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		System.out.println(cal.get(cal.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(cal.AM_PM));
		System.out.println(cal.get(cal.MINUTE));
	}
}
