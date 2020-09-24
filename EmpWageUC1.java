import java.lang.*;
public class EmpWageUC1{
	public static void main(String args[]){
		int presence_condn = 1;
		int presence_check = (int)Math.floor(Math.random()*10)%2;
		if(presence_check==presence_condn){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
