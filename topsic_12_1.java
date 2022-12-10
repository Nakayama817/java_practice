//12/10 complite
import java.util.*;

public class Main {

	public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String[] sAry = scanner.next().split("");
        
        scanner.close();
        
        double x = Double.parseDouble(sAry[0]);
        double y = Double.parseDouble(sAry[1]);
        double p = Double.parseDouble(sAry[2]);
        
        if(x * ((100 - p) / 100) >= y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
}