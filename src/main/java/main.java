/**
 *
 * @author Vu
 */
import java.util.*;
import java.io.*;


public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> al2 = (ArrayList<Integer>) ois2.readObject();
        int arr1[] = new int[1000001];
        int arr2[] = new int[1000001];
        for(int x:al1){
            if(isPrime(x) == true){
                arr1[x]++;
            }
        }
        for(int x:al2){
            if(isPrime(x) == true){
                arr2[x]++;
            }
        }
        int s = 0, e =1000000;
        while(s < e){
            if(arr1[s] > 0&& arr1[e] >0 && arr2[s]==0 && arr2[e] ==0){
                System.out.println(s + " " + e);
            }
            s++;
            e--;
        }
    }
    public static boolean isPrime(int num){
        if(num<2)return false;
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}


