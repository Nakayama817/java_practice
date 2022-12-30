//TimeOver 12/30

import java.util.*;
public class Zahyou {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] sAry = scanner.next().split("");   
        scanner.close();
        
        int x = 0;
        int y = 0;
        List<String> zahyou = new ArrayList<String>();
        
        for(int i = 0; i < n; i++){
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
            zahyou.add(String.valueOf(x)+String.valueOf(y));
            
        }
        
        String[] arr = zahyou.toArray(new String[zahyou.size()]);
        int count = 0;
        
        for(int i = 0; i < arr.length-1; i++){
            for(int j = (i + 1); j < arr.length; j++){
                if(arr[i].equals(arr[j])){
                
                    count++;
                }
            }
        }
        
        System.out.println(arr.length - count);
    }
    
}