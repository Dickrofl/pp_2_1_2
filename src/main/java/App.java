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
        Cat baen2 = (Cat) applicationContext.getBean("cat");
        Cat baen3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean1));
        System.out.println(baen2.equals(baen3));

    }
}