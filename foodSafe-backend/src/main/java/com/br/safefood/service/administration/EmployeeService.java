package com.br.safefood.service.administration;

import com.br.safefood.model.administration.EmployeeModel;
import com.br.safefood.repository.administration.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository employeeRepository;

    @Transactional
    public EmployeeModel save(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    //public Page<EmployeeModel> findAll(Pageable pageable) {
    //    return employeeRepository.findAll(pageable);
    //}

    public Optional<EmployeeModel> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Transactional
    public void delete(EmployeeModel employeeModel) {
        employeeRepository.delete(employeeModel);
    }
}
