public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(1329328447);
    }

    public static int sumDigits(int number) {
        if(number < 10){
            return -1;
        }

        int numDigits = String.valueOf(number).length();

        int i = 0;
        int n, numberSum = 0, leftNumber = number;
        while(true) {
            if(numDigits == String.valueOf(number).length()) {
                n = number % 10;
                System.out.println(n);
                numberSum += n;
                numDigits = 0;
                continue;
            }
            leftNumber = leftNumber / 10;
            n = leftNumber % 10;
            System.out.println(n);
            numberSum += n;
            if(String.valueOf(leftNumber).length() == 1){
                break;
            }
        }

        System.out.println(numberSum);
        return n;
    }
}
