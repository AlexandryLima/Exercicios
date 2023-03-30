fun main(){
    println("Descreva qualquer valor: ")
    var number: Double= readln().toDouble()

    if (number>0){
        println("Este número é positivo.")

    }else if(number<0){
        println("Este número é negativo.")
    }else{
        println("Este número é Zero (Indeterminado)")
    }

}