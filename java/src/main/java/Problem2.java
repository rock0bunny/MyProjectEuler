import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {
        List<Integer> list = getFiboList();

        Integer result = list.stream().filter(i -> i % 2 == 0).reduce((a, b) -> a + b).get();

        System.out.println(result);

    }

    private static List<Integer> getFiboList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int i = 1;
        int fiboNumber = 2;
        while(fiboNumber < 4_000_000){
            i++;
            fiboNumber =  list.get(i-1) + list.get(i-2);
            list.add(fiboNumber);
        }
        return list;
    }

}