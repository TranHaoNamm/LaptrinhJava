public class bai15_6_2 {
    public static void main(String[] args) {
        int i;
        int n;
        for(n=1; n<=1000; n++){
            int tong = 0;
            for(i=1;i<n;i++){
                if(n%i == 0)
                    tong+=i;
            }
            if(tong == n)
                System.out.println(n+" là số hoàn hảo");
        }

    }
}
