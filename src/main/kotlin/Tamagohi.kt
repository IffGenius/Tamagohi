open class Tamagohi(){
    open val petSpecies ="pet"
    var name=""
    var age = 0.0
    var weight = 0.5
    var eatLevel = 3
    var toiletLevel = 3
    var sleepLevel = 3

    fun create(){
        println("Enter name")
        name= readln()
        println("Enter age")
        age = readln().toDouble()
        println("Congratulation now you have new $petSpecies:\n" +
                "${name} $age")

    }
    fun paint (){
        println("\t\t\t$name ${age.toInt()}\n" +
                "eat $eatLevel\n"+
                "weight $weight\n"+
                "toilet $toiletLevel\n"+
                "sleep $sleepLevel")
        

        }
    fun eat(){
        eatLevel++
        weight+=0.2
        toiletLevel--
        sleepLevel--
    }
    fun sleep(){
        sleepLevel=5
        age+=0.1
        toiletLevel-=2
        eatLevel-=2
    }
    fun goToilet(){
        weight-=0.2
        toiletLevel=5
    }
    }
