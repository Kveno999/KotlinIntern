package com.example.intern
import java.util.*
fun main(args: Array<String>) {

    ///task 1
    println("Task I")
    val scanner = Scanner(System.`in`)
    println("Enter String : ")
    val string: String = scanner.nextLine()
    println(isPalindrome(string))

    ///task 2
    println("Task II")
    println(minSplit(120))

    ///task 3
    println("Task III")
    val arrayOfNumbers = arrayOf(1, 2, 3, 4, 6)
    println(notContains(arrayOfNumbers))

    ///task 4
    println("Task IV")
    println(isProperly("()()"))

    ///task 5
    println("Task V")
    println(countSteps(6))


}

fun isPalindrome(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)
    val reverseStr = sb.reverse().toString()
    return inputStr.equals(reverseStr, ignoreCase = true)
}

fun minSplit(coins: Int): MutableList<Int>{
    var coinsAmount = coins
    val coin = mutableListOf<Int>(1, 5, 10, 20, 50)
    var lengthOfCoin = coin.size - 1
    val givenCoins = mutableListOf<Int>()
    while(lengthOfCoin > 0){
        while (coinsAmount >= coin[lengthOfCoin]){
            coinsAmount -= coin[lengthOfCoin]
            givenCoins.add(coin[lengthOfCoin])
        }
        lengthOfCoin -= 1
    }
    return givenCoins
}

fun notContains(array: Array<Int>): Int {
    var guess  = 1
    var answer = 0
    for(number in array){
        if(number == guess){
            guess += 1
        }else{
            answer = guess
        }
    }
    return  answer
}

fun isProperly(string: String): Boolean{
    var one = 0
    var two = 0
    for(char in string){
        if(char in "("){
            one +=1
        }else if (char in ")"){
            two +=1
        }
    }
    return one == two
}

fun countVariants(numberOfFloors: Int): Int{
    if(numberOfFloors <= 1){
        return numberOfFloors
    }
    return countVariants(numberOfFloors - 1) + countVariants(numberOfFloors - 2)
}
fun countSteps(step : Int): Int{
    return countVariants(step + 1)
}

