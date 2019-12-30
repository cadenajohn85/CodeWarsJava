public class IsPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++)
                if (num % i == 0) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPrime(12) = " + isPrime(12));
    }
}