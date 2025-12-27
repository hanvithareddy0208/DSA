//Arrays

//1. Write a Java program to create and display an array of integers.
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//2.sum of array elements
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for(int i = 0; i < n; i++) {
//             sum += arr[i];
//         }
//         System.out.println("Sum of array elements: " + sum);
//     }
// }

//3.average
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         int sum =0;
//         int count =0;
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=1;i<=n;i++){
//             sum = sum +i;
//             count ++;
//         }
//         int avg = sum/count;
//         System.out.println(avg);
//     }
// }

//largest number in array                              
// import java.util.Scanner;
// public class Arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for(int i=1;i<n;i++){
//             if(arr[i]>max){
//                 int temp = arr[i];
//                 arr[i] = max;
//              max = temp;
//         }
//     }
//     System.out.println(max);
//     }
// }

//smallest number in array
// import java.util.Scanner;
// public class Arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int min = arr[0];
//         int minIndex = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i]<min){
//                 int temp = arr[i];
//                 arr[i] = min;
//              min = temp;
//              minIndex = i;
//         }
//     }
//     System.out.println(min);
//     System.out.println(minIndex);
//     }
// }