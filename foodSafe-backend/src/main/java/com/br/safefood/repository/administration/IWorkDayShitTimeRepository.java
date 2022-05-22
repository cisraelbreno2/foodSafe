package com.br.safefood.repository.administration;

import com.br.safefood.model.administration.WorkDayShiftTimeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkDayShitTimeRepository extends JpaRepository<WorkDayShiftTimeModel, Long> {

}
