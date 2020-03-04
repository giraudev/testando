public class DigitalLine {

    public static void main(String[] args) {

        String barcode = "00194790200001693590000002396527700353147011";
        //00190.00009 02396.527703 03531.470114 4 79020000169359
        char[] ber = barcode.toCharArray();

        String campo1 = barcode.substring(0,3) + barcode.substring(19) + barcode.substring(20,23) ;
            String campo2 = barcode.substring(24,28).concat(barcode.substring(29,33));
            String campo3 = barcode.substring(34,38).concat(barcode.substring(39,43));
            String campo4 = barcode.substring(4);
            String campo5 = barcode.substring(5,18);
        System.out.println(campo1);

            String number =  campo1 + modulo10(campo1) + campo2 + modulo10(campo2) + campo3 + modulo10(campo3) + campo4 + campo5;

        System.out.println(number);
    }

    private static int modulo10(String number2) {
        int sum  = 0;
        int pound  = 2;
        int index = number2.length() - 1;
        char[] number = number2.toCharArray();

        while (index >= 0) {
            int multiplication = Integer.valueOf(number[index]) * pound;
            if (multiplication >= 10) {
                multiplication = 1 + (multiplication - 10);
            }
            sum = sum + multiplication;
            if (pound == 2) {
                pound = 1;
            } else {
                pound = 2;
            }
            index--;
        }
        int digit = 10 - (sum % 10);
        if(digit == 10) {
            digit = 0;
        }

        return digit;
    }

}
