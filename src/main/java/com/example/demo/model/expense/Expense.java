package com.example.demo.model.expense;

import com.example.demo.model.category.Category;
import com.example.demo.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant date;
    private String description;
    private String location;
    @ManyToOne
    private Category category;
    @ManyToOne
    @JsonIgnore
    private User user;
}
