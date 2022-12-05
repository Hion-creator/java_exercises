package exercises2;

public class generator_main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            generator_complex_tiket tiket = new generator_complex_tiket();
            System.out.println(tiket);
        }
    }
}
