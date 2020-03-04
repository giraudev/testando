import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

public class OneCent {

    public static void main(String[] args) {
//        System.out.println("result " + domanfo(new BigDecimal(0.00), new BigDecimal(208.02),
//                new BigDecimal(208.03)));
//
//        System.out.println("result " + domanfo(new BigDecimal(62.72), new BigDecimal(2160.70),
//                new BigDecimal(2297.99)));
//
//        System.out.println("result " + domanfo(new BigDecimal(11.99), new BigDecimal(912.15),
//                new BigDecimal(900.96)));
//
//        System.out.println("result " + domanfo(new BigDecimal(11.99), new BigDecimal(912.15),
//                new BigDecimal(900.96)));
//
//        System.out.println("result " + domanfo(new BigDecimal(11.99), new BigDecimal(912.15),
//                new BigDecimal(900.30)));

        System.out.println("result " + domanfo(new BigDecimal(11.96), new BigDecimal(919.96),
                new BigDecimal(800.00)));
    }

    public static Double domanfo ( BigDecimal feeAmount, BigDecimal transactionAMountFee, BigDecimal utilityAmount){
        final BigDecimal transactionAmount = utilityAmount
                .compareTo(transactionAMountFee) >= 0 ? utilityAmount : transactionAMountFee;

        if(feeAmount!=null&& feeAmount.signum() > 0){
            utilityAmount.add(feeAmount, new MathContext(10));
            BigDecimal sum = utilityAmount.add(feeAmount, new MathContext(10));
            System.out.println("sum "+sum);
            System.out.println("transaction "+transactionAmount);

            if(sum.compareTo(transactionAmount)>0){
                return sum.doubleValue();
            }

            System.out.println(sum);
        }
            return transactionAmount.doubleValue();
    }
}
