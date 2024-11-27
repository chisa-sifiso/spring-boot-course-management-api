package tut.Course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.Course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
