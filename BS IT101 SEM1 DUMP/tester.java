import java.util.* ;

public class tester {
    
    public static void delete(){
        for(int bruh = 0; bruh < 50; bruh++){
            System.out.println("");
        }
    }
    
    public static void spacing(){
        for(int bruh = 0; bruh < 5; bruh++){
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Do you want to play a game? \n 1. Yes \n 2. No\n : ");
        int ans = sc.nextInt();
        
        switch(ans){
            
            case 1: 
                System.out.print("Great! Now pick a number between 1 to 10: ");
                int selnum = sc.nextInt();
                
                int randonum = (int)(Math.random() * (10 - 1 + 1))  ;
                boolean right = selnum == randonum  ;
                String output = right? "Hey, You got it right":"NGEK You got it wrong lol\nthe number was: " + randonum ;
                delete();
                System.out.println(output);
                spacing();
                break;
                
            case 2:
                delete();
                System.out.println("Awww, see you next time");
                spacing();
                break;
                
            default: 
                delete();
                System.out.println("You put in an invalid number");
                spacing();
                
        }
        
        
        }
            
    }

        
        
        
    