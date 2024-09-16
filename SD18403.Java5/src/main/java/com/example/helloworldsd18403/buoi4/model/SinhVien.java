package com.example.helloworldsd18403.buoi4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
    private String id;
    private String ten;
    private int tuoi;
    private String diaChi;
    private boolean gioiTinh;
}
