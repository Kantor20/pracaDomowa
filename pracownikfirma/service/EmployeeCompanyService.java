package pl.kurs.pracownikfirma.service;

import pl.kurs.pracownikfirma.model.Company;
import pl.kurs.pracownikfirma.model.Employee;

public class EmployeeCompanyService {

    public double paySalary(Company company){
        double total = 0;
        for (Employee employee : company.getEmployees()){
            total += employee.getSalary();
        }
        return total;
    }




}
