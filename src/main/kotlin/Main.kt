import kotlin.random.Random
fun main(args: Array<String>) {
//Задание 4
      val random1 = Random
val matesha = random1.nextInt(1, 10)
val biologia = random1.nextInt(1, 10)
val russkij = random1.nextInt(1, 10)
if (matesha < 8 )
{
    println("Matesha is bad")
}
else {
    println("Matesha is good")
}
    if (biologia < 8 )
        println("Biologia is bad")
    else
        println("Biologia is good")
    if (russkij<8)
        println("Russkij is bad")
    else
        println("Russkij is good")

    //Задание 5

    val random = Random
    val mis1 = random.nextInt(0, 2)
    val mis2 = random.nextInt(0, 2)
    val mis3 = random.nextInt(0, 2)
    if (mis1 ==1)
    {
        println("Hit")
    }
    else {
        println("Miss")
    }
    if (mis2 == 1 )
        println("Hit")
    else
        println("Miss")
    if (mis3== 1)
        println("Hit")
    else
        println("Miss")
    var result = mis1 + mis2 + mis3
    println("Общее количество попаданий " + result)

    //Задание 6

    var population = 10.0 // начальная численность населения
    var birthRate = 14.0 // рождаемость
    var deathRate = 8.0 // смертность
    for (year in 1..10) {
        birthRate -= 1 // каждый год рождается на 1 человек меньше
        deathRate -= 1 // каждый год умирает на 1 человек меньше

        if (birthRate < 7) birthRate = 7.0 // рождаемость не может быть меньше 7 человек на 1000 человек
        if (deathRate < 6) deathRate = 6.0 // смертность не может быть меньше 6 человек на 1000 человек

        population += (population * birthRate / 1000) - (population * deathRate / 1000)
    }

    println("Численность населения через 10 лет: $population миллионов")


    // Задание 7

    print("Введите сумму вклада: ")
    val amount1: Double = readLine()!!.toDouble()
    print("Введите количество месяцев: ")
    val months1: Int = readLine()!!.toInt()

    var totalAmount1 = amount1
    for (i in 1..months1) {
        totalAmount1 += totalAmount1 * 0.07
    }
    println("Итоговая сумма вклада через $months1 месяцев: $totalAmount1")

    //Задание 8

    print("Введите сумму вклада: ")
    val amount: Double = readLine()!!.toDouble()
            print("Введите количество месяцев: ")
    val months: Int = readLine()!!.toInt()

    var totalAmount = amount
    var i = 1
    while (i <= months) {
        totalAmount += totalAmount * 0.07
        i++
    }

    println("Итоговая сумма вклада через $months месяцев: $totalAmount")

    //Задание 9
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j}\t")
        }
        println()
    }
}


