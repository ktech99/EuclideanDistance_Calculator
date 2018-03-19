import java.util.*;

public class EuclideanDistance {

  public static void main(String[] args) {
    Map<String, List<Double>> rating = new TreeMap<String, List<Double>>();
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.println("How many people do you want to have?");
    int people = sc2.nextInt();
    for (int i = 0; i < people; i++) {
      List<Double> stars = new ArrayList<Double>();
      System.out.println("Enter critic " + (i + 1) + "'s name :");
      String name = sc.nextLine();
      System.out.println("enter rating 1 :");
      stars.add(sc2.nextDouble());
      System.out.println("enter rating 2 :");
      stars.add(sc2.nextDouble());
      rating.put(name, stars);
    }
    System.out.println("Enter the first name to compare:");
    String name1 = sc.nextLine();
    System.out.println("Enter the second name to compare:");
    String name2 = sc.nextLine();
    if (!(rating.containsKey(name1) || rating.containsKey(name2))) {
      throw new IllegalArgumentException();
    }
    double person1Movie1 = rating.get(name1).get(0);
    double person1Movie2 = rating.get(name1).get(1);
    double person2Movie1 = rating.get(name2).get(0);
    double person2Movie2 = rating.get(name2).get(1);
    double distance =
        Math.sqrt(
            Math.pow(person1Movie1 - person2Movie1, 2)
                + Math.pow(person1Movie2 - person2Movie2, 2));
    double distInverse = 1 / (1 + distance);
    System.out.println("The score is" + distInverse);
  }
}
