package com.br.safefood.security;

import com.br.safefood.repository.administration.IEmployeeRepository;
import com.br.safefood.model.administration.EmployeeModel;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDetailService implements UserDetailsService {

    private final IEmployeeRepository repository;

    public UserDetailService(IEmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<EmployeeModel> employee = repository.findByUsername(username);
        if (employee.isEmpty()) {
            throw new UsernameNotFoundException("Usuário [" + username + "] não encontrado");
        }

        return new UserDetailsData(employee);
    }

}