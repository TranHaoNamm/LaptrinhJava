public class Bai23_5 {
    public static void main(String[] args) {
        /*String a = "tôi chăm học tôi chịu khó tôi đẹp zai";
 Đếm từ tôi trong string a trên ?

         */
        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        String[] chuoi = a.split(" ");
        int count = 0;
        for(int i = 0;i < chuoi.length;i++){
            if(chuoi[i].equals("tôi")) {
                count ++;
            }

        }
        System.out.println("Số từ tôi trong chuỗi là: "+count);
    }
}
