package ko.northwind.api.controllers;

import ko.northwind.business.abstracts.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/users")
public class UsersController {

    private UserService userService;

    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }
}
