package com.test

/**
  * Created by tuze on 2017/8/3.
  */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("x的坐标点:" + x)
    println("y的坐标点:" + y)
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val pt = new Point(20, 50)
    pt.move(2, 3)

    val l = new Location(30, 50, 80)
    l.move(2, 3, 5)
  }
}


class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx;
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
    println("z 的坐标点 : " + z);

  }

}


class Person{
  var name=""

  override def toString: String = getClass.getName+"[name="+name+"]"
}

class Employee extends Person{
  var salary=0.0

  override def toString: String = super.toString+"[salary="+salary+"]"
}

object Teo extends App{
  val fred=new Employee
  fred.name="Fred"
  fred.salary=50000
  println(fred)

}













