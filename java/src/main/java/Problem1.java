import java.util.HashSet;
import java.util.Set;

public class Problem1 {

  public static void main(String[] args) throws Throwable {
    Set<Integer> set = new HashSet<>();
    int total = 1000000;
    set.addAll(getMultOf(3, total));
    set.addAll(getMultOf(5, total));

    System.out.println(set.stream().mapToInt(p->p).sum());
  }

  private static Set<Integer> getMultOf(int number, int total){
    Set<Integer> result = new HashSet<>();
    for (int i = number; i < total; i+=number) {
      result.add(i);
    }
    return result;
  }

}
