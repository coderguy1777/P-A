public class morereview {
    public static void main(String[]args) {
        int x = 1;
        int y = 1;
        int z = 1;
        while(x < y + z) {
            System.out.print(x);
            x = x * 2;
            y = y + z;
            z++;
        }
    }
}