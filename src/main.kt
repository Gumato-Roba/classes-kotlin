fun main(){
    var jeep = Car("Leaf","Nissan","KDE 454P",0)
    println(jeep.model)
    println(jeep.make)
    jeep.start("grrrrrr")

   jeep.accelerate(80)
    println(jeep.speed)

    jeep.decelerate(40)
    println(jeep.speed)

    jeep.hoot()

    jeep.start("booooooom")

 var benz = Car("mercendez Benz","audi","KCC 560D", 0)
    benz.start("piiipiii")

    benz.accelerate(50)
    println(benz.speed)

    benz.decelerate(30)
    println(benz.speed)

    benz.hoot()

    var nancy = Student("Nacy Mwanza",20)
    var peter = Student("Peter Mutsya",34)
    println(nancy.name)

}
class Car(var model: String, var make:String, var registration:String, var speed: Int) {

    fun start(sound: String) {
        println(sound)


    }
fun hoot(){
    println("beep beep")
}
    fun accelerate(acceleration: Int): Int {
        speed += acceleration
        return speed

    }

    fun decelerate(deceleration: Int): Int {
        speed -= deceleration
        return speed

    }



}
data class Student(var name: String, var age: Int)
