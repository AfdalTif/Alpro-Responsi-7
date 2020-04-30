import java.util.*;
 
public class algoritma_kadane{
 
     public static int nilaimaxjumlahsubarray(int arr[]) {
 
         //tetapkan nilai pertama array
         int maxSum = arr[0];
         int sum = arr[0];
 
         //melewati array
         for(int i = 1; i < arr.length; i++) {
            
             if(sum < 0) {
                sum = arr[i];
             } else {
                sum = sum + arr[i];
             }
              
             //dapatkan nilai maksimum
             maxSum = Math.max(sum, maxSum);
        }
      
         return maxSum;
   }
 
    public static void main(String[] args) {
 
        int arr[] = { 1, 2, -5, 4, 3, 8 , 5 };
        int hasil = nilaimaxjumlahsubarray(arr);
 
        System.out.println(hasil);
 
    }
}