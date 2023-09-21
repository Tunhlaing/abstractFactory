fun main() {
    val luxuryCar : MakeCar = CommercialVehicle()
    val carBrand = luxuryCar.carBrandName()
    val carType = luxuryCar.carTypeName()

    carBrand.brandName()
    carType.type()

}

interface CarBrand{
    fun brandName()
}
interface CarType{
    fun type()
}
class Honda : CarBrand{
    override fun brandName() {
        println("car brand is honda")
    }
}
class Tata : CarBrand{
    override fun brandName() {
        println("car brand is tata")
    }
}
class Ford : CarBrand{
    override fun brandName() {
        println("car brand is ford")
    }
}
class Suv : CarType{
    override fun type() {
        println("car type is suv")
    }

}
class SightSeeing : CarType{
    override fun type() {
        println("car type is SightSeeing")
    }

}
class Truck : CarType{
    override fun type() {
        println("car type is Truck")
    }

}

//*******************

interface MakeCar{
    fun carBrandName(): CarBrand
    fun carTypeName(): CarType
}


class LuxuryCar : MakeCar{
    override fun carBrandName(): CarBrand {
        return Honda()
    }

    override fun carTypeName(): CarType {
        return Suv()
    }

}

class CommercialVehicle : MakeCar {
    override fun carBrandName(): CarBrand {
        return Ford()
    }

    override fun carTypeName(): CarType {
        return Truck()
    }

}
class PassengerCar : MakeCar{
    override fun carBrandName(): CarBrand {
        return Tata()
    }

    override fun carTypeName(): CarType {
        return SightSeeing()
    }

}






