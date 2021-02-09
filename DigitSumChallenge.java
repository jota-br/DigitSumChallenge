public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(1329328447);
    }

    public static int sumDigits(int number) {
        if(number < 10){
            return -1;
        }

        boolean numDigits = true;

        int n, numberSum = 0;
        while(true) {
            if(numDigits) {
                n = number % 10;
                System.out.println(n);
                numberSum += n;
                numDigits = false;
                continue;
            }
            number /= 10;
            n = number % 10;
            System.out.println(n);
            numberSum += n;
            if((String.valueOf(number).length()) == 1){
                break;
            }
        }

        System.out.println(numberSum);
        return numberSum;
    }
}
