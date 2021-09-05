package business.concretes;


import dataAccess.abstracts.RoleDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleManager {
    private final RoleDao roleDao;
}
