//complete 12/30



import java.util.*;
public class Takahashi {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] sAry = scanner.next().split("");   
        double x = Double.parseDouble(sAry[0]);
        double y = Double.parseDouble(sAry[1]);
        scanner.close();
        
        if(x * 0.9 < y){
            System.out.println("Takahashi");
        }else if(x * 0.9 == y){
            System.out.println("Same");
        }else{
            System.out.println("Aoki");
        }
        
        
        
    }
    
}


