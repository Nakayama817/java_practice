//12/12 complite

import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] sAry = scanner.nextLine().split(" ");      //difference nextLine(), next()?
        
        scanner.close();
        
        int x = Integer.parseInt(sAry[0]);
        int y = Integer.parseInt(sAry[1]);
        
        if(x > y){
            System.out.println("A");
        }else if(x < y){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
        
    }
    
}