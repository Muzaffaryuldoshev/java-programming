package loops;

public class KPH_MPH {
    public static void main(String[] args) {
        System.out.println("KPH       MPH");
        System.out.println("-------------");

        for (int i = 20; i <= 140; i+=10) {
            int kmpTomph = (int) (i * 0.62);
            System.out.println(i + "    " + kmpTomph);
        }


    }
}
