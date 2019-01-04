package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;import java.util.List;

import static org.junit.Assert.assertEquals;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;


    @Test
    public void testSearchCompanyByName(){

        //Given
        final String prefix="me";

        Company meble = new Company("Meble");
        Company metalurgia= new Company("Metalurgia");

        //when
        companyDao.save(meble);
        companyDao.save(metalurgia);
        List <Company>resultList=new ArrayList<>();

        try{
            resultList=facade.searchCompanyByName(prefix);
        }catch (SearchProcessingException e) {
        }

        //then
        assertEquals(2, resultList.size());
    }

    @Test
    public void testSearchEmployeeByName(){
        //given
        final String prefix="Owa";

        Employee nowak = new Employee("Adam","Nowak");
        Employee kowalski = new Employee("Adam","Kowalski");

        //when
        employeeDao.save(nowak);
        employeeDao.save(kowalski);
        List <Employee>resultList=new ArrayList<>();

        try{
           resultList=facade.searchEmployeeByName(prefix);
        }catch (SearchProcessingException e) {
        }

        //then
        assertEquals(2, resultList.size());
    }


}
