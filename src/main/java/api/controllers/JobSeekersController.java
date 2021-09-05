package api.controllers;


import business.abstracts.JobSeekerService;
import core.utilities.results.DataResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jopseerkers")
@RequiredArgsConstructor
public class JobSeekersController {
    private final JobSeekerService jobSeekerService;



}
