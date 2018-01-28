package br.com.leandro.integrationteststudy.controllers

import br.com.leandro.integrationteststudy.IntegrationTestStudyApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod


@RunWith(SpringRunner::class)
@SpringBootTest(classes = [IntegrationTestStudyApplication::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentControllerIT {

    @LocalServerPort
    private val port: Int = 0

    val restTemplate = TestRestTemplate()

    val headers = HttpHeaders()

    @Test
    fun testRetrieveStudentCourse() {
        val entity = HttpEntity<String>(null, headers)
        val response = restTemplate.exchange(createURLWithPort("/students/Student1/courses/Course1"), HttpMethod.GET, entity, String::class.java)
        val expected = "{\"id\":\"Course1\",\"name\":\"Spring\",\"description\":\"10 Steps\",\"steps\":[\"Learn Maven\",\"Import Project\",\"First Example\",\"Second Example\"]}"
        JSONAssert.assertEquals(expected, response.body, false)
    }

    private fun createURLWithPort(uri: String): String {
        return "http://localhost:" + port + uri
    }
}