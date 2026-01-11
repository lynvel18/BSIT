import java.util.*;
public class perftask {
    public static void main(String[] agrs){
        Scanner task =  new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = task.nextInt();
        
        if (num>0){
            System.out.println(num + " Is a positive number");
        } else if (0>num){
            System.out.println(num + " Is a negative number");
        } else {
            System.out.println("0 is a neutral number");
        }
        
    }
        
}

