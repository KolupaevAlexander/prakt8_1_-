class Dogs (name: String, breed: String, height:Double, color:String, weight:Double, temper:String){
    private val name:String = name
    private val breed:String = breed
    private val height:Double = height
    private val color:String = color
    private val weight:Double = weight
    private val temper:String = temper

    fun GetInfo()
    {
        println("Кличка: $name\nПорода: $breed\nРост: $height\nОкрас: $color\nВес: $weight\nТемперамент: $temper")
    }

    fun IsThatDog(probablyName: String):Boolean
    {
        return name==probablyName
    }

    fun IsPlayful():Boolean
    {
        return temper=="Игривая"
    }


}
