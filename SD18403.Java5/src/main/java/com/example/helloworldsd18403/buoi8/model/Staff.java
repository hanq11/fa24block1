package com.example.helloworldsd18403.buoi8.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @NotNull(message = "Vui long nhap id")
    private Integer id;

    @NotBlank(message = "Vui long nhap ten")
    private String name;

    @NotNull(message = "Vui long nhap tuoi")
    @Min(value = 17, message = "Tuoi lon hon 17")
    private Integer age;

    @NotBlank(message = "Vui long chon vi tri")
    private String position;

    @NotEmpty(message = "Vui long nhap so thich")
    private String[] hobbies;

    @NotNull(message = "Vui long nhap quoc gia")
    private Country country;
}
