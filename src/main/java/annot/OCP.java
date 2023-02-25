package annot;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(OCPs.class)
public @interface OCP {
    boolean value();
    int score() default 95;
    //Class cls();
}