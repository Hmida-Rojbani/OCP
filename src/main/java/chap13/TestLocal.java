package chap13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestLocal {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        System.out.println(Locale.getDefault());
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        String pattern = "#,###,000.0#";
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new
                        DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<"+message+">");
    }
}
