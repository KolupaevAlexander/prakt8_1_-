class Cinemas(name:String, session:String, price:Float, hall:Int, visitors: Int) {
    private val name=name
    private val session=session
    private val price=price
    private val hall=hall
    private val visitors=visitors

    fun GetInfo()
    {
        println("Название кинотеатра: $name\nСеанс: $session\nЦена: $price\nЗал: $hall\nКол-во зрителей: $visitors")
    }

    fun GetKindOfHall():String
    {
        return if (visitors>=100)  "Большой зал"
        else "Малый зал"
    }

    fun IsThatFilm(filmName:String):Boolean
    {
        return name==filmName
    }
}