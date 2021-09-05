package business.concretes;

import business.abstracts.JobPositionService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.abstracts.JopPositionDao;
import entities.concretes.Employer;
import entities.concretes.JopPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class JobPositionManager implements JobPositionService {
    private final JopPositionDao jopPositionDao;


    @Override
    public DataResult<List<JopPosition>> getAll() {
        var result = this.jopPositionDao.findAll();
        return new SuccessDataResult<List<JopPosition>>(result , "başarılı");
    }

    @Override
    public Result save(JopPosition jopPosition) {
        this.jopPositionDao.save(jopPosition);
        var result = this.jopPositionDao.save(jopPosition);
        return new SuccessResult("başarılı");

    }
}
