package com.br.safefood.controller;


import com.br.safefood.model.EmployeeModel;
import com.br.safefood.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository repository;
    private final PasswordEncoder encoder;

    public EmployeeController(EmployeeRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    @GetMapping("/")
    public ResponseEntity<List<EmployeeModel>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping()
    public ResponseEntity<EmployeeModel> save(@RequestBody EmployeeModel employee) {
        employee.setPassword(encoder.encode(employee.getPassword()));
        return ResponseEntity.ok(repository.save(employee));
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> validarSenha(@RequestParam String login,
                                                @RequestParam String password) {

        Optional<EmployeeModel> optEmployee = repository.findByUsername(login);
        if (optEmployee.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }

        EmployeeModel employee = optEmployee.get();
        boolean valid = encoder.matches(password, employee.getPassword());

        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);
    }
}