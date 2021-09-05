package api.controllers;


import business.abstracts.UserService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.User;
import entities.dto.UserLoginDto;
import entities.dto.UserRegisterDto;
import entities.mapStruct.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("account")
@RequiredArgsConstructor
public class AccountController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/finduser")
    public ResponseEntity<DataResult<User>> findByUserName(@RequestParam String email) {
        var result = this.userService.getByEmail(email);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/login")
    public ResponseEntity<DataResult<User>> findByUserNameAndPassword(@RequestParam String email, String password) {
        var result = this.userService.findByEmailAndPassword(email, password);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/register")
    public ResponseEntity<Result> register(@Valid @RequestBody UserRegisterDto registerDto) {
        if (registerDto.getPassword().equals(registerDto.getPassword())) {
            User user = userMapper.mapUserToRegister(registerDto);
            var result = this.userService.save(user);
            return ResponseEntity.ok(result);

        }
        return null;
    }

    @GetMapping("/getbyid")
    public ResponseEntity<DataResult<User>> getById(@RequestParam Integer id) {
        var result = this.userService.getById(id);
        return ResponseEntity.ok(result);

    }

    @PostMapping("/roledetails")
    public ResponseEntity<Result> roleDetails () {
   return null;
    }

}
