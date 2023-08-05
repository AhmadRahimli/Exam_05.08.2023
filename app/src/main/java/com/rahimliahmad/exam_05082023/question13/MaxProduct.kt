package com.rahimliahmad.exam_05082023.question13

fun main(){
    var arr = intArrayOf(5,6,7,4)
    arr.sort()
    var a=arr.size
    var maxProduct=arr[a-1]*arr[a-2]
    println(maxProduct)
}