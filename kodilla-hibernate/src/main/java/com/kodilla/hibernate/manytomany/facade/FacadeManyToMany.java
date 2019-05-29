package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class FacadeManyToMany {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeManyToMany.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> getCompaniesFromPartName(final String arg) {
        List<Company> result = companyDao.retrieveCompaniesFromAnyPartName(arg);
        LOGGER.info("Company with given part name - " + arg + " : \n" + result.toString());
        return result;
    }

    public List<Employee> getEmployeesFromPartName(final String arg) {
        List<Employee> result = employeeDao.retrieveEmployeesFromAnyPartOfName(arg);
        LOGGER.info("Employee with given name - " + arg + " : \n" + result);
        return result;
    }

}
