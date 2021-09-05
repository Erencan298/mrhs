package business.abstracts;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.JopPosition;

import java.util.List;

public interface JobPositionService {
    DataResult<List<JopPosition>> getAll();
    Result save (JopPosition jopPosition);

}

