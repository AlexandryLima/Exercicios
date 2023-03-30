fun main(){
    println("Digite a sua idade em anos: ")
    var idade: Int= readln().toInt()

    if (idade >= 18){
        println("Voê é maior de idade.")
    }else{
        println("Você é menor de idade.")
    }
}