package business.concretes;

import business.abstracts.SystemUserService;
import dataAcces.abstracts.SystemUserDao;
import entities.concretes.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemUserManager implements SystemUserService {
    private SystemUserDao systemUserDao;

    @Autowired
    public SystemUserManager(SystemUserDao systemUserDao){
        super();
        this.systemUserDao=systemUserDao;

    }


    @Override
    public List<SystemUser> getAll() {
        return null;
    }
}
