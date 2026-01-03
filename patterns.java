//patterns

//1.basic 5*5 stars program
// import java.util.Scanner;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//                 if(i<n){
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println( );
//         }
//     }


//2.right angle triangle
// import java.util.Scanner;
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//          for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//                 if(j<i){
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//3.hollow rectabgle
// import java.util.Scanner;
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||j==1||i==n||j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//4.inverted right angle triangle
// import java.util.Scanner;
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//5.inverted right angle
import java.util.Scanner;
public class patterns{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


























.//patterns

//1.basic 5*5 stars program
// import java.util.Scanner;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//                 if(i<n){
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println( );
//         }
//     }


//2.right angle triangle
// import java.util.Scanner;
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//          for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//                 if(j<i){
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//3.hollow rectabgle
// import java.util.Scanner;
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||j==1||i==n||j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//4.inverted right angle triangle
// import java.util.Scanner;
// public class patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//5.inverted right angle
import java.util.Scanner;
public class patterns{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

