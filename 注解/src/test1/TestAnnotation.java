package test1;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    int id() default 6;
    String message() default "hello!";
}
