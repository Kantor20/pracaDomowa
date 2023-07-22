package pl.kurs.pracownikfirma.service;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.pracownikfirma.model.Company;
import pl.kurs.pracownikfirma.model.Employee;

import static org.junit.Assert.*;

public class EmployeeCompanyServiceTest {

    private EmployeeCompanyService service;
    private Company company;
    private Employee employee;
    private Employee employee2;

    @Before
    public void init() {
        service = new EmployeeCompanyService();
        company = new Company("SuperFirma");
        employee = new Employee("Jan", "Kowalski", 5000.00);
        employee2 = new Employee("Anna", "Nowak", 6000.00);
        company.addEmpolyee(employee);
        company.addEmpolyee(employee2);
    }

    @Test
    public void shouldReturnTrueIfSalaryIsCorrect() {
        assertEquals(2, company.getEmployees().size());
        assertEquals(11000.00, service.paySalary(company), 0.01);
    }

    @Test
    public void shouldReturnTrueIfEmployeesNameIsCorrect() {
        assertEquals("Jan", employee.getName());
    }

    @Test
    public void shouldReturnTrueIfLenghtCompanysNameIsCorrect() {
        assertEquals(10, company.getName().length());
    }

    @Test
    public void shouldReturnTrueIfSalaryOfOneEmployeeIsCorrect() {
        assertEquals(5000.00, employee.getSalary(), 0.01);
    }
}






