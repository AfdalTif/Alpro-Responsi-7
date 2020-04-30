import java.util.Scanner;
 
public class algoritma_euclidian {
 
public static void main(String[] args) {
 
int n, m, r;
 
Scanner dataInput = new Scanner(System.in);
 
System.out.print("Masukkan nila n : ");
n = dataInput.nextInt();
System.out.print("Masukkan nila m : ");
m = dataInput.nextInt();
System.out.println();
 
r = m % n;
 
while (r != 0) {
n = m;
m = r;
r = n % m;
}
System.out.println("FPB = "+m);
}
}