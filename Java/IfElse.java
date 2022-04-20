public class IfElse {
    public static void main(String[] args) {
        int time = 22;
        if (time < 80)
            System.out.println("Right");
        else
            System.out.println("Something Fishy");

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        // Shorthand
        String name = "Kingshuk";
        String areYouOk = (name == "Kingshuk") ? "Yes" : "No!";
        System.out.println(areYouOk);
    }
}