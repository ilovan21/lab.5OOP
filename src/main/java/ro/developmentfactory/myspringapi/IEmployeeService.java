package ro.developmentfactory.myspringapi;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployee();
    void createEmployee(Employee employee);
    void updateEmployee(Long id,Employee employee);
    void deleteEmployee(Long id);
}
