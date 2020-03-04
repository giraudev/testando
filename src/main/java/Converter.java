import java.math.BigDecimal;
import java.util.Optional;

public class Converter {

    public static void main(String[] args) {

        BigDecimal originalValue = new BigDecimal(3.43);

        Double convertedcValue = originalValue.doubleValue();

        BigDecimal amount = new BigDecimal(80.99);
        Double convertedValue = originalValue.doubleValue();

        System.out.println(convertedValue);

        final BigDecimal amountedFee = Optional.ofNullable(originalValue).filter(x -> x.compareTo(BigDecimal.ZERO) > 0)
                .orElse(BigDecimal.ZERO);
        final Double transactiondAmount = amountedFee.add(amount).doubleValue();
        System.out.printf("transactiondAmount: "+transactiondAmount);

    }
}
