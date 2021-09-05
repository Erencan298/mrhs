package business.abstracts;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Employer;

public interface EmployerService {
    Result save (Employer employer);
}
