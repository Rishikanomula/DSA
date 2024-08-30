//import java.lang.reflect.Method;
//1
/*import java.util.Scanner;
public class Dsa {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner sc= new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int last1 = Math.abs(a)%10;
                int last2 = Math.abs(b)%10;
                int Sum=last1+last2;
                System.out.println("The sum of the last digits is: "+Sum);
    }
}*/

//2
/*public class Dsa{
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    //int m = sc.nextInt();
    int ExactMultiple(int n, int m){
        if(n==0 | m==0){
            return 3;
         }
        else if(n%m==0 | m%n==0){
            return 2;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Dsa a = new Dsa();
        System.out.println(a.ExactMultiple(15,3));
    }
} */

//3
/*public class Dsa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.length() > b.length()){
            System.out.println(b+a+b);
        }
        else if (b.length() > a.length() ) {
            System.out.println(a+b+a);
        }
    }
}*/

//4

import java.util.Scanner;
/*public class Dsa {
    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
        int[] arr = {num1, num2, num3, num4, num5};
        int evenCount = 0;
        int oddCount = 0;
        for(int i:arr ){
            if(i % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        if(type.equals("even")){
            return evenCount;
        }
        else {
            return oddCount;
        }

    }

    public static void main(String[] args) {
        System.out.println(countNumbers(1,3,5,6,4,"odd"));
    }
} */


//5
/*public class Dsa {
    public static int Middle(int a){
        int Digit = a/10;
        int LastDigit = Digit%10;
        return LastDigit;
    }
    public static void main(String[] args) {
        System.out.println(Middle(123));
    }
}*/

//6

/*public class Dsa {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int max = Math.max(len1,len2);

        StringBuilder mergedStr = new StringBuilder();

        for(int i=0; i<max; i++){
            if(i<len1){
                mergedStr.append(str1.charAt(i));
            }
            if(i<len2){
                mergedStr.append(str2.charAt(i));
            }
        }
        System.out.println(mergedStr.toString());

    }
}*/


//7 Padovan sequence
/* public class Dsa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pandovan = new int[n];
        // STORING FIRST 3 VARIABLES
        pandovan[0]=1;
        pandovan[1]=1;
        pandovan[2]=1;
        System.out.println(pandovan[0]);
        System.out.println(pandovan[1]);
        System.out.println(pandovan[2]);
        for(int i=3; i<n; i++){
            pandovan[i] = pandovan[i-3] + pandovan[i-2];

            System.out.println(pandovan[i] + " " );
        }
        System.out.println();
    }
} */

class Dsa{
public static void main(String[] args){
    int[] arr = new int[]

}
}



























