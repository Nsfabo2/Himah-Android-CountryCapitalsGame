import kotlin.random.Random

fun main(){
/*
Bonus:
Can you find a way to always ask 3 unique questions? (Never repeating the same country in a single game)
*/

    //Create a Country class with two attributes (name, capital)
     class Country(val name: String, val capital: String) {
        //Create a function that prints the country and its capital
         fun Diplay_Content(){
             println("$name 's capital is $capital")
         }
    }
    //Create ten countries and place them inside of a list
    val Countries_List = listOf(
        Country("Saudi Arabia","riyadh"),
        Country("Egypt","cairo"),
        Country("Morocco","rabat"),
        Country("Spain","madrid"),
        Country("Italy","rome"),
        Country("Greece","athens"),
        Country("Lebanon","beirut"),
        Country("korea","seoul"),
        Country("Japan","tokyo"),
        Country("India","new Delhi")
    )

    //Randomly select three countries and quiz the user to see if they know the capitals
    println("Ready to play? Let's see if you know the capitals of these countries!")
    var i = 0
    var score = 0
    while (i<3) {
        val Random_Counties = Countries_List[Random.nextInt(Countries_List.size)]
        println("What's the capital of ${Random_Counties.name}?")
        var User_Answer = readLine()!!.toString()
        //If the user guesses incorrectly call the capital function to show the answer
        if(User_Answer.toLowerCase() == Random_Counties.capital){
            println("Cool! you've got it right")
            score++

        }else {
            println("Oh no! maybe next time?")
            Random_Counties.Diplay_Content()
        }
        //Start a new game if they want to play again
        if(i >= 3){
            print("Do you want to play again? : >> (Y/N) ")
            var User_Try = readLine()!!.toString()
            if (User_Try == "y" || User_Try == "Y") {
                i=0
                println("Enjoy!")
                continue
            } else if (User_Try == "N" || User_Try == "n") {
                println("bye!")
                break
            } else {
                println("Only enter Y or N ! ")
                break
            }
        }
        i++
        }
    //Give the user a final score out of 3 at the end of the game
    println("Your Score is $score out of $i")
    //score = 0

    }
