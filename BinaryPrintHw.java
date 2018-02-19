
public class BinaryPrintHw {
    public static void main(String[]args) {
        int x = 3;
        int y = 2;
        int z = 3;
        
        while(x < y + z) {
            System.out.println(x);
            x = x * 2;
            y = y + z;
            z++;
        }
    }

}
