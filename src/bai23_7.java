public class bai23_7 {
    public static void main(String[] args) {
        /*Viết chương trình trích lọc string từ đường dẫn D:/galailaptrinh/music/remix.mp3
1, tách tên tệp bao gồm cả đuôi : remix.mp3
 2, tách tên file : remix

         */
        String chuoi = "D:/galailaptrinh/music/remix.mp3";
        int lastIndex = chuoi.lastIndexOf('/');
        //in ra vị trí
        System.out.println(lastIndex);
        String fileName = chuoi.substring(lastIndex+1);
        System.out.println(fileName);
        //2 chỉ in remix
        int remix = fileName.lastIndexOf('.');
        String onlyName = fileName.substring(0,remix);
        System.out.println(onlyName);



    }
}
