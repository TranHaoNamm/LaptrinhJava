
public class bai16 {//for lồng nhau

    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=7;i++){
            for(j=1;j<=7;j++){
                System.out.print(i+ "" +j+ " \t");
            }
            System.out.println(" ");
        }
        //vẽ chữ n
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for(i=1;i<=7;i++){
            for(j=1;j<=7;j++){
               if(j==1||j==7||j==i){
                    System.out.print(i+ "" +j+ "\t");
                }else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println(" ");
        }
        //vẽ hình vuông
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for(i=1;i<=7;i++){
            for(j=1;j<=7;j++){
                if(j==1||j==7||i==1||i==7){
                    System.out.print(i+ "" +j+ "\t");
                }else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println(" ");
        }
        //vẽ hình tam giác
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for(i=1;i<=7;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+ "" +j+ "\t");
            }
            System.out.println(" ");
        }
    }
}
