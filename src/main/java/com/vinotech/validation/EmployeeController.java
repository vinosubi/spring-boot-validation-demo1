package com.vinotech.validation;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping
    public ResponseEntity<String> createEmployee(@Validated @RequestBody Employee employee) {
        // Process the validated employee object
        return ResponseEntity.ok("Employee created successfully");
    }
}
