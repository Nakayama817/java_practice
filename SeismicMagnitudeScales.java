//complite 11/23

import java.util.stream.Stream;

public class SeismicMagnitudeScales {

	public static void main(String args[]) {

        String[] stringArray = new java.util.Scanner(System.in).nextLine().split(" ");

        int[] intArray = Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();


		System.out.println((int)Math.pow(32, intArray[0] - intArray[1]));

	}

}





//      memo
        // int[] intArray = new int[0];
        // for(int i = 0; i < stringArray.length; i++){
        //    intArray[i] = Integer.parseInt(stringArray[i]);
        // }