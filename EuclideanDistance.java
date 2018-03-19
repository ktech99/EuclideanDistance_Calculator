import java.util.*;

public class EuclideanDistance {

  public static void main(String[] args) {
    Map<String, List<Integer>> rating = new TreeMap<String, List<Integer>>();
    List<Integer> stars = new ArrayList<Integer>();
    stars.add(5);
    stars.add(4);
    rating.put("john", stars);
    double johnMovie1 = rating.get("john").get(0);
    double johnMovie2 = rating.get("john").get(1);
    stars.clear();
    stars.add(4);
    stars.add(1);
    rating.put("jack", stars);
    double jackMovie1 = rating.get("jack").get(0);
    double jackMovie2 = rating.get("jack").get(1);
    double distance =
        Math.sqrt(Math.pow(johnMovie1 - jackMovie1, 2) + Math.pow(johnMovie2 - jackMovie2, 2));
    double distInverse = 1 / (1 + distance);
    System.out.println(distInverse);
  }
}
