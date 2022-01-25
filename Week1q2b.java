import java.util.Scanner;

public class Week1q2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your module code: ");
        String module = sc.next();
        sc.close();

        switch(module)   
        {   
            case "CSC1006":   
                System.out.println("Mathematics 2"); 
                break;
            case "CSC1007":   
                System.out.println("Operating Systems"); 
                break;
            case "CSC1008":   
                System.out.println("Data Structures and Algorithms"); 
                break;
            case "CSC1009":   
                System.out.println("Object-Oriented Programming"); 
                break;  
            case "CSC1010":   
                System.out.println("Computer Networks"); 
                break; 
            default:    
                System.out.println("Invalid"); 
                break;   
        } 
    }
}
