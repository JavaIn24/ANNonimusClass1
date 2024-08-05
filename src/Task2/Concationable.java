package Task2;
public interface Concationable {
  public default String concat (String a, String b) {
        String c = a + " " + b;
        return c;
    }
}
