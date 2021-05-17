package com.yavuz.emre.cucumber;

import com.yavuz.emre.OtoServiceApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = OtoServiceApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
