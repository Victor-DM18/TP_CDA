import java.util.Random;
import java.util.stream.IntStream;

public class Item5{
    public static void main(String[] args) { 
        int min = 1;
        int max = 10;
        Random rand = new Random();
        IntStream stream = rand.ints(5, min, max);
        stream.forEach(System.out::println);
    }
}