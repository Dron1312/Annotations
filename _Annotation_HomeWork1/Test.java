package _Annotation_HomeWork1;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface Test {
    int a() default 0;
    int b() default 0;
}
