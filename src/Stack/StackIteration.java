package Stack;

public class StackIteration {

    public static int sum;

    public static void sumOfN(int num) {
        if (num == 0)
            return;
            sum += num;
            sumOfN(num - 1);
    }

    public static int sumOfN2(int num) {
        if (num == 0) {
            return 0;
        }
        return sum + sumOfN2(num - 1);
    }



}
