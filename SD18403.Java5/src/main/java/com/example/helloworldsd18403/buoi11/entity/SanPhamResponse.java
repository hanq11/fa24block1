package com.example.helloworldsd18403.buoi11.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamResponse {
    private Integer id;

    private String ten;

    private Float gia;

    private LocalDate ngayTao;

    private Integer idDanhMuc;

    private String tenDanhMuc;
}
