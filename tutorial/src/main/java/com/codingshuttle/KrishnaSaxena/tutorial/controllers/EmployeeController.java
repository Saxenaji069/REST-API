package com.codingshuttle.KrishnaSaxena.tutorial.controllers;

//Operations:-
// GET/employee
//POST/Employee
//DELETE/employee/{id}

import com.codingshuttle.KrishnaSaxena.tutorial.dto.EmployeeDTO;

import com.codingshuttle.KrishnaSaxena.tutorial.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path="/employees")

public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
 }


    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){

        return employeeService.createNewEmployee(employeeDTO);
    }



    @DeleteMapping(path="/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id){
         return employeeService.deleteEmployeeById(id);
    }

}
