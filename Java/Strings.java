public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting + greeting.length());
        System.out.println(greeting + greeting.toUpperCase());
        System.out.println(greeting + greeting.toLowerCase());
        System.out.println(greeting.indexOf("l"));

        // Conactination
        String fName = "Aditya ";
        String lName = "Prakash";
        System.out.println(fName + lName);
        System.out.println(fName.concat(lName));

        // Adding numbers and strings
        int x = 10;
        String y = "20";
        System.out.println(x + y);

        // Special Characters
        System.out.println("This is Awesome. Isn\'t it?\f ");
    }
}
