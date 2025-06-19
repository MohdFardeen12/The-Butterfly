public class buttterfly {
    public static void pattern6(int n){
        for (int i = 1 ; i <= n ; i++){
            //printing initial stars
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            //printing inbetween stars
            for (int j = 1 ; j <= 2*(n-i) ; j++ ){
                System.out.print(" ");
            }
            //printing the last stars
            for (int j = 1 ; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n ; i >= 1 ; i--){
            //printing initial stars
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            //printing inbetween stars
            for (int j = 1 ; j <= 2*(n-i) ; j++ ){
                System.out.print(" ");
            }
            //printing the last stars
            for (int j = 1 ; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern6(4);
    }
}
