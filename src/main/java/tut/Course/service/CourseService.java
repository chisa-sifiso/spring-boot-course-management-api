package tut.Course.service;

import org.springframework.beans.factory.annotation.Autowired;
import tut.Course.model.Course;
import tut.Course.repository.CourseRepository;

import java.util.List;

public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
