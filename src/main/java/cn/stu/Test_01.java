package cn.stu;

import cn.stu.config.Config;
import cn.stu.service.ContextService;
import cn.stu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 测试类：
 */
public class Test_01 {


    public static void main(String[] args) {
        test4();
    }

    public static void test5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oldArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            oldArr[i] = sc.nextInt();
        }
        sc.close();
        // 定义变量a,用来计算0的个数
        int a = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[0] == 0) {
                a++;
            }
        }
        // 确定新数组长度
        int newArr[] = new int[n - a];
        // 定义变量,用来表示newArr数组的下标值
        int b = 0;
        for (int i = 0; i < oldArr.length; i++) {
            // 用选择结构将旧数组不为0的单位按顺序负值给新数组
            if (oldArr[i] != 0) {
                newArr[b] = oldArr[i];
                // 控制,新数组的下标
                b++;
            }
        }
        System.out.print("新数组 newArr 的值为: ");
        for (int i = 0; i < newArr.length; i++) { //输出新数组
            System.out.print(newArr[i] + " ");
        }
    }


    public static void test4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int next = scanner.nextInt();
        int[] arry = new int[next];
        for (int i = 0; i < next; i++) {
            System.out.println("请输入第" + (i + 1) + "个数.");
            int value = scanner.nextInt();
            if (value != 0) {
                arry[i] = value;
            }
        }
        System.out.println("数组为：");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }

    public static void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        ContextService bean = context.getBean(ContextService.class);
        String context1 = bean.getContext();
        System.out.println("context:" + context1);
    }

    public static void test2() {
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
