package collections

fun main(args: Array<String>) {

    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    val namesToAges2 = mapOf(
            "Peter" to 24,
            "Roger" to 42)

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countyToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 300_000_000
    )

    countyToInhabitants.put("Australia", 23_000_000)
    countyToInhabitants.putIfAbsent("USA", 320_000_000)

    println(countyToInhabitants)

    println(countyToInhabitants.contains("Australia"))
    println(countyToInhabitants.containsKey("France"))
    println(countyToInhabitants.containsValue(30_000_000))

    println(countyToInhabitants.get("Germany"))
    println(countyToInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }
}