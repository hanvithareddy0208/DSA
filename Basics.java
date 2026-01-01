//basics programs 

//1.positive or negative number
//2.even or odd number
//3.Sum of First N Natural numbers
//4.sum of numbers in a given range
//5.Program to Find Greatest of Two Numbers
//6.greatest of three numbers
//7.leap year or not
//8.factorial of a number
//9.number of leap years between two years
//10.prime number checking
//11.prime between 2 to 100
//12.sum of digits in number
//13.reverse a number
//14.palindrome
//15.amstrong number
//16.amstrong number in a given range
//17.fibanacci series
//18.nth term of fibanacci
//19.factorial
//20.power of a number
//21.factor of a number
//22.prime factorization
//23.strong number
//24.perfect number
//25.perfect square
//26.swap two numbers
//27.swapping without third variable


//1.positive or negative number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a==0){
//             System.out.println("0");
//         }else if(a>1){
//             System.out.println("positive number");
//         }else{
//             System.out.println("negative");
//         }
//     }
// }

//2.even or odd number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a%2==0){
//             System.out.println("even");
//         }else{
//             System.out.println("odd");
//         }
//     }
// }

//3.Sum of First N Natural numbers
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum = 0;
//         for(int i=0;i<=a;i++){
//             sum = sum+i;
//         }
//         System.out.println(sum);
//     }
// }

//4.sum of numbers in a given range
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = 0;
//         for(int i=a;i<=b;i++){
//             sum = sum+i;
//         }
//         System.out.println(sum);
//     }
// }

//5.Program to Find Greatest of Two Numbers
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a>b){
//             System.out.println("a");
//         }else if(a<b){
//             System.out.println("b");
//         }else{
//             System.out.println("both are equal");
//         }
//     }
// }

//6.greatest of three numbers
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int max = Math.max(a, Math.max(b, c));
//         System.out.println(max);
//     }
// }

//7.leap year or not
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int yr = sc.nextInt();
//         if(yr%4==0){
//             System.out.println("leap");
//         }else{
//             System.out.println("not leap");
//         }
//     }
// }

//9.number of leap years between two years
// import java.util.Scanner;
// public class day1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int count =0;
//         for(int i=a;i<=b;i++){
//             if(i%4==0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

//10.prime number checking
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         boolean isprime = true;
//         if(a<=1){
//              isprime = false;
//         }
//         for(int i=2;i<=a/2;i++){
//             if(a%i==0){ 
//                 isprime = false;
//             }
//         }
//         if(isprime){
//             System.out.println("prime");
//         }else{
//             System.out.println("not prime");
//         }
//     }
// }

//11.prime between 2 to 100
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int count=0;
//         for(int i=a;i<=b;i++){
//             for(int j=2;j<=i;j++){
//                 if(i%j==0){
//                     count++;
//                     System.out.println(j);
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

//12.sum of digits in number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum =0;
//         while(num!=0){
//             sum = sum+num%10;
//             num=num/10;
//         }
//         System.out.println(sum);
//     }
// }

//13.reverse a number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num=sc.nextInt();
//         int rev =0;
//         int rem;
//         while(num!=0){
//             rem = num%10;
//             rev = rev *10+rem;
//             num=num/10;
//         }
//         System.out.println(rev);
//     }
// }

//14.palindrome
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num=sc.nextInt();
//         int original = num;
//         int rev =0;
//         int rem;
//         while(num!=0){
//             rem = num%10;
//             rev = rev *10+rem;
//             num=num/10;
//         }
//         System.out.println(rev);
//         if(original==rev){
//             System.out.println("palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }
//     }
// }

//15.amstrong number
// import java.util.Scanner;;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int original = num;
//         int rem;
//         int sum = 0;
//         while(num!=0){
//             rem = num%10;
//             sum=sum+(rem*rem*rem);
//             num=num/10;
//         }
//         if(original==sum){
//             System.out.println("Amstrong number");
//         }else{
//             System.out.println("not an amstrong number");
//         }
//     }
// }

//16.amstrong number in a given range
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i=a;i<=b;i++){
//             int num = i;
//             int rem;
//             int sum =0;
//             while(num!=0){
//                 rem = num%10;
//                 sum = sum+(rem*rem*rem);
//                 num=num/10;
//             }
//             if(sum==i){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//17.fibanacci series
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a =0;
//         int b = 1;
//         System.out.print(a+" "+b+" ");
//         int c;
//         for(int i=2;i<=n;i++){
//             c=a+b;
//             System.out.print(c+" ");
//             a=b;
//             b=c;
//         }
//     }
// }

//18.nth term of fibanacci
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a =0;
//         int b = 1;
//         System.out.print(a+" "+b+" ");
//         int c=0;
//         for(int i=2;i<=n;i++){
//             c=a+b;
//             System.out.print(c+" ");
//             a=b;
//             b=c;
//         }
//         System.out.println("nth term is:"+c);
//     }
// }

//19.factorial
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int fact =1;
//         for(int i=1;i<=a;i++){
//             fact = fact*i;
//         }
//         System.out.println(fact);
//     }
// }

//20.power of a number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int base = sc.nextInt();
//         int exp = sc.nextInt();
//         int result =1;
//         for(int i=1;i<=exp;i++){
//             result = result*base;
//         }
//         System.out.println(result);
//     }
// }

//21.factor of a number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1;i<=a;i++){
//             if(a%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }

//22.prime factorization
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=2;i<=a;i++){
//             while(a%i==0){
//                 System.out.print(i+" ");
//                 a=a/i;
//             }
//         }
//     }
// }   

//23.strong number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int rem =0;
//         int sum=0;
//         int original=a;
//         while(a!=0){
//             rem = a%10;
//             int fact=1;
//             for(int i=1;i<=rem;i++){
//                 fact=fact*i;
//             }
//             sum=sum+fact;
//             a=a/10;
//         }
//         if(original==sum){
//             System.out.println("strong number");
//         }else{
//             System.out.println("not a strong number");
//         }
//     }
// }

//24.perfect number
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<a;i++){
//             if(a%i==0){
//                 sum = sum+i;
//             }
//         }
//         System.out.println(sum);
//         if(sum==a){
//             System.out.println("perfect number");
//         }else{
//             System.out.println("not a perfect number");
//         }
//     }
// }

//25.perfect square
// import java.util.Scanner;
// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         boolean isPerfectSquare = false;
//         for (int i = 1; i * i <= a; i++) {
//             if (i * i == a) {
//                 isPerfectSquare = true;
//                 break;
//             }
//         }
//         if (isPerfectSquare)
//             System.out.println("Perfect Square");
//         else
//             System.out.println("Not a Perfect Square");
//     }
// }

//26.swap two numbers
// import java.util.Scanner;
// public class day1{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//27.swapping without third variable
// import java.util.Scanner;
// public class day1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();//20
//         int b = sc.nextInt();//30
//         a = a+b;//a = 50
//         b = a-b;//b= 50-30 = 20
//         a=a-b;//a = 50-20 = 30
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//28.Sum of Squares of Digits-2
// import java.util.Scanner;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int sum=0;
//         int rem;
//         while(a!=0){
//             rem = a%10;
//             int sqr = rem*rem;
//             sum = sum+sqr;
//             a = a/10;
//         }
//         System.out.println(sum);
//     }
// }


//29.Area of Rectangle
// import java.util.Scanner;
// import java.math.BigDecimal;
// import java.math.RoundingMode;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         BigDecimal l = sc.nextBigDecimal();
//         BigDecimal b = sc.nextBigDecimal();
//         BigDecimal area = l.multiply(b)
//                            .setScale(5, RoundingMode.DOWN);
//         System.out.println(area);
//     }
// }


//30.echo program
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         System.out.println(n+" "+k);
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]);
//             if(i<n-1){
//                 System.out.print(" ");
//             }
//         }
//     }
// }