package less4.controller;

import less4.model.User;

public interface UserController {
    <T extends User> User create(T user);


}
