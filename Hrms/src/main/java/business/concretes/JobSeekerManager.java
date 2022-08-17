package business.concretes;

import business.abstracts.JobSeekersService;
import dataAcces.abstracts.JobSeekersDao;
import entities.concretes.JobSeekers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekersService {

    private JobSeekersDao jobSeekersDao;

    public JobSeekerManager (JobSeekersDao jobSeekersDao){
        super();
        this.jobSeekersDao=jobSeekersDao;
    }

    @Override
    public List<JobSeekers> getAll() {
        return null;
    }
}
