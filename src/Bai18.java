public class Bai18 {
    //Tìm hiểu về hàm trong java

    public static void main(String[] args) {
        int kq = cong(1, 2, 3);
        int kq2 = cong(4, 5, 6);
        System.out.println("Tổng các số: " + kq);
        System.out.println("Tổng các số: " + kq2);
        Xinchao("male");
        Xinchao("female");

    }

    //hàm ký tự trả về
    public static int cong(int x, int y, int z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x + y + z;
    }

    //hàm thủ tục
    public static void Xinchao(String gioitinh) {
        if (gioitinh.equals("female")) {
            System.out.println("Xin chào, tôi là nhân viên nữ");
        } else if (gioitinh.equals("male")) {
            System.out.println("Xin chào, tôi là nhân viên nam");
        }

    }
}