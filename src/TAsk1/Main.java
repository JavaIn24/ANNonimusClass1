package TAsk1;
public class Main {
   public static void main(String[] args) {
        Printable print = new Printable() {
            @Override
            public void print() {
                System.out.println("Начал печать на клавиатуре");
            }
        };

        Printable print1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Начал рисовать картину");
            }
        };

        Printable print2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Написал сочинение");
            }
        };
        print.print();
        print1.print();
        print2.print();
    }
}
