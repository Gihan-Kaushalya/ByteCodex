import java.util.Scanner;
class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                       SALARY INFORMATION SYSTEM                       |");
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("        [1] Calculate Income Tax         ");
        System.out.println("        [2] Calculate Annual Bonus       ");
        System.out.println("        [3] Calculate Loan amount        ");
        System.out.println('\n');
        System.out.print("Enter an option to continue > ");
        
        int option=input.nextInt();
        
        if(option==1){
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|                       Calculate Income Tax                            |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println('\n');
            
            System.out.print("Input Employee name   - ");
            String name=input.nextLine();
            name=input.nextLine();
            
            System.out.print("Input Employee salary - ");
            int salary = input.nextInt();
            
            int Tax;
            if(salary < 100000) {
                Tax = 0;
            } else if(salary > 100000 && salary <= 141667) {
                Tax = (int)((salary - 100000) * 0.06);
            } else if(salary > 141667 && salary <= 183333) {
                Tax = 2500 + (int)((salary - 141667) * 0.12);
            } else if(salary > 183333 && salary <= 225000) {
                Tax = 7500 + (int)((salary - 183333) * 0.18);
            } else if(salary > 225000 && salary <= 266667) {
                Tax = 15000 + (int)((salary - 225000) * 0.24);
            } else if(salary > 266667 && salary <= 308333) {
                Tax = 25000 + (int)((salary - 266667) * 0.30);
            } else {
                Tax = 37500 + (int)((salary - 308333) * 0.36);
            }
            System.out.print('\n');
            System.out.print("You have to pay Income Tax per month : " + Tax);
            
        } else if(option==2){
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|                       Calculate Annual Bonus                          |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println('\n');
            
            System.out.print("Input Employee name   - ");
            String name=input.nextLine();
            name =input.nextLine();
            
            System.out.print("Input Employee salary - ");
            int salary=input.nextInt();
            
            double Bonus;
            if(salary<100000){
				Bonus=5000;
			}else if(salary>100000 && salary<=199999){
				Bonus=salary*0.10;
			}else if(salary>200000 && salary<=299999){
				Bonus=salary*0.15;
			}else if(salary>300000 && salary<=399999){
				Bonus=salary*0.20;
			}else{
				Bonus=salary*0.35;
			}
			System.out.println('\n');
			System.out.println("Annual Bonus  - "+Bonus);
			
		}else if(option==3){
			System.out.println("-------------------------------------------------------------------------");
            System.out.println("|                       Calculate Loan Amount                          |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println('\n');
            
            System.out.print("Input Employee name   - ");
            String name=input.nextLine();
            name =input.nextLine();
            
            System.out.print("Input Employee salary - ");
            int salary=input.nextInt();
            
            System.out.print("Enter number of year  :");
            int year=input.nextInt();
            System.out.println('\n');
            
            double loan;
            if(salary>50000){
				loan=salary*0.60*((int)1-(1/(Math.pow((1+(0.15/12)),(year*12)))))/(0.15/12);
				System.out.println("You can get loan amount :"+(int)loan);
			}else{
				System.out.println("               You can not get a loan because your salary less than Rs. 50000....");
			}
		}
	}
}
            
			
			
			
			
		
		
            
            
            
            
            
        
