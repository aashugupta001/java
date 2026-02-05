// public class inverse {
//     public static void main(String args[]){
//         // int i=1
//         for(int i=5;i>=0;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*-*");
//             }System.out.println("*__*^  ");
//         }
//     }
// }
public class inverse {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}