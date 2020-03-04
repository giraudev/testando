import java.math.BigDecimal;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        Payment pay1 = new Payment(BigDecimal.valueOf(123L), Double.valueOf(456L));

        Payment pay2 = new Payment(BigDecimal.valueOf(111L));

        Payment pay3 = new Payment(BigDecimal.valueOf(123L), Double.valueOf(0));

        Payment pay4 = new Payment(BigDecimal.ZERO, Double.valueOf(0));

        Payment pay5 = null;

        Payment pay6 = new Payment(Double.valueOf(0));

        check(pay1);
        check(pay2);
        check(pay3);
        check(pay4);
        check(pay5);
        check(pay6);



        if(Optional.ofNullable(pay5).isPresent()) {
            System.out.println("pay5 existe");
        }


    }

    private static void check(Payment pay1) {
        BigDecimal amount =  BigDecimal.valueOf(567.09);
        if(Optional.ofNullable(pay1).isPresent()) {
            Double tr = Optional.ofNullable(pay1.getAmount()).map(x -> x.doubleValue()).orElse(amount.doubleValue());
            System.out.println(pay1 + " existe");
            System.out.println("tr: "+tr);

            BigDecimal concept = pay1.getValue().signum() > 0 ? pay1.getValue() : null;
            System.out.println(concept);
        }
    }

    public static class Payment {
        private BigDecimal value;
        private Double amount;

        public Payment(BigDecimal value, Double amount) {
            this.value = value;
            this.amount = amount;
        }

        public Payment(BigDecimal value) {
            this.value = value;
        }

        public Payment(Double amount) {
            this.amount = amount;
        }

        public BigDecimal getValue() {
            return value;
        }

        public void setValue(BigDecimal value) {
            this.value = value;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }
    }
}


/* if (Optional.ofNullable(payerFeeData).filter(payerFeeData.getAmount().intValue() > 0)) {
            utilityPayment.setConceptAmount(payerFeeData.getAmount());
        }*/