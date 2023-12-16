package com.centum.codeWithSharath.repository;

import com.centum.codeWithSharath.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {


    static Course findByCourseId(Long courseId) {
        return null;
    }

    List<Course> findByFeeLessThan(double price);

    
}
