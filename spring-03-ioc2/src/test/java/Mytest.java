import com.tzy.pojo.Student;
import com.tzy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午9:49
 */
public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Student student = context.getBean("student",Student.class);
//        student.showName();

        User user = context.getBean("user",User.class);
        user.showName();

        User user2 = context.getBean("user2",User.class);
        user2.showName();

        User user3 = context.getBean("user3",User.class);
        user3.showName();
    }
}
