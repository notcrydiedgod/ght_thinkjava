package org.ght.think;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//��������ǽ���ĵڼ���
	public static void whatdate2year(){
		//��һ���õ�ǰ���ڵķ������˷����ѹ�ʱ����Calendarȡ��
		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int day = date.getDate();
		int week = date.getDay();
		String now = year+"��"+month+"��"+day+"�� ����"+week;
		System.out.println("������:"+now);
		
		//�ڶ����õ�ǰ���ڵķ���
		Calendar calendar = Calendar.getInstance();//�õ�������ʵ��
		calendar.setTime(date);//�����ڵ�ʱ�丳ֵ��Calendar����
		int c_year = calendar.get(Calendar.YEAR);//ȡ�����
		int c_month = calendar.get(Calendar.MONTH)+1;//ȡ���·�
		int c_day = calendar.get(Calendar.DAY_OF_MONTH);//ȡ������
		System.out.println("�����ǣ�"+c_year+"��"+c_month+"��"+c_day+"��");
		
		//
		long timeOne = calendar.getTimeInMillis();
		Calendar calendar1 = Calendar.getInstance();//�õ�������ʵ��
		calendar1.set(2014, 1, 1);//�������������ڵ�����
		long timeTwo = calendar1.getTimeInMillis();
		long day2year = (timeOne - timeTwo)/(1000*60*60*24)+1;
		System.out.println("�����ǽ���ĵ�"+day2year+"��");
		System.out.println("�����ǽ���ĵ�"+calendar.get(Calendar.DAY_OF_YEAR)+"��");
	}
	public static void main(String[] args) {
		whatdate2year();
	}
}
