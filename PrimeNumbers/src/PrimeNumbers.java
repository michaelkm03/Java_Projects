
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class PrimeNumbers {
    
    public static void main(String[] args){
        List<Integer> p = getPrimes(34);
        int s = p.size();
        System.out.println("You've created an array of size " + (s - 1));
        System.out.println(p);
    }
    
    public static List<Integer> getPrimes(int size){
        boolean[] isPrime = new boolean[size + 1];
        System.out.println(isPrime);
        int i;
        List<Integer> primes = new ArrayList<>(size + 1);
        // declare starting prime number
        int p = 2;
        
        // add ints to array given size
        for ( i = 0; i <= size; i++){
            primes.add(i);
        }
        
        while (p * p <= size){
        }
            
        return primes;
    }
    
}