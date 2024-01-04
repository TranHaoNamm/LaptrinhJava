public class bai15 {//break; continue

    public static void main(String[] args) {
        int i;
        int tong = 0;
        //tính tổng từ 1 đến 5 nhưng bỏ qua 3
        for (i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            } else {
                tong += i;
            }
        }
        System.out.println("tổng = " + tong);


        int n = 0;
        while (n < 100) {
            if(n<=15) {

                System.out.println("n= " + n);
                n++;
            }
        }
    }
}

