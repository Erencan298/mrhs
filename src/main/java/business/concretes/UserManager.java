package business.concretes;

import business.abstracts.UserService;
import core.utilities.results.*;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private  final UserDao userDao;

    @Override
    public DataResult<User> getByEmail(String email) {
        var result = this.userDao.getByEmail(email);
        if (result!= null) {
            return new SuccessDataResult<User>(result,"başarılı");
        }
        return new ErrorDataResult<User>("hata");
    }

    @Override

    public DataResult<User> findByEmailAndPassword(String email,String password) {

        var result = this.userDao.findByEmailAndPassword(email,password);
        if (result!= null){
            return new SuccessDataResult<User>(result,"Başarılı");
        }
        return new ErrorDataResult<User>("hata");

    }

    @Override
    public Result save (User user) {
        var result = this.userDao.save(user);
            if (result != null) {
                return new SuccessResult("başarılı");

            }
            return new ErrorResult("Hata");

    }
    @Override
    public DataResult<User> getById (int id){
        var result = this.userDao.getById(id);
        if (result!= null){
            return new SuccessDataResult<User>(result, "başarılı");

        }
        return new ErrorDataResult<User>("hata");
    }

    @Override
    public Result delete(User user) {
        this.userDao.delete(user);
        var result =  this.userDao.getByEmailAndPassword(user.getEmail(),user.getPassword());
        if (result != null)
        {
            return new ErrorResult("Kullanıcı silinemedi");
        }
        return new SuccessResult("Kullanıcı başarıyla silindi");
    }



}


