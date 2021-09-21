import com.tzy.dao.UserDaoMysqlmpl;
import com.tzy.dao.UserDaoOraclempl;
import com.tzy.service.UserServiceImpl;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午9:49
 */
public class Mytest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，DAO层不需要接触
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlmpl());
        userService.getUser();

        UserServiceImpl userService2 = new UserServiceImpl();
        userService2.setUserDao(new UserDaoOraclempl());
        userService2.getUser();
    }
}
