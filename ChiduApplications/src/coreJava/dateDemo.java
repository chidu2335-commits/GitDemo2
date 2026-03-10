package coreJava;

import java.util.Date;

import java.text.SimpleDateFormat;

public class dateDemo {
//304 video lecture date time year in java program
	public static void main(String[] args) {
		//current date and current time
		Date d=  new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		//mm/dd/yyyy HH:MM:SS
	}
}
