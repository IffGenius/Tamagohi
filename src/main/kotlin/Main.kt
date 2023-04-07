fun main() {
    var input=0
    val pet: Tamagohi = Tamagohi()
    val muhtar: Dog = Dog()


    muhtar.create()

for(i in 0..100){
    muhtar.paint()
    println("Enter number of action(1 - eat,2 - sleep" +
            "3 - go toilet,4 - quit)")

    input = readln().toInt()
    when(input){
        1->muhtar.eat()
        2->muhtar.sleep()
        3->muhtar.goToilet()
        4-> break
        else->{
            println("wrong input, try more")
        }
    }
}
}