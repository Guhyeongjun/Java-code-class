package chapter03;

import java.util.Calendar;

public class CalendarQuiz {
	
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " 
			 + date.get(Calendar.MONTH) + "월 " 
			 + date.get(Calendar.DATE) + "일 ";
	}
}
