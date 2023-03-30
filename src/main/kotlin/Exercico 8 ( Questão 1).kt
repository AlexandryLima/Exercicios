fun main(){
    println("Digite um número de 1 ao 7 para saber o dia da semana.")
    var number: Int = readln().toInt()

    if(number>0 && number<8)
    when(number){
        1 -> print("Domingo")
        2 -> print("Segunda")
        3 -> print("Terça")
        4 -> print("Quarta")
        5 -> print("Quinta")
        6 -> print("Sexta")
        7 -> print("Sábado")
    }else{
        println("Valor inválido")
    }




}