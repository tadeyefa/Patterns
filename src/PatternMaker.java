public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }
    public PatternMaker() {
        System.out.println("Hi Pattern Maker");
//        pattern1();
//        pattern2();
//        pattern3();
        pattern5();
    }
    public void pattern1() {
        for (int x=0;x<6;x++) {
                System.out.println(x * 5);
        }
    }
    public void pattern2() {
        for (int t=0;t<6;t++) {
            System.out.println(2 + (t * 5));
        }
    }
    public void pattern3() {
        for (int a=0;a<6;a++) {
            System.out.print(21 - (a * 4) + "\t");
        }
    }
    public void pattern5() {
        for (int b=1;b<5;b++) {
            System.out.println();
            for (int c=1;c<5;c++) {
                System.out.print(c);
            }
        }
    }
}
