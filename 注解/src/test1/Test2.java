package test1;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Class<?> class1 = Class.forName("test1.Test");
        boolean w = class1.isAnnotationPresent(TestAnnotation.class);
        if (w)
        {
            TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);
            System.out.println("id:"+testAnnotation.id());
            System.out.println("msg:"+testAnnotation.message());
        }
    }
}
