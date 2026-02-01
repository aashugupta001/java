// // import java.util.*;
// // public class loopspratices{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int sum = 0;
// //         // int i = 0;
// //         for(int i=0; i<=n; i++){
// //             sum = sum + i;
// //         } 
// //         System.out.println(sum);
// //     }
// // }



// // print the table of a number input by the user
// import java.util.*;
// public class loopspratices{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;i<=10;i++){
//             System.out.println(n+"*"+i+"="+n*i);
//         }
//     }

// }

import java.util.*;
public class loopspratices{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        // for (int i=1;i<=10;i++){
        for (int i=1;i<=n;  i+=1)    {
            sum=sum+i;
        }
        System.out.println(sum);
        }
    }
//         System.out.println("Sum of first "+n+" odd numbers is: "+sum);

