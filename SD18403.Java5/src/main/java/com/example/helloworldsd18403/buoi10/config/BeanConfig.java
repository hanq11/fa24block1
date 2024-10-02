package com.example.helloworldsd18403.buoi10.config;

import com.example.helloworldsd18403.buoi10.model.CongTyKhac;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean("1")
    public CongTyKhac congTyKhac() {
        return new CongTyKhac("LLALALALA");
    }

    @Bean("2")
    public CongTyKhac congTyKhac1() {
        return new CongTyKhac("LELELELELE");
    }
}
