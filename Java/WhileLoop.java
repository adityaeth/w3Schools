public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("Supp?\n");
            if (i++ == 6)
                break;
        }
        do {
            System.out.println("It\'s working");
            i++;
        } while (i != 69);
    }
}
