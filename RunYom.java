public class RunYom
{
    public static void main(String [] args) {
        Yommle meep = new Yommle();
        meep.bro();
        meep.zig();

        System.out.println(meep.q());
        System.out.println(meep.h());
    }
    public class Yommle {
        int a = 1;
        double b = 4.3;

        public void zig() {
            a++;
            b = b + 0.5;
        }

        public void bro() {
            a = a * 3;
            b = b / 2;
        }

        public int q() { return a; }

        public double h() { return b; }
    }