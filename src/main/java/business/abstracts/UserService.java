package business.abstracts;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.User;

public interface UserService {

    DataResult<User> getByEmail(String email);

    DataResult<User> findByEmailAndPassword(String email, String password);

    Result save(User user);

    DataResult<User> getById(int id);

    Result delete(User user);


}
