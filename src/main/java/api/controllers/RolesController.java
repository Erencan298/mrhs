package api.controllers;

import business.abstracts.RoleService;
import business.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RolesController {
    private final RoleService roleService;
    private final UserService userService;
}
