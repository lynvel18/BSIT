package Aveniel;
public class Calculations {
    
    interface semesters{
        int semester = 6;
        int weekPerSem = 18;
    }
    
    interface moneyIncrease{
        double increase = 0.03;
    }
    
    interface allowance{
        double dailyAllowance = 300;
    }
    
    interface output{
        void semesterOutput();
        void aprilAllowance();
    }
    
    public static class allowancePerSem implements semesters, moneyIncrease, output, allowance{
     
        @Override
        public void aprilAllowance(){
            double untilApril = 80;
            double total = dailyAllowance * untilApril;
            
            System.out.println("Days until April: " + untilApril);
            System.out.println("Total allowance until end of April: " + total);
        }

        @Override
        public void semesterOutput(){
            
            double currentAllowance = dailyAllowance;
            
            for(int i = 1; i <= semester; i++){
                
                if( i==3 || i==5 ){
                    currentAllowance = currentAllowance + (currentAllowance * increase);
                }
                
                double semTotal = currentAllowance * 5 * weekPerSem;
                
                System.out.println("Semester: " + i + ", Daily Allowance: " + currentAllowance + ", Total Per Semester: " + semTotal);
            }
            
        }

    }
    
}
