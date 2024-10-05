









import java.util.Random;

public class GeneticAlgorithm {
    private static final String GENES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890, .-;:_!\"#%&/()=?@${[]}";
    private static final String TARGET = "I love Genetic Algorithms!";
    private static int randomNum(int start, int end) {
        Random rand = new Random();
        return rand.nextInt(end - start + 1) + start;
    }
    private static char mutatedGenes() {
        int len = GENES.length();
        int r = randomNum(0, len - 1);
        return GENES.charAt(r);
    }

    private static String makeGenome(){
        int length = TARGET.length();
        StringBuilder gnome = new StringBuilder();
        for (int i = 0; i < length; i++){
            gnome.append(mutatedGenes());
        }
        return gnome.toString();
    }



}
    // Function to generate random numbers in given range
