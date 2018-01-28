package br.com.leandro.integrationteststudy.models

class Course(
        var id: String,
        var name: String,
        var description: String,
        var steps: List<String>

) {
    constructor(): this("","", "", ArrayList())
}