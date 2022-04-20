public class ForLoop {
    public static void main(String[] args) {
        // multiple of 3 till 50.
        for (int i = 0; i <= 50; i += 2) {
            System.out.print(i + "\t");
        }
        // ForEach Loop.
        String[] names = { "Adi", "Tya", "Pra", "Kash" };
        for (String name : names) {
            System.out.println(name);
        }
    }
}