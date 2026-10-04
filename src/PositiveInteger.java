public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public boolean isAbundant() {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num) {
            return true;
        }
        return false;
    }

    public boolean isNarcissistic() {
        int sum = 0;
        int dummy = num;
        int count = 0;

        while (dummy > 0) {
            count++;
            dummy = dummy / 10;
        } // counting how many digits

        dummy = num; // reset dummy to num (0 -> num)

        while (dummy > 0) {
            int firstDigit = dummy % 10;
            sum += (int) Math.pow(firstDigit, count);
            dummy = dummy / 10;
        }

        if (sum == num) {
            return true;
        }
        return false;
    }
}
