fun main()
{
    val dog = Dogs( "Жучка", "Овчарка", 50.0, "Черная", 10.0, "Спокойная")
    val film = Cinemas("Космос", "Летят журавли", 300f, 1, 150)

    FirstClass(dog)
    SecondClass(film)
}

fun FirstClass(dog: Dogs)
{
    dog.GetInfo()
    println( dog.IsThatDog("Жучка"))
    println( dog.IsPlayful())
}

fun SecondClass(film:Cinemas)
{
    film.GetInfo()
    println(film.IsThatFilm("Виридиана"))
    println(film.GetKindOfHall())
}