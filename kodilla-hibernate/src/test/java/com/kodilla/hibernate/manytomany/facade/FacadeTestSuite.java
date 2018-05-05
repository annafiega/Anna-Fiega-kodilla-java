package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.Facade;
import com.kodilla.hibernate.manytomany.facade.SearchProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test

    public void testSearchCompanyByName(){

        final String prefix="Sof";
        List<Company> companyList=new ArrayList<>();
        companyList.add(new Company("Software Machine"));
        companyList.add(new Company("Data Maesters"));
        companyList.add( new Company("Grey Matter"));
        companyList.add(new Company("Sofy.pl"));
        companyList.add(new Company("Softshell"));

        try{
            List <Company>resultList=facade.searchCompanyByName(prefix);
        }catch (SearchProcessingException e) {
        }
    }

    @Test

    public void testSearchEmployeeByName(){
        final String prefix="Smi";
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee ("John", "Smith"));
        employeeList.add(new Employee("Stephanie", "Clarckson"));
        employeeList.add(new Employee("Linda", "Kovalsky"));
        employeeList.add(new Employee("Amanda", "Kovalsky"));

        try{
            List <Employee>resultList=facade.searchEmployeeByName(prefix);
        }catch (SearchProcessingException e) {
        }
    }
}
