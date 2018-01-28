package br.com.leandro.integrationteststudy.controllers

import br.com.leandro.integrationteststudy.services.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {
    @Autowired
    lateinit var service: StudentService

    @GetMapping("/students/{studentId}/courses")
    fun retrieveCoursesForStudent(@PathVariable studentId: String) = service.retrieveCourses(studentId)

    @GetMapping("/students/{studentId}/courses/{courseId}")
    fun retrieveDetailsForCourse(@PathVariable studentId: String, @PathVariable courseId: String) = service.retrieveCourse(studentId, courseId)
}