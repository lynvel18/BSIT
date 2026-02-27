
import java.util.*;
public class Laboratory {

    public static void main(String args[]) {   
        Scanner i = new Scanner(System.in);     
        
        //RuntimeException
        try {
            System.out.print("Enter 1: ");
            int e = i.nextInt();
            System.out.println(");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        
        //ArithmeticException
        try {
            System.out.print("Enter 1: ");
            int e = i.nextInt();
            int r = e/0;
            System.out.println(r);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        //IndexOutOfBoundsException
        try {
            System.out.print("Enter 1: ");
            int e = i.nextInt();
            ArrayList<String> breh = new ArrayList<String>();
            breh.get(e);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        
        //ArrayIndexOutOfBoundsException
        try {
            System.out.print("Enter 1: ");
            int e = i.nextInt();
            String[] bre = {};
            System.out.println(bre[e]);
        } catch (ArrayIndexOutOfBoundsException e)  {
            e.printStackTrace();
        }
        
        //NoSuchElementException
        try {
            Scanner t = new Scanner("");
            int e = t.nextInt();
            System.out.println(e);
            
        } catch(NoSuchElementException e) {
            e.printStackTrace();
        }
        
        //InputMismatchException
        try { 
            System.out.print("Enter a: ");
            int e = i.nextInt();
            System.out.println(e);
            
        } catch (InputMismatchException e) {
            i.nextLine();
            e.printStackTrace();
        } 
    }
}
