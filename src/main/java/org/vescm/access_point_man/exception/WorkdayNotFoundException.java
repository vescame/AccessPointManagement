package org.vescm.access_point_man.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WorkdayNotFoundException extends Exception {
    public WorkdayNotFoundException(Long id) {
        super(String.format("Workday with id (%s) not found!", id));
    }
}
