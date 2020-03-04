package Hacker;

public class Hiking {

    public static void main(String[] args) {

        String palavra = "DDUUDDUDUUUD";

        char U = 'U';
        int n = 0;
        int valley = 0;

        for(char c : palavra.toCharArray()){
            if(c == 'U') ++n;
            if(c == 'D') --n;

            // if we just came UP to sea level
            if(n == 0 && c == 'U')
                ++valley;
        }

        System.out.println(valley);

    }
}
