package api.controllers;

import business.abstracts.UserService;
import entities.mapStruct.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService ;
    private UserMapper userMapper;

}
