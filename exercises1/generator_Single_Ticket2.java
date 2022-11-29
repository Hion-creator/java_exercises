package exercises1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class generator_Single_Ticket2 {

    private static final int MIN = 1;
    private static int MAX = 50;
    private static final int NUMS = 5;
    private static final int ticket = 10;

    public static List<Integer> generatorTicket() {
        List<Integer> numeros = new ArrayList<>();
        for ( int i = 0; i < NUMS; i++){
            int num = generator_Num();
            while (numeros.contains(num)){
                num = generator_Num();
            }
            numeros.add(num);
        }
        Collections.sort(numeros);
        return numeros;
    }

    private static int generator_Num(){
        return (int) (Math.random() * (MAX - MIN + 1) + MIN);
    }

    public static void main(String[] args) {        
        for(int i = 0; i < ticket; i ++) {
            List<Integer> numeros = generatorTicket();
            System.out.println(numeros);
        }
    }
}