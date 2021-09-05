package business.concretes;

import business.abstracts.JobSeekerService;
import core.utilities.results.DataResult;
import core.utilities.results.SuccessDataResult;
import dataAccess.abstracts.JobSeekerDao;
import dataAccess.abstracts.JopPositionDao;
import entities.concretes.JobSeeker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor


public class JobSeekerManager implements JobSeekerService {

    private final JobSeekerDao jobSeekerDao;
}
