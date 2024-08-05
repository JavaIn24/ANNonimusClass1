package Task2;
public class Main {
  public static void main(String[] args) {
        Concationable conCat = new Concationable() {
            @Override
            public String concat(String a, String b) {
                return Concationable.super.concat(a, b);
            }
        };
        Concationable conCat1 = new Concationable() {
            @Override
            public String concat(String a, String b) {
                return Concationable.super.concat(a, b);
            }
        };
        Concationable conCat2 = new Concationable() {
            @Override
            public String concat(String a, String b) {
                return Concationable.super.concat(a, b);
            }
        };

        System.out.println(conCat.concat("Василий", "Петров"));
        System.out.println(conCat1.concat("Сергей", "Няшев"));
        System.out.println(conCat2.concat("Функциональный", "Интерфейс"));

    }
}
