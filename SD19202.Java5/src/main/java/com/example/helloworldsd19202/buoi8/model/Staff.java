package com.example.helloworldsd19202.buoi8.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private Integer id;
    private String name;
    private Integer age;
    private String position;
    private String[] hobbies;
    private Country country;
}
