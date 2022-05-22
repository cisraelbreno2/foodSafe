package com.br.safefood.repository.administration;

import com.br.safefood.model.administration.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeModel, Long> {

    Optional<EmployeeModel> findByUsername(String username);

}
