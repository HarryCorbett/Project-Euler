public class Powers {

    public static void main(String[] args) {

        int power = 5;
        int maxSum = (int) (Math.pow(9,power) * power);
        int sum = 0;

        for (int i = 2; i < maxSum; i++){
            if(checkValid(i,power)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean checkValid(int num, int power){
        int tempNum = num ;
        int sum = 0;

        while(tempNum >= 1){
            int digit = tempNum % 10;
            tempNum /= 10;
            sum += Math.pow(digit, power);
            if(sum > num){
                break;
            }
        }
        return sum == num;
    }
}
