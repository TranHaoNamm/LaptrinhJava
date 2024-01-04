public class Bai20 {//Tìm hiểu về math

    public static void main(String[] args) {
        System.out.println("Pi = "+Math.PI);
        //trị tuyệt đối
        int a = -8;
        System.out.println("|a| = "+Math.abs(a));
        //min max
        System.out.println("Max = " +Math.max(4,7));
        System.out.println("Min = " +Math.min(4,7));
        //căn bậc 2
        System.out.println("Căn của 4: " +Math.sqrt(4));
        //Lũy thừa
        System.out.println("2 mũ 3 là: "+Math.pow(2,3));
        //sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("sin 90 = " +sin);
        System.out.println("cos 90 = " +cos);
        System.out.println("tan 90 = " +tan);

    }
}
