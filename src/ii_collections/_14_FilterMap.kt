package ii_collections

import java.util.*

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    return this?.customers?.mapTo(HashSet<City>(),{it.city})
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    return this?.customers?.filter { it?.city.equals(city) }
}


