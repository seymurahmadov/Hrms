package business.concretes;

import business.abstracts.EmployersService;
import dataAcces.abstracts.EmployersDao;
import entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployersManager implements EmployersService {
    private EmployersDao employersDao;

    @Autowired
    public EmployersManager (EmployersDao employersDao){
        super();
        this.employersDao=employersDao;
    }


    @Override
    public List<Employers> getAll() {
        return null;
    }
}
