package br.com.leandro.integrationteststudy.models

class Student(
        var id: String,
        var name: String,
        var courseId: String
) {
    constructor(): this("","","")
}