package com.centum.codeWithSharath.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="COURSE_TABLE")
public class Course {
    @Id
    //@GeneratedValue
    public Long id;
    public String title;
    public String abbreviation;
    public int modules;
    public Double fee;
    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Student> students;
}
