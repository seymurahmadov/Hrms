package business.concretes;

import business.abstracts.JobPositionsService;
import dataAcces.abstracts.JobPositionsDao;
import entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionsService {
    private JobPositionsDao jobPositionsDao;

    @Autowired
    public JobPositionManager (JobPositionsDao jobPositionsDao){
        this.jobPositionsDao=jobPositionsDao;
    }


    @Override
    public List<JobPositions> getAll() {
        return null;
    }
}
