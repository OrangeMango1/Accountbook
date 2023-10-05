package Accountbook;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		Calender Calender = new Calender();
		Account Account = new Account();
        
        // 결과 출력
        Account.isLastDayOfMonth();
        Account.BudgetWarning();
        Calender.showDaysRemaining();
        Account.showDailyBudget();
        
	}     
}

