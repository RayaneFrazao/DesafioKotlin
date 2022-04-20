fun main() {
    lerAluno()
}

fun lerAluno(){
    println("Escreva o nome do aluno:")
    var nomeAluno = readln()

    lerNotas(nomeAluno)
}

fun lerNotas(nomeAluno: String){
    var notasDoAluno = DoubleArray(4)

    for(i: Int in notasDoAluno.indices){
        println("Digite a ${i+1}ª nota de $nomeAluno:")
        var notaDigitada = readln().toDouble()

        if(notaDigitada in 0.0..10.0){
            notasDoAluno[i] = notaDigitada
        }
        else{
            println("Nota inválida.Por favor, comece novamente.A nota deve ser de 0 a 10")
            lerNotas(nomeAluno)
        }
    }

    calcularMedia(nomeAluno, notasDoAluno)
}

fun calcularMedia(nomeAluno: String, notasDoAluno: DoubleArray) {

    var somarNotas = 0.0

    for(i: Int in notasDoAluno.indices){
        somarNotas += notasDoAluno[i]
    }

    var mediaAluno = somarNotas/4.0

    println("Aluno: $nomeAluno")
    println("Média: $mediaAluno")

    menuNovoCalculo()
}

fun menuNovoCalculo(){
    println("Deseja calcular a média de notas de um novo aluno?")
    println("[1] SIM")
    println("[2] NÃO")
    var OpçãoDigitada = readln().toInt()

    when(OpçãoDigitada){
        1 -> main()
        2 ->  (0)
        else -> menuNovoCalculo()
    }
}








