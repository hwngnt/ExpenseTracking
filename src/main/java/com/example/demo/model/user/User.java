package com.example.demo.model.user;

import com.example.demo.model.expense.Expense;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;
    @OneToMany(mappedBy = "user")
    private List<Expense> expenses;
}
