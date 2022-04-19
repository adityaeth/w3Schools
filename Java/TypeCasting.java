public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic Type Casting.
        System.out.println(myInt);
        System.out.println(myDouble);

        // Manual Casting
        double myDob = 6.9d;
        int myin = (int) myDob;
        System.out.println(myin);
    }
}
