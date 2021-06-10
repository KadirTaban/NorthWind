package ko.northwind.business.abstracts;

import ko.northwind.core.entities.User;
import ko.northwind.core.utilities.results.DataResult;
import ko.northwind.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
