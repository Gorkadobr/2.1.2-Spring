import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean hello = bean == bean1;
        System.out.println(bean.getMessage() + " == " + bean1.getMessage() + " = " + hello);
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        boolean catt = bean2 == bean3;
        System.out.println(bean2.getMessage() + " == " + bean3.getMessage() + " = " + catt);

    }
}