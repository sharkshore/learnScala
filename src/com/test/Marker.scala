package com.test

/**
  * Created by tuze on 2017/8/3.
  */
class Marker private(val color: String) {
  println("创建" + this)

  override def toString: String = "颜色标记:"+color
}

object Marker{
  private val markers:Map[String,Marker]=Map(
    "red"->new Marker("red"),
    "blue"->new Marker("blue"),
    "green"->new Marker("green")
  )

  def apply(color :String) ={
    if(markers.contains(color))markers(color) else null
  }

  def getMarker(color:String)={
    if(markers.contains(color))markers(color) else null
  }

  def main(args:Array[String]): Unit ={
    println(Marker("red"))
    println(Marker getMarker "blue")
  }



}
