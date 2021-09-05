package api.controllers;


import business.abstracts.JobPositionService;
import core.utilities.results.DataResult;
import core.utilities.results.Result;
import core.utilities.results.SuccessResult;
import entities.concretes.JopPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobposition")
@RequiredArgsConstructor
public class JobPositionsController {
    private final JobPositionService jobPositionService;

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<JopPosition>>> GetAll(){
        var result = this.jobPositionService.getAll();
        return ResponseEntity.ok(result);
    }
    @PostMapping("/add")
    public ResponseEntity<Result> Add(@RequestBody JopPosition jopPosition){
        this.jobPositionService.save(jopPosition);
        return ResponseEntity.ok(new SuccessResult("başarılı "));
    }
}
