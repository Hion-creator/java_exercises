package exercises1;

import java.util.Arrays;

public class generator_Single_Ticket {

    private static final int MIN = 1;
    private static int MAX = 50;
    private static final int NUMS = 5;
    private static final int ticket = 10;

    public static int [] generatorTicket() {
        int[] numeros = new int[NUMS];
        for(int i = 0; i < NUMS; i ++) {
            numeros[i] = generator_Num();
        }
        Arrays.sort(numeros);
        return numeros;
    }

    private static int generator_Num(){
        return (int) (Math.random() * (MAX - MIN + 1) + MIN);
    }

    public static void main(String[] args) {        
        for(int i = 0; i < ticket; i ++) {
            int[] numeros = generatorTicket();
            System.out.println(Arrays.toString(numeros));
        }
    }
}