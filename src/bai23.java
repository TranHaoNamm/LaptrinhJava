public class bai23 {
    public static void main(String[] args) {
        String s = "Hồi đó tôi chê mồm em rộng" +
                "\n không tin hai đứa chập mồm đo";
        System.out.println(s);
        //khai báo đối tượng st
        StringBuilder chuoi = new StringBuilder();
        //7 các phương thức thường dùng
        //1.append Thêm chuỗi
        chuoi.append("Hello bạn");
        chuoi.append(", mình mới học lập trình nè");
        chuoi.append(", rất vui được làm quen");
        System.out.println(chuoi);
        //2.insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2, "obama");
        System.out.println(chuoi);
        //3.delete(start,end)
        //xóa tất cả ký tự từ vị trí start đến vị trí end trừ 1
        chuoi.delete(2, 7);
        System.out.println(chuoi);
        //4.length : trả về độ dài của chuỗi tính cả space
        System.out.println(chuoi.length());
        //5.IndexOf: kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi
        //trả về -1 nếu không tìm thấy
        String s7 = "tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi"));
        //6. lastIntdexOf: Trả về vị trí index xuất hiện cuối cùng của ký tự hoặc chuỗi
        //Trả về -1 nếu không tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));
        //7. Contains: Kiểm tra chuỗi con
        String s9 = ".mp3";
        String s10 = "tuhoc.mp3";
        //Kiểm tra cụm s10 có chứa s9 không
        boolean check = s10.contains(s9);
        if (check) {
            System.out.println("có .mp3 trong chuỗi");
        } else {
            System.out.println("Không tìm thấy .mp3 trong chuỗi");
        }
        //8. Substring: Trích lọc chuỗi con từ chuỗi ban đầu
        // Substring(int beginIndex)
        // Substring(int beginIndex, int endIndex)
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4, 7);
        System.out.println(s13);
        //9.replace("str old","str new")
        String s14 = "Tôi đi tìm Tôi";
        String s15 = s14.replace("Tôi", "Bạn");
        System.out.println(s14);
        System.out.println(s15);
        //10.replaceFirst("str old","str new")
        String s16 = s14.replaceFirst("Tôi", "Bạn");
        System.out.println(s16);
        //11.trim Xóa toàn bộ khoảng trắng đầu và cuối
        String s17 = "      Gà lại học lập trình           ";
        System.out.println(s17);
        String s18 = s17.trim();
        System.out.println(s18);
        //12.Xóa toàn bộ khoảng trắng ở cuối
        //Cách 1 biểu thức chính quy (regular expresstion)
        //dùng \s +$ để xóa tất cả khoảng trắng ở cuối chuỗi
        String s19 = s17.replaceAll("\\s+$", "");
        System.out.println(s19);
        System.out.println(s19.length());
        //cách 2 xóa khoảng trắng chuỗi bằng vòng lập
        String s20 = "        Gà lại lập trình           ";
        while (s20.endsWith(" ")) {
            s20 = s20.substring(0, s20.length() - 1);
        }
        System.out.println(s20);
        //13.Xóa toàn bộ khoảng trắng ở dầu
        //Cách 1 biểu thức chính quy (regular expresstion)
        //dùng ^\\s  để xóa tất cả khoảng trắng ở đầu chuỗi
        String s21 = "        Gà học lập trình             ";
        String s22 = s21.replaceFirst("^\\s+","");
        System.out.println(s22);
        while (s22.startsWith(" ")) {
            s22 = s22.substring(1);


        }
        System.out.println(s22);
        //14.split tách chuỗi
        String s23 = "Hello, World";
        String mang[] = s23.split(",");
        for(int i = 0; i<mang.length;i++){
            System.out.println(mang[i]);
        }
        //15. tolowerCase() && toUpperCase()
        String s24 = "Tôi học LẬp trình tại TUhoc.cc";
        String s25 = s24.toLowerCase();
        System.out.println(s25);
        String s26 = s24.toUpperCase();
        System.out.println(s26);
        //16.toCharArray tách chuỗi từng thành ký tự cho vào mảng
        String s27 = "abcsdgasdg123@";
        char[] mang2 = s27.toCharArray();//'a'
        //duyệt mảng
        for(int j = 0;j<mang2.length;j++){
            System.out.println(mang2[j]);
        }
        //17.reverse đảo ngược chuỗi
        String s28 = "123456789abcd";
        //Khai báo đối tượng thuộc class StringBuilder
        StringBuilder sb = new StringBuilder(s28);
        sb.reverse();
        String s30 = sb.toString();//chuyển sang chuỗi
        System.out.println(s30);


    }
}
