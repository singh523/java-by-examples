package com.example.features.mapstruct;

import org.mapstruct.Mapper;

import java.util.Set;

@Mapper
public interface EmployeeMapper {
    Set<EmployeeDto> employeeToDto(Set<Employee> employees);
}
