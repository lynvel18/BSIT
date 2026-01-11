import java.util.Scanner;

public class CPA2 {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int age = 0;
        
        System.out.println("This is a Voter Eligibility Checker");
        System.out.print("Please enter your age, Voter: ");
        age = sc.nextInt();
        
        int AgeNextYear = age + 1;
        int YearsUntilEligible = 18 - age;
       
        //////////////
        
        boolean voteroldenough = age >= 18;
        boolean IsAgeValid = age <= 110;
        
        ////////////////
        
        boolean EligibleToVote = voteroldenough && IsAgeValid;
        boolean InputInvalid = age < 0 || age > 110;
        
        /////////////
        
        String output = EligibleToVote ? "You are Eligible to vote":"You are not Eligible to vote";
    
        if (InputInvalid) {
           System.out.println("Input invalid, Please try again");
        } else  {System.out.println(output); 
            }
         
        ////////////
        
        if (age > 120) {
            System.out.println("Damn you're old! What are you? A zombie or a vampire?");
        }
        
        ////////////
        
        if (!voteroldenough && age == 17) {
            System.out.println("You can try again next year when you turn " + AgeNextYear);
            System.out.println("Advanced Happy Birthday");
        } else if (!voteroldenough){
            System.out.println("Try again in " + YearsUntilEligible + " years, when you're 18");
        }
    }
    
}
