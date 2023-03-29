fun main() {
    println("Olá, digite o seu nome: ")
    var name: String = readln()

    println("Agora digite a sua idade em anos :")
    var idade: Int = readln().toInt()

    println("Olá $name, seja bem-vindo!")
    println("Você possui $idade anos de idade.")

    // este programa recebe o nome e a idade do usuario e logo após exibe uma mensagem
    // de boas vindas utilizando essas informações
}