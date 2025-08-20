package com.codingshuttle.KrishnaSaxena.tutorial.configuration;

import com.codingshuttle.KrishnaSaxena.tutorial.DB;
import com.codingshuttle.KrishnaSaxena.tutorial.DevDB;
import com.codingshuttle.KrishnaSaxena.tutorial.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework. context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue="development")

    public DB getDevDBBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue="Production")

    public DB getProdBDBean(){
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMApper(){
        return new ModelMapper();
    }
}
