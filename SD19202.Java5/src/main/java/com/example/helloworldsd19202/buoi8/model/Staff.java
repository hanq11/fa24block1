package com.example.helloworldsd19202.buoi8.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @NotNull(message = "Vui long dien ID")
    private Integer id;

    @NotBlank(message = "Vui long nhap ten")
    private String name;

    @NotNull(message = "Vui long nhap tuoi")
    private Integer age;

    @NotBlank(message = "Vui long nhap vi tri")
    private String position;

    @NotEmpty(message = "Vui long nhap so thich")
    private String[] hobbies;

    @NotNull(message = "Vui long nhap quoc gia")
    private Country country;
}
