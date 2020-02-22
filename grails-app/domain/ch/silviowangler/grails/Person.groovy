package ch.silviowangler.grails

class Person {
    String name

    static constraints = {
        name nullable: false
    }
}
