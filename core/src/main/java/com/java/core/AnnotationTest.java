package com.java.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author Dhiraj
 * @date 21/12/18
 */
public class AnnotationTest {
    public static void main(String[] args) {
        App app = new App();
        app.age=20;
        Field[] fields = app.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
            Annotation[] annotations=field.getDeclaredAnnotations();
            for (Annotation annotation:annotations) {
                System.out.println(annotation.annotationType());

            }
        }
    }
}
