import java.util.regex.Pattern;

public class RegexEntity {

    public static void main(String[] args) {

        final String SIMIAN_PATTERN = "^[0-9]{3}\\d[_{1}][0-9]{1}";
        Pattern pattern = Pattern.compile(SIMIAN_PATTERN);
        Boolean vol = pattern.matcher("0903").find();

        System.out.println(vol);

    }
}
