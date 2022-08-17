package business.abstracts;

import entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionsService {
    List<JobPositions> getAll();
}
