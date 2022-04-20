public class Operator {
    public static void main(String[] args) {
        int x = 10 + 5;
        int sum = x + 5;
        int mul = sum * x;
        System.out.println(x);
        System.out.println(sum);
        System.out.println(mul);
        // Assignment opeator
        sum *= mul;
        mul += sum;
        System.out.println(mul);
        // Comparison operator
        System.out.println(sum == mul);
        System.out.println(sum < mul);
        // Logical Operator
        System.out.println(sum < mul && !(sum == 20));

    }
}
