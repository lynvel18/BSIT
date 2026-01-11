
import java.util.Scanner    ;

public class calc {

    public static void deleteline(){
        for (int i = 0; i < 50; i = i + 1) {
            System.out.println("");
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in)  ;
        
        
        
        
        System.out.println("Welcome to my \"Stupidly Simple Calculator\" , v0.01");
        System.out.println("                                                    ");
        System.out.println("1.  +  (addition)")      ;
        System.out.println("2.  -  (subtraction)")   ;
        System.out.println("3.  *  (multiplication)");
        System.out.println("4.  /  (division)")      ;
         System.out.print("Please select the operation you would like to make: ");
            int opt = input.nextInt();
        
        deleteline();
            
    switch (opt){
        case 1:
            System.out.println("Addition");
            System.out.println("                                                ");
            System.out.println("num 1 + num 2 =");
            System.out.print("Please input num 1");
                int num1 = input.nextInt();
                
                
            break;
        case 2:
            break;
        case 3:
            break;
    }

    }
    
}
