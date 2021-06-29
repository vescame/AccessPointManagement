package org.vescm.access_point_man.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vescm.access_point_man.model.Workday;

@Repository
public interface WorkdayRepository extends JpaRepository<Workday, Long> {
}
