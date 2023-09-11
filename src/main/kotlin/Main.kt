fun main(args: Array<String>)
{
    val age1 = 42.0
    val age2 = 21.0
    /* создание 2ух констант без явного обьявления типа,
    проверка являются ли эти константы типа Int,
    ответ - являются*/

    val avg1 = (age1+age2)/2
    println(avg1)
    /* в константе "avg1" находим среднее арифметическое "age1" и "age2".
    так как мы явно не обЬявили тип "avg1" он автоматически стал Int и дробная часть отбросилась
   в ответе мы получаем 31 вместо 31,5 */

    /* мы исправили ошибку и добавили дробную часть в обьявлении "age1" и "age2"
    теперь в ответе мы получаем 31,5 т.к. теперь "avg1" будет определяться как Double */

    val firstName:String = "Виктория"
    val lastName:String = "Троцкова"
    //создание строковых констант содержащих наше имя и фамилию

    val fullName:String = "$firstName $lastName"
    println(fullName)
    // получение полного имени сложением строк

    val myDetails: String = "Привет, меня зовут " + fullName
    println(myDetails)

    val data:Triple <Int,Int,Int> = Triple(9,11,2023)
    // создание константы типа Triple, содержащей дату

    val month = data.first
    val day = data.second
    val year = data.third
    // извлекаем значения из "data" в переменные "month", "day" и "year"

    //var data2 = Triple(month, _, year)
    // не понимаю чего от меня хотят (;^;)

    val data3 = Pair(12,year)
    // тоже не совсем поняла, но вроде так
}