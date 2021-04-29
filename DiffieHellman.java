
public class DiffieHellman{

    public static void main(String[] args){
        System.out.println(generatePrime());
    }


    //method to generate a random prime between 10^4 and 10^5
    public static long generatePrime(){
        long prime = 0;
        boolean isPrime = false;

        while(!isPrime){
            prime = (long) Math.floor(Math.random()*(100000-10000+1)+10000);
            isPrime = isPrime(prime);
        }
        return prime;
    }

    //Method to check if a number is prime
    public static boolean isPrime(long num){
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
              isPrime = false;
              break;
            }
          }
        return isPrime;
    }
}