package full_guide.part_01.chapter_12._14_MarkerAnnotation;

import java.lang.reflect.Method;

/**
 * Created by mega on 31.08.2016.
 */
public class ClassA {
    @MarkAnnotation
    public void methodA() {
        ClassA classA = new ClassA();
        Class clazz = classA.getClass();
        try {
            Method m = clazz.getMethod("methodA");
            if (m.isAnnotationPresent(MarkAnnotation.class)) {
                System.out.println("MarkAnnotation is present");
            } else {
                System.out.println("MarkAnnotation is not present");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

class Test {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.methodA();
    }
}
