package ko.northwind.business.concretes;

import ko.northwind.business.abstracts.UserService;
import ko.northwind.core.dataAccess.UserDao;
import ko.northwind.core.entities.User;
import ko.northwind.core.utilities.results.DataResult;
import ko.northwind.core.utilities.results.Result;
import ko.northwind.core.utilities.results.SuccessDataResult;
import ko.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManager implements UserService {
    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }


    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult ("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu.");
    }
}
