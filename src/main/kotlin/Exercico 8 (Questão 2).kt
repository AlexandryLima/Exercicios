fun main(){
    println("Digite qual animal deseja saber se é uma ave, mamífero ou réptil: ")
    var animal: String=readln()

    println("Digite (a) se este animal voa ou (m) se este animal possui glândulas mamárias " +
            "ou digite (r) se este animal de locomove se rastejando ")
    var respost:String= readln()

    when(respost){
        "a" -> println("O $animal é uma Ave !")
        "r" -> println("O $animal é um Réptil !")
        "m" -> println("O $animal é um Mamífero !")
    }
    }

