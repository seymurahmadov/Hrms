package business.abstracts;

import entities.concretes.SystemUser;

import java.util.List;

public interface SystemUserService {
    List<SystemUser> getAll();
}
