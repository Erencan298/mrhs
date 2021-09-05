package api.controllers;

import business.abstracts.EmployerService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employer")
@RequiredArgsConstructor

public class EmployersController {

    private final EmployerService employerService;

    @PostMapping("/add")
    public ResponseEntity<Result> add(@RequestBody Employer employer) {


        var result = this.employerService.save(employer);

        return ResponseEntity.ok(result);
    }
}
