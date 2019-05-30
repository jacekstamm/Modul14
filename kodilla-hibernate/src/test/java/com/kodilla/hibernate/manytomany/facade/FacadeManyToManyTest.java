package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeManyToManyTest {

    @Autowired
    FacadeManyToMany facadeManyToMany;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testShouldGetListOfCompaniesFromPartNameGiven() {
        //Given
        Company apple = new Company("Apple");
        Company samsung = new Company("Samsung");
        Company xiaomi = new Company("Xiaomi");
        Company amazon = new Company("Amazon");

        companyDao.save(apple);
        companyDao.save(samsung);
        companyDao.save(xiaomi);
        companyDao.save(amazon);

        //When
        List<Company> companyListResult = facadeManyToMany.getCompaniesFromPartName("am");

        //Then
        Assert.assertEquals(2, companyListResult.size());

        //CleanUp
        companyDao.delete(apple);
        companyDao.delete(samsung);
        companyDao.delete(xiaomi);
        companyDao.delete(amazon);
    }

    @Test
    public void testShouldGetListOfEmployeesFromPartNameGiven() {
        //Given
        Employee jacekS = new Employee("Jacek", "Stamm");
        Employee adamG = new Employee("Adam", "Gwóźdź");
        Employee dominikaA = new Employee("Dominika", "Adamska");
        Employee monikaC = new Employee("Monika", "Ciesielska");

        employeeDao.save(jacekS);
        employeeDao.save(adamG);
        employeeDao.save(dominikaA);
        employeeDao.save(monikaC);

        //When
        List<Employee> employeeListResult = facadeManyToMany.getEmployeesFromPartName("ad");

        //Then
        Assert.assertEquals(2, employeeListResult.size());

        //CleanUp
        employeeDao.delete(jacekS);
        employeeDao.delete(adamG);
        employeeDao.delete(dominikaA);
        employeeDao.delete(monikaC);
    }
}
