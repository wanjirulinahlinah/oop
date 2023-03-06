fun main() {
    var linah=Human("linah",20,59)
    linah.eat(10)
    linah.speak("I am 10years old")
    linah.increament(1)
    var statement=data("lianh","wanjiru"0,0,2259)
    println(statement.firstName)

}

   class Human(var name:String,var age:Int,var Weight:Int){

       fun eat(foodWeight:Int){
           var add=foodWeight + Weight
           println("I am eating ${foodWeight}kgs of food")
       }
       fun speak(speech:String){
           println(speech)
       }
       fun increament(birthday:Int){
           var addition = age + birthday
           println(addition)
       }
       //2.create a data class user with these fields:firstName,lastName,email
       //phoneNumber.password,create an instance of user and print out any 2
       //attributes(3points)

   }
class data(var firstName:String,var lastName:String,var email:Int,var phonenumber:Int,var password:Int){

}
}


