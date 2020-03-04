import java.math.BigDecimal;

public class BigsCompare {

    public static void main(String[] args) {
        BigDecimal amount = BigDecimal.valueOf(668.03);
        BigDecimal fee = BigDecimal.valueOf(678.02);

        Double transaction = amount.compareTo(fee) >= 0 ? amount.doubleValue() : fee.doubleValue();
        System.out.println(transaction);
    }
}
