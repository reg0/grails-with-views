package pl.reg0.tutorials.grailsviews

class Machine {

    Customer customer
    String name
    String description
    Integer yearManufatured

    static constraints = {
    }

    static mapping = {
        description type: 'text'
    }
}
