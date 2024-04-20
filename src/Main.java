import java.util.Random;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Наибольшее по модулю из них: " + ((max >= abs(min)) ? max : min));
    }
}