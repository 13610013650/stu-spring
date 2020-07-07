package cn.stu;

import cn.stu.config.Config;
import cn.stu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类：
 */
public class Test_01 {


    public static void main(String[] args) {
        test1();
    }

    public static void test2(){
        ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService bean = configApplicationContext.getBean(UserService.class);
        bean.sayHello();
    }

    public static void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserService bean = context.getBean(UserService.class);
        bean.sayHello();
    }


}
