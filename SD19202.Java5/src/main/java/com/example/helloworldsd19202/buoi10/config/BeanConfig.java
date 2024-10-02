package com.example.helloworldsd19202.buoi10.config;

import com.example.helloworldsd19202.buoi10.model.CongTyKhac;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean("1")
    public CongTyKhac getCongTyKhac() {
        return new CongTyKhac("HEEHE");
    }

    @Bean("2")
    public CongTyKhac getCongTyKhac1() {
        return new CongTyKhac("HOHOHO");
    }
}
