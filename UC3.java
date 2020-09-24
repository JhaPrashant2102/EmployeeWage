import java.lang.*;
public class UC3{
	public static void main(String args[]){
		int rate_per_hour = 20;
		int daily_hours;
		int emp_wage;
		int FTemployee = 1;
		int PTemployee = 2;
		int presence_check = (int)Math.floor(Math.random()*10)%3;
		if(presence_check==FTemployee)
			daily_hours = 8;
		else if(presence_check==PTemployee)
			daily_hours = 4;
		else daily_hours = 0;
		emp_wage = rate_per_hour*daily_hours;
		System.out.println("Emp Wage: "+emp_wage);
	}
}
