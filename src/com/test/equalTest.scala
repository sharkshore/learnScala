package com.test

/**
  * Created by tuze on 2017/8/3.
  */
object equalTest {
  def main(args: Array[String]): Unit = {

    val p=new Ppoint(2,3)
    val p2=new Ppoint(2,4)
    val p3=new Ppoint(3,3)
    println(p.isNotEqual(p2))
    println(p.isNotEqual(p3))
    println(p.isNotEqual(2))


  }

}

class range{

}

trait Equal{
  def isEqual(x:Any) :Boolean

  def isNotEqual(x:Any):Boolean= !isEqual(x)
}

trait Traint2{
  def begin(x:Int):Int
}

class Ppoint(xc:Int ,yc:Int) extends range with Equal with Traint2{

  var x:Int=xc
  var y:Int=yc

  override def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x

  override def begin(x: Int): Int = ???
}
