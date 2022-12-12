//12/12 complite

import java.util.*;
public class Robot {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] sAry = scanner.next().split("");      //difference nextLine(), next()?
        
        scanner.close();
        
        int x = 0;
        int y = 0;
        
        
        for(int i = 0; i < n; i += 1){
            String s = sAry[i];
            switch(s){
                case "U":
                    y += 1;
                    break;
                case "D":
                    y -= 1;
                    break;
                case "L":
                    x -= 1;
                    break;
                case "R":
                    x += 1;
                    break;
            }
        }
        
        
        System.out.println(x + " " + y);
        
    }
    
}