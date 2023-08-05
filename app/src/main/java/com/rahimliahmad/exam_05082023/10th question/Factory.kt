package com.rahimliahmad.exam_05082023.`10th question`

enum class FactoryType{
    COTTAGE,MANISON,VILLA
}
interface AbstractFactory {
    fun builHouse()
}
class FactoryProvider(){
    fun getFactory(factory:FactoryType):AbstractFactory{
        return when(factory) {
            FactoryType.VILLA -> VillaFactory()
            FactoryType.COTTAGE -> CottageFactory()
            FactoryType.MANISON -> ManisonFactory()
        }
    }
}
class VillaFactory():AbstractFactory{
    override fun builHouse() {
        TODO("Not yet implemented")
    }
}
class ManisonFactory():AbstractFactory{
    override fun builHouse() {
        TODO("Not yet implemented")
    }
}
class CottageFactory():AbstractFactory{
    override fun builHouse() {
        TODO("Not yet implemented")
    }
}
fun main(){
    var abstractFactoryProvider=FactoryProvider().getFactory(FactoryType.VILLA).builHouse()
}