package com.test

/**
  * Created by tuze on 2017/8/3.
  */
object OtherTest {
  def main(args: Array[String]): Unit = {

    val x = OtherTest(5)
    println(x)

    x match {
      case OtherTest(num) =>println(x+"是"+num+"的两倍")
      case _ =>println("无法计算")
    }

  }

  def apply(x: Int) = x * 2

  def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None

}
