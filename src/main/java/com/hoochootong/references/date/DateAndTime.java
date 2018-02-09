package com.hoochootong.references.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateAndTime {
	public void dateToUtc() throws ParseException {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.toGMTString());
		System.out.println(date.toLocaleString());
		System.out.println(date.toInstant().now());
		System.out.println(ZonedDateTime.now(ZoneOffset.UTC));
		System.out.println(date.toInstant());
		
		String textDate = "2017-11-27";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = format.parse(textDate);
		System.out.println(date1.toInstant());
	}
	
	public static void main(String[] args) throws ParseException {
		DateAndTime dateAndTime = new DateAndTime();
		dateAndTime.dateToUtc();
	}
}
