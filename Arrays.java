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

//3. Find the largest element in an array
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int largest = arr[0];
//         for(int i = 1; i < n; i++) {
//             if(arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         System.out.println("Largest element in the array: " + largest);
//     }
// }