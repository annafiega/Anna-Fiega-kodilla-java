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
public class Facade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> searchCompanyByName(String prefix) throws SearchProcessingException {
        List<Company> result = null;
        if (prefix == null) {
            LOGGER.error(SearchProcessingException.ERR_COMPANY_NAME_NOT_PROVIDED);
        } else {
            LOGGER.info("Searching for the company");
            try {
                result = companyDao.searchCompaniesNameByPrefix(prefix);
                if (result.size() == 0) {
                    LOGGER.info(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
                    throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
                }else{
                    LOGGER.info(result.size()+" company/companies has been found");
                    return result;
                }
            } catch (SearchProcessingException e) {
               LOGGER.error(SearchProcessingException.ERR_UNEXPECTED);
            }
        }
        return result;
    }

    public List<Employee> searchEmployeeByName(String prefix) throws SearchProcessingException {
        List<Employee> result = null;
        if (prefix == null) {
            LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NAME_NOT_PROVIDED);
        } else {
            LOGGER.info("Searching for the employee");
            try {
                result = employeeDao.searchEmployeeNameByPrefix(prefix);
                if (result.size() == 0) {
                    LOGGER.info(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
                    throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
                }else{
                    LOGGER.info(result.size()+" employee/employees has been found");
                    return result;
                }
            } catch (SearchProcessingException e) {
                LOGGER.error(SearchProcessingException.ERR_UNEXPECTED);
            }
        }
        return result;
    }
}
