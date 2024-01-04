public class Bai15_6 {
    public static void main(String[] args) {
        int n = 6;
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;

            }
        }
            if (tong == n) {
                System.out.println(n + " là số hoàn hảo");
            } else {
                System.out.println(n + " không phải là số hoàn hảo");

            }

    }
}
