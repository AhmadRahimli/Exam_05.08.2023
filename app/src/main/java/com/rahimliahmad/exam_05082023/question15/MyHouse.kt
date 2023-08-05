package com.rahimliahmad.exam_05082023.question15

class MyHouse(var room:Int=0,var color:String,roofType:String) {
    class Builder (){
        var room=0
        var color=""
        var roofType=""
        fun setRooms(room: Int):Builder{
            this.room=room
            return this
        }
        fun setColor(color: String):Builder{
            this.color=color
            return this
        }
        fun setRooftype(roofType: String):Builder{
            this.roofType=roofType
            return this
        }
        fun build(): MyHouse{
            return  MyHouse(room, color, roofType)
        }

    }
}
fun main(){
    var myHouse=MyHouse.Builder().setRooftype("forChild").setColor("Red").setRooms(3).build()
}