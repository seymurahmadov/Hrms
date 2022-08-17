package business.abstracts;

import entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekersService {
    List<JobSeekers> getAll();
}
