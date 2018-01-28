package br.com.leandro.integrationteststudy.services

import br.com.leandro.integrationteststudy.models.Course
import br.com.leandro.integrationteststudy.models.Student
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService() {
    fun retrieveAllStudents(): List<Student> {
        return ArrayList()
    }

    fun retrieveStudent(studentId: String): Student {
        return Student()
    }

    fun retrieveCourses(studentId: String): List<Course> {
        return ArrayList()
    }

    fun retrieveCourse(studentId: String, courseId: String): Course {
        return Course(
            "Course1",
            "Spring",
            "10 Steps",
                Arrays.asList("Learn Maven",
                        "Import Project",
                        "First Example",
                        "Second Example")
        )
    }

    fun addCourse(studentId: String, course: String) {

    }


}