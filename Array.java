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

//4.largest number in array                              
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

//5.smallest number in array
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

//6.count even or odd
// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int evenCount =0;
//         int oddcount =0;
//         int evennums[] = new int[n];
//         int oddnums[] = new int[n];
//         for(int i=0;i<n;i++){
//             if(arr[i]%2==0){
//                 evenCount++;
//                 evennums[i] = arr[i];
//             }
//             else{
//                 oddcount++;
//                 oddnums[i] = arr[i];
//             }
//         }
//         System.out.println("Even numbers count: " + evenCount);
//         System.out.println("Odd numbers count: " + oddcount);
//         for(int i=0;i<n;i++){
//             if(evennums[i]!=0){
//                 System.out.print(evennums[i] + " ");
//             }
//         }
//         System.out.println();
//         System.out.println("Odd numbers:");
//         for(int i=0;i<n;i++){
//             if(oddnums[i]!=0){
//                 System.out.print(oddnums[i] + " ");
//             }
//         }
//     }
// }

//7.reverse an array
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=n-1;i>=0;i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//8.copy an array
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int[] copyarr = new int[n];
//         for(int i=0;i<n;i++){
//             copyarr[i] = arr[i];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(copyarr[i]+ " ");
//         }
//     }
// }

//9.basic search
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         int key = 40;
//         boolean elementfound = false;
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int elementidx =-1;
//         for(int i=0;i<n;i++){
//             if(arr[i]==key){
//                 elementfound = true;
//                 elementidx = i;
//                 break;
//         }
//     }
//         if(elementfound==true){
//             System.out.println("yes found at "+ elementidx);
//         }else{
//             System.out.println("not found");
//         }
//     }
// }

//10.basic sort
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]= sc.nextInt();      
//         }
//         for(int i=0;i<n;i++){
//             if()
//         }
//     }
// }

//11. count negative numbers in an array
// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]<0){
//                 sum = sum+arr[i];
//             }
//         }
//         System.out.println(sum);
//     }
// }

//12.occurences of 
import java.util.Scanner;
