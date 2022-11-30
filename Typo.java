//完了（11/30）
import java.util.*;

public class Typo {

	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String[] sAry = scanner.next().split("");
        String[] tAry = scanner.next().split("");
        scanner.close();
        //System.out.println(Arrays.toString(sAry));

        if (Arrays.equals(sAry, tAry)){
            System.out.println("Yes");
        }else{
            
            for(int i = 0; i < sAry.length - 1; i += 1){

                String[] tAry2 = Arrays.copyOf(tAry, tAry.length);

                String u = tAry2[i];
                tAry2[i] = tAry2[i + 1];
                tAry2[i + 1] = u;
                //System.out.println(Arrays.toString(tAry2));

                if (Arrays.equals(sAry, tAry2)){
                System.out.println("Yes");
                break;
                }
                
                if (i == sAry.length - 2){
                    System.out.println("No");
                }
                
            }
            
        }
	}
	
}