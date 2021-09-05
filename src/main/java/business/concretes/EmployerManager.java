package business.concretes;

import business.abstracts.EmployerService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.abstracts.EmployerDao;
import entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class EmployerManager implements EmployerService {
    private final EmployerDao employerDao;

    @Override
    public  Result save(Employer employer) {

        Employer result = this.employerDao.save(employer);
        return new  SuccessResult( "başarılı");
        //return new SuccessResult<Employer>(this.employerDao.save(employer),"başarılı");
    }

}
