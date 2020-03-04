package Hacker;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int value = bill.get(k);
        int conta = 0;

        for(int x = 0; x<bill.size(); x++){
            conta = conta + bill.get(x);
        }

        int just = (conta - value)/2;

       if (just == b){
           System.out.printf("Bon Appetit");
       }else {
          Integer result = b-just;
           System.out.printf(result.toString());
       }

    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int k = 1;

        bonAppetit(bill, 1, 12);

    }
}
