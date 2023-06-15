package test2;

import java.lang.reflect.Method;

public class TestTool {
    public static void main(String[] args) {
        MethodClass methodClass = new MethodClass();
        Class<? extends MethodClass> c = methodClass.getClass();
        Method[] methods = c.getMethods();
        //记录log信息
        StringBuilder message = new StringBuilder();
        //记录异常次数
        int exceptionCount = 0;
        for (Method method:methods) {
            if (method.isAnnotationPresent(check.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(methodClass,null);
                } catch (Exception e) {
                    exceptionCount++;
                    message.append(method.getName());
                    message.append(" has exception: \n\r caused by ");
                    //记录异常名称
                    message.append(e.getCause().getClass().getSimpleName());
                    message.append("\n\r");
                    //记录异常的具体信息
                    message.append(e.getCause().getMessage());
                    message.append("\n\r");
                }
            }
        }
        message.append(c.getSimpleName());
        message.append("has ");
        message.append(exceptionCount);
        message.append(" exception");
        //报告
        System.out.println(message);
    }
}
