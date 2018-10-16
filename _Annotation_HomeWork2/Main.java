package _Annotation_HomeWork2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        TextContainer textContainer = new TextContainer();
        Class<?> clss = textContainer.getClass();
        SaveTo saveTo = clss.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = clss.getDeclaredMethods();

        for(Method met : methods){

            if(met.isAnnotationPresent(Saver.class)){
                try {
                    met.invoke(textContainer, path);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
