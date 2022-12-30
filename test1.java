import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] sAry = scanner.next().split("");   
        
        scanner.close();
        
        for(int i = 0; i < sAry.length-1; i++){
            for(int j = (i + 1); j < sAry.length; j++){
                if(sAry[i].equals(sAry[j])){
                    
                    System.out.println(sAry[j]);
                }
            }
        }
        
        
        
    }
    
}