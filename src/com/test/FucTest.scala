package com.test

/**
  * Created by tuze on 2017/8/3.
  */
object FucTest {
  def main(args: Array[String]): Unit = {
//    delayed(time())

//    printStrings("hello","world","scala","python")

    println("返回值:"+addInt())
  }

  def time()={
    println("获取时间,单位为纳秒")
    System.nanoTime
  }

  def delayed(t: =>Long)={
    println("在delayed方法内")
    println("参数:"+t)
    t
  }


  def printStrings(args:String*): Unit ={
    var i:Int=0
    for (arg<- args) {
      println("Arg value["+i+"]="+arg)
      i=i+1
    }
  }

  def addInt(a:Int=5,b:Int=7): Int ={
    var sum:Int=0
    sum=a+b
    return sum
  }

}
