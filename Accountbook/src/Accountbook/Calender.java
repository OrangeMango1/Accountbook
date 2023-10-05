package Accountbook;

import java.util.Calendar;

public class Calender {
	
	//현재 날짜 가져오기
	Calendar calendar = Calendar.getInstance();
    int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
    
    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	
    
    // 월 마지막 날인지 확인
    boolean isLastDayOfMonth = (currentDayOfMonth == daysInMonth);
    // 남은 일수 계산
    int daysRemaining = daysInMonth - currentDayOfMonth;
    
    public void showDaysRemaining() {
    	System.out.println("월에 남은 일수: " + daysRemaining + "일");
    }

}
