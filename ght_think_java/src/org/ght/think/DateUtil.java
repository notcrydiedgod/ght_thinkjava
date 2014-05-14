package org.ght.think;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//求出今天是今年的第几天
	public static void whatdate2year(){
		//第一种拿当前日期的方法。此方法已过时，被Calendar取代
		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int day = date.getDate();
		int week = date.getDay();
		String now = year+"年"+month+"月"+day+"日 星期"+week;
		System.out.println("现在是:"+now);
		
		//第二种拿当前日期的方法
		Calendar calendar = Calendar.getInstance();//得到日历的实例
		calendar.setTime(date);//将现在的时间赋值给Calendar对象
		int c_year = calendar.get(Calendar.YEAR);//取得年份
		int c_month = calendar.get(Calendar.MONTH)+1;//取得月份
		int c_day = calendar.get(Calendar.DAY_OF_MONTH);//取得日期
		System.out.println("现在是："+c_year+"年"+c_month+"月"+c_day+"日");
		
		//
		long timeOne = calendar.getTimeInMillis();
		Calendar calendar1 = Calendar.getInstance();//得到日历的实例
		calendar1.set(2014, 1, 1);//将日历翻到现在的日期
		long timeTwo = calendar1.getTimeInMillis();
		long day2year = (timeOne - timeTwo)/(1000*60*60*24)+1;
		System.out.println("今天是今年的第"+day2year+"天");
		System.out.println("今天是今年的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天");
	}
	public static void main(String[] args) {
		whatdate2year();
	}
}
