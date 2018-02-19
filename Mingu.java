
public class Mingu {
    int a = 3;
    double b = 1.2;
    String c = "mip";

    public Mingu() {}

    public Mingu(int x, double y, String z) {
        a = x;
        b = y;
        c = z;
    }

    public void dd() {
        b = b * a;
    }

    public String ee() {
        return b + c;
    }

    public void ff(int x) {
        a = x;
    }
}

