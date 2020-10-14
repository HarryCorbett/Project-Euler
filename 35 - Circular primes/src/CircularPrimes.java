public class CircularPrimes {

    public static void main(String[] args) {

        int n = 1000000;
        boolean[] isPrime = new boolean[n];
        int count = 0;

        // pre calculate primes below n using Sieve of Eratosthenes
        for(int i = 2; i<n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i < (int) Math.sqrt(n) + 1;i++){
            for (int j = 2; j*i < n; j++){
                isPrime[i*j] = false;
            }
        }

        //check if circular prime
        for(int i = 2; i<n; i++){
            if(isPrime[i]) {
                // count number of digits
                int countDigits = 0;
                int tempNum = i;
                while (tempNum > 0) {
                    countDigits++;
                    tempNum /= 10;
                }

                // check each permutation
                int num = i;
                boolean circular = false;
                while(isPrime[num]){

                    int remainder = num % 10;
                    int div = num / 10;
                    num = (int)((Math.pow(10, countDigits - 1)) * remainder) + div;
                    if(num == i){
                        circular = true;
                        break;
                    }
                }
                if(circular){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
