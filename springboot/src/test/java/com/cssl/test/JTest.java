package com.cssl.test;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class JTest {

	@Autowired
    StringEncryptor encryptor;
 
    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql:///mybatis1?serverTimezone=GMT");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(url);
        System.out.println(name);
        System.out.println(password);
    }

}
