package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    return this?.city.equals(city)
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    return this?.customers.all { it?.city.equals(city) }
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    return this?.customers?.find { it?.city?.name?.equals(city.name) }?.isFrom(city)?:false
}

fun Shop.countCustomersFrom(city: City): Int {
    return this?.customers?.count({it?.city?.equals(city)})
}

fun Shop.findAnyCustomerFrom(city: City): Customer? {
    // Return a customer who lives in the given city, or null if there is none
    return this?.customers.find{ it?.city?.name?.equals(city.name) }?:null
}
