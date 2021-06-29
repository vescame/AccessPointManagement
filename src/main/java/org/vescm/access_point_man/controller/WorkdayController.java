package org.vescm.access_point_man.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.vescm.access_point_man.exception.WorkdayNotFoundException;
import org.vescm.access_point_man.model.Workday;
import org.vescm.access_point_man.service.WorkdayService;

import java.util.List;

@RestController(value = "/workdays")
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class WorkdayController {
    private final WorkdayService workdayService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Workday> findAllWorkdays(){
        return workdayService.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Workday createWorkday(@RequestBody Workday workday){
        return workdayService.saveWorkday(workday);
    }

    @GetMapping("/{workdayId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Workday getWorkdayByID(@PathVariable Long workdayId) throws WorkdayNotFoundException {
        return workdayService.getById(workdayId);
    }

    @PutMapping
    public Workday updateWorkday(@RequestBody Workday workday){
        return workdayService.updateWorkday(workday);
    }

    @DeleteMapping("/{workdayId}")
    @ResponseStatus(value = HttpStatus.OK)
    public Workday deleteByID(@PathVariable Long workdayId) throws WorkdayNotFoundException {
        return workdayService.deleteWorkday(workdayId);
    }
}
