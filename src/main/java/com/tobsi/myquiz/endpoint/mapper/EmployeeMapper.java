package com.tobsi.myquiz.endpoint.mapper;

import com.tobsi.myquiz.endpoint.dto.EmployeeDto;
import com.tobsi.myquiz.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeDto entityToDto(Employee entity);
    Employee dtoToEntity(EmployeeDto dto);
    List<EmployeeDto> entityListToDto(List<Employee> entity);
    List<Employee> dtoListToEntity(List<EmployeeDto> dto);

}
