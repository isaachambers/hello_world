fun main(args: Array<String>) {

    var h1 = Header("H1")
    var h2 = Header("H2")

    //Usage of infix function
    var h3 = h1 plus h2
    println(h3.name)
}

class Header(var name: String) {}

infix fun Header.plus(header: Header): Header {
    return Header(this.name + header.name)
}