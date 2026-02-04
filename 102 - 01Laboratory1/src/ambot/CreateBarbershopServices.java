package ambot;
import java.util.*;
public class CreateBarbershopServices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double price;
        String Service;
        
        BarbershopServices service_one = new BarbershopServices();
        BarbershopServices service_two = new BarbershopServices();

        System.out.print("Please input first service here: ");
        service_one.setServiceDescription(input.nextLine());
        
        System.out.print("Input first service price here: ");
        service_one.setPrice(input.nextDouble());
        
        
        System.out.print("Please input second service here: ");
        input.next();
        service_two.setServiceDescription(input.nextLine());
        
        System.out.print("Input second service price here: ");
        service_two.setPrice(input.nextDouble());
        
        System.out.println("Service 1: " + service_one.getServiceDescription() + " \nprice: " + service_one.getPrice());
        System.out.println("Service 2: " + service_two.getServiceDescription() + " \nprice: " + service_two.getPrice());
        
    }

}