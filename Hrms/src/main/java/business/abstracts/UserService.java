package business.abstracts;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
}
