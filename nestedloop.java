// public class nestedloop {
//     public static void main(String args[]){
//         int i=1;
//         for (i=1;i<=4;i++){
//             // System.out.println("*");
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
            
//             }
//             System.out.println("*");
          
//         }
//     }   
// }
// rectangle pattern
// public class nestedloop {
//     public static void main(String args[]){
//         int n=4;
//         int m=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1||j==1||i==n||j==m){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//             }
//             System.out.println();
//         }
//     }


// public class nestedloop{
//     public static void main(String args[]){
//         int i=1;
//         for(i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             } 
//             System.out.println();
//         }
//     }
// }
public class nestedloop{
    public static void main(String args[]){
    int i=1;
    for (i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }   
}