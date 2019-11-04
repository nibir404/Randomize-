public class Main {
    public static void main(String[] args) {
        Dark D = new Dark();
        System.out.println("Start : ");
        D.entry();
        try {
            D.notify();
        } catch (Exception e) {System.out.println("False dogma");}
    }
}
