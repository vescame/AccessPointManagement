package org.vescm.access_point_man.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vescm.access_point_man.exception.WorkdayNotFoundException;
import org.vescm.access_point_man.model.Workday;
import org.vescm.access_point_man.repository.WorkdayRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class WorkdayService {
    private final WorkdayRepository workdayRepository;

    private Workday workdayExists(Long workdayId) throws WorkdayNotFoundException {
        return workdayRepository.findById(workdayId)
                .orElseThrow(() -> new WorkdayNotFoundException(workdayId));
    }

    public Workday saveWorkday(Workday workday){
        return workdayRepository.save(workday);
    }

    public List<Workday> findAll() {
        return workdayRepository.findAll();
    }

    public Workday getById(Long workdayId) throws WorkdayNotFoundException {
        return workdayExists(workdayId);
    }

    public Workday updateWorkday(Workday workday){
        return workdayRepository.save(workday);
    }

    public Workday deleteWorkday(Long workdayId) throws WorkdayNotFoundException {
        Workday workday = workdayExists(workdayId);
        workdayRepository.deleteById(workdayId);
        return workday;
    }
}
