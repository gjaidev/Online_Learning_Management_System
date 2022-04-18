package com.collegeProject;

import com.collegeProject.controller.OnlineLearningController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.collegeProject.controller"})
public class ConfigClass {

    @Bean(name = "controller")
    public OnlineLearningController getController(){
        OnlineLearningController controller = new OnlineLearningController();
        return controller;
    }

}
