package _Annotation_HomeWork1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> clss = UseAnnotation.class;
        Method[] methods = clss.getDeclaredMethods();

        for(Method met : methods){
            if (met.isAnnotationPresent(Test.class)) {
                Test test = met.getAnnotation(Test.class);
                int res = 0;

                try {
                    res = (Integer) met.invoke(null, test.a(), test.b());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println(res);
            }

        }
    }
}
