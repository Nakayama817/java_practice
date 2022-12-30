


//solves
import java.util.*;
public class Ichijigennnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        for (char i = '1'; i <= '9'; i++) {
            boolean unsolvable = true;
            for (int j = 0; j < 9; j++) {
                if (S[j] == i) {
                    unsolvable = false;
                    break;
                }
            }
            if (unsolvable) {
                for (int j = 0; j < 9; j++) {
                    if (S[j] == '*') {
                        S[j] = i;
                        unsolvable = false;
                        break;
                    }
                }
            }
            if (unsolvable) {
                System.out.println("UNSOLVABLE");
                return;
            }
        }
        System.out.println(new String(S));
    }
}

//my answer

// import java.util.*;
// public class Main {
// 	public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         String[] sAry = scanner.next().split("");   
        
//         scanner.close();
        
//         for(int i = 0; i < sAry.length-1; i++){
//             for(int j = (i + 1); j < sAry.length; j++){
//                 if(sAry[i] == sAry[j]){
//                     
//                     System.out.println(sAry[j]);
//                 }
                
//             }
//         }
        
        
        
//     }
    
// }


//かぶりを探してあればfalseなければtrueあっても＊で補えればtrueで考えたしかし、線形探索がうまく起動せず断念。＊で補うところまで考えられなかった。
//解答例は1-9までは必ず出るものとし、ひとつづつ配列にあるか確認する。無くても＊があれば入れ替えて適切な数値を入れる。1つでも引っかからない（すでに出た）ものがあればfalseを返す。