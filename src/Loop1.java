public class Loop1 {
    public static void main(String[] args) {

        double i = 0;
        double x = 0.1;
        while (i <= 3.0) {
            System.out.printf("%.1f\n",i);
            i=i+x;
        }
        double l = 0;
        double k = 0.1;
        do {
            System.out.printf("%.1f\n",l);
            l = l + k;
        }while (l<=3.0);
    }
}