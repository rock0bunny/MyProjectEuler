import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {
        PrimeList primeList = new PrimeList();
        List<Long> factors = new ArrayList<>();

        Long number = 600851475143L;

        Long prime = 1L;

        while(number > prime) {
            prime = primeList.next();
            if(number % prime == 0) {
                factors.add(prime);
                number = number / prime;
                primeList.reset();
            }
        }

        factors.stream().forEach(System.out::println);

    }

    public static class PrimeList {

        private List<Long> list = new ArrayList<>();
        private int pos = 0;

        public PrimeList(){
            list.add(2L);
        }

        public long next(){
            if(list.size() > pos) {
                pos++;
                return list.get(pos-1);
            }
            for(long i = (list.get(pos-1) + 1); ; i++) {
                if(isPrime(i)) {
                    list.add(i);
                    pos++;
                    return i;
                }
            }
        }

        public void reset(){
            pos = 0;
        }

        private static boolean isPrime(long x){
            boolean result = true;
            for (long i =  2; i <= x/2; i++) {
                if (x % i == 0) {
                    result = false;
                    break;
                }
            }
            return result;
        }

    }





}