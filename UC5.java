import java.lang.*;
public class UC5{
		public static final int rate_per_hour = 20;
		public static final int FTemployee = 1;
		public static final int PTemployee = 2;

	public static void main(String args[]){
		int daily_hours;
		int total_hrs = 0;
		int emp_wage = 0 ;
		for(int i = 0; i<20; i++){
		int presence_check = (int)Math.floor(Math.random()*10)%3;
		switch(presence_check){
			case FTemployee:
			daily_hours = 8;
			break;
			case PTemployee:
			daily_hours = 4;
			break;
			default:
			daily_hours =  0;
		}
		total_hrs +=daily_hours;
		}
		emp_wage = total_hrs*rate_per_hour;
		System.out.println("Emp Wage: "+emp_wage);
	}
}
