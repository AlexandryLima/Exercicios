fun main(){
    println("Digite a nota da P1: ")
    var p1: Double= readln().toDouble()

    println("Digite a nota da P2: ")
    var p2: Double= readln().toDouble()

    var result: Double = (p1+p2)/2.toDouble()

    if (result<7) {
        println("Sua média foi: $result.")
        println("Reprovado")
    } else{
        println("Sua média foi: $result.")
        println("Aprovado")
    }


}