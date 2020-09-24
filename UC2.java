import java.lang.*;
public class UC2{
	public static void main(String args[]){
		int rate_per_hour = 20;
		int daily_hours;
		int emp_wage;
		int presence_condn = 1;
		int presence_check = (int)Math.floor(Math.random()*10)%2;
		if(presence_check==presence_condn)
			daily_hours = 8;
		else
			daily_hours = 0;
		emp_wage = rate_per_hour*daily_hours;
		System.out.println("Emp Wage: "+emp_wage);
	}
}
