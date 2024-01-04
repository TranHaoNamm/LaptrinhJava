public class Bai15_5 {
    public static void main(String[] args) {
        int i;
        int tong = 0;
        int m = 1;
        for(i=1;i<=10;i++){
            tong += m;
            m *= i;
            System.out.println(i);
            System.out.println(m);
        }
        System.out.println("Tổng cần tính = "+tong);
    }
}
