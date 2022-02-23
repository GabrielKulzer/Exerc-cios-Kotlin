fun main() {
    //atividade3()
    //atividade1()
    atividade2()
    //println(atividade4())
}

fun atividade3(): Unit {
    var pontos = 0
    var resposta: String? = null
    println("Responda apenas com sim ou não:")
    println("Telefonou para a vítima?")
    resposta = readLine()
    if (resposta == "sim" || resposta == "s") {
        pontos++
    }
    println("Esteve no local do crime?")
    resposta = readLine()
    if (resposta == "sim" || resposta == "s") {
        pontos++
    }
    println("Mora perto da vítima?")
    resposta = readLine()
    if (resposta == "sim" || resposta == "s") {
        pontos++
    }
    println("Devia para a vítima?")
    resposta = readLine()
    if (resposta == "sim" || resposta == "s") {
        pontos++
    }
    println("Já trabalhou com a vítima?")
    resposta = readLine()
    if (resposta == "sim" || resposta == "s") {
        pontos++
    }
    if (pontos == 2) {
        return println("Suspeito")
    } else if (pontos == 3 || pontos == 4) {
        return println("Cúmplice")
    } else if (pontos == 5) {
        return println("Assassino")
    } else {
        println("Inocente")
    }

}

fun atividade1(): Unit {
    var lado1: Int? = null
    var lado2: Int? = null
    var lado3: Int? = null
    println("Digite o tamanho do primeiro lado:")
    lado1 = readLine()!!.toInt()
    println("Digite o tamanho do segundo lado:")
    lado2 = readLine()!!.toInt()
    println("Digite o tamanho do terceiro lado:")
    lado3 = readLine()!!.toInt()
    if (lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1) {
        return println("Não é um triângulo")
    } else if (lado1 == lado2 && lado2 == lado3) {
        return println("Triângulo equilátero")
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        return println("Triângulo isósceles")
    } else {
        return println("Triângulo escaleno")
    }

}

fun atividade4():Unit {
    var litros: Float? = null
    var combustivel: String? = null
    var preco:Float = 0f
    println("a- Alcool\ng- Gasolina")
    combustivel = readLine()!!.toString()
    println("Litros vendidos:")
    litros = readLine()!!.toFloat()
    if (combustivel == "a" || combustivel== "A"){
         preco = litros * 3.5f
        if (litros <=20){
            preco -= 3.5f * (litros * 3 / 100)
        }else{
            preco -= 3.5f * (litros * 5 / 100)
        }
    }else if(combustivel == "G" || combustivel == "g"){
        preco = litros * 5.9f
        if (litros <=20){
            preco -= 5.9f * (litros * 4 /100)
        }else{
            preco -= 5.9f * (litros * 6 /100)
        }

    }
    return println("Valor total com desconto: $preco")
}

fun atividade2(): Unit {
    var ano: Int? = null
    println("Digite um ano:")
    ano = readLine()!!.toInt()
    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
        println("Este ano é bissexto.")
    } else {
        println("Este ano não é bissexto.")
    }
}