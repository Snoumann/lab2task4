public class Test_rectangle2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        r1.setSide1(2);
        r1.setSide2(2);

        r2.setSide1(2);
        r2.setSide2(2);

        r3.setSide1(2);
        r3.setSide2(3);

        r1.compare(r2);
        r1.compare(r3);


        Rectangle r4 = new Rectangle();
        r4.setSide1(6);
        r4.setSide2(9);
        r4.similarityCheck(r3);
        r4.similarityCheck(r1);
    }
}
