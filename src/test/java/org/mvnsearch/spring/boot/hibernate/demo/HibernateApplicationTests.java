package org.mvnsearch.spring.boot.hibernate.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mvnsearch.spring.boot.hibernate.demo.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * hibernate demo application tests
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateDemoApplication.class)
public class HibernateApplicationTests {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Test
    @Transactional
    public void contextLoads() {
        Country country = new Country();
        country.setId(1);
        country.setName("China");
        country.setIsoCode("0086");
        hibernateTemplate.save(country);
        System.out.println(country.getId());
        country = hibernateTemplate.get(Country.class, 1);
        System.out.println(country.getName());
    }

}
