package p19188;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){

        System.out.println("give the n number"); // το n > 0 input του χρηστη
        Scanner obj = new Scanner(System.in);
        int n_number = obj.nextInt();
        Random random_num = new Random();
        int[] num_array = new int[n_number]; // ο αριθμος τον εγκυρων εγραφων του πινακα(max = n_number)
        boolean b1 = false; // βοηθητικη για ελεγχο της while,αν εχει γεμισει ο πινακας
        int array_spot = 0; // προχαραει τις θεσεις του array για να ξερω που να βαλω το νεο αριθμο
        long startTime = System.nanoTime();
        while(b1 == false){
            int b2 = random_num.nextInt(n_number +1);// +1 για να εχει και τον αριθμο n που εχει δοσει ο χρηστης
            boolean b3 = false;
              for(int i:num_array){ //κανω ελεγχο μεχρι εκει που εχω γεμισει τον πινακα(num array)
                if(i == b2 || b2 == 0 ){ // το β2 == 0 το εβαλα γιατι δεν θελω να ειναι μεσα το 0
                    b3 = true;
                    break; // αμα το βρει να μην τσεκαρει και το υπολοιπο array
                }
            }
            if(b3 == false){
                num_array[array_spot] = b2; // αν δεν υπαρχει βαλτο στην θεση array_spot
                array_spot++; // επομενη θεση
            }
            if(array_spot == n_number ){
               b1 = true; // αν γεμισει βγαλε με απο το while
            }
        }
        long stopTime = System.nanoTime();
        long duration = (stopTime - startTime);
        for(int i:num_array){
            System.out.println(i);
        }
        Arrays.sort(num_array);
        for(int i:num_array) {
            System.out.println(i);
        }


        System.out.println("duration of the programm(nanoseconds): "+duration);
        System.out.println("duration of the programm(seconds): "+duration/1000000);



    }
}
