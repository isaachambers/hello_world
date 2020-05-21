fun main(args: Array<String>) {

    var h1 = User("Mark")
    var h2 = User("James")

    //Using overloaded operator
    var h3 = h1 + h2
    println(h3.name)
}

class User(var name: String) {}

//Operator overloading
infix operator fun User.plus(user: User): User {
    return User(this.name + " " + user.name)
}