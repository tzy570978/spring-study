import com.tzy.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午9:49
 */
public class Mytest {
    public static void main(String[] args) {
        // create and configure beans
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // retrieve configured instance
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello);
    }
}
