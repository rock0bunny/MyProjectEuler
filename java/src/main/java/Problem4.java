import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem4 {

    public static void main(String[] args) {


        long start = System.nanoTime();
        int result = IntStream.range(100,1000).flatMap((i)->
            IntStream.range(i,1000).filter((j)->isPalindrom(i*j)).map((j)->i*j)
        ).max().getAsInt();
        long stop = System.nanoTime();
        System.out.println(result);
        System.out.println(stop-start);


        long start2 = System.nanoTime();
        int max = 0;
        for(int i = 999; i > 99; i--) {
            for(int j = i; j > 99; j--) {
                int x = i*j;
                if(x < max){
                    break;
                }
                if(isPalindrom(x)) {
                    if(x>max){
                        max=x;
                    }
                }
            }
        }
        long stop2 = System.nanoTime();
        System.out.println(max);
        System.out.println(stop2-start2);

    }

    private static boolean isPalindrom(long number) {
        char[] charArray = String.valueOf(number).toCharArray();

        for(int i = 0; i < (charArray.length / 2); i++) {
            if(charArray[i] != charArray[charArray.length - (i + 1)]) {
                return false;
            }
        }
        return true;
    }

}
