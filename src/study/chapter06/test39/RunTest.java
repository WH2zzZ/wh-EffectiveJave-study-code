package study.chapter06.test39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        int test = 0;
        int pass = 0;

        testDemo(test, pass);

        exceptionTestDemo(test, pass);

    }

    private static void exceptionTestDemo(int test, int pass) throws InstantiationException, IllegalAccessException {
        Class<?> testClass = Sample2.class;
        Object obj = testClass.newInstance();
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ExceptionTest.class)){
                test++;
                try {
                    method.invoke(obj);
                    System.out.println("Test " + method + "failed : no Exception " + method);
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    Class<? extends Throwable> excType = method.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)){
                        pass++;
                    }else {
                        System.out.println("Test " + method + "failed : expected " + excType.getName() + ", got " + exc);
                    }
                }
            }
        }

        System.out.println("Passed : " + pass + ", Failed : " + (test - pass));
    }

    private static void testDemo(int test, int pass) throws InstantiationException, IllegalAccessException {
        Class<?> testClass = Sample.class;
        Object obj = testClass.newInstance();
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)){
                test++;
                try {
                    method.invoke(obj);
                    pass++;
                } catch (IllegalAccessException e) {
                    Throwable exc = e.getCause();
                    System.out.println(method + "failed: " + exc);
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    System.out.println("Invalid @Test: " + method);
                }
            }
        }

        System.out.println("Passed : " + pass + ", Failed : " + (test - pass));
    }
}
