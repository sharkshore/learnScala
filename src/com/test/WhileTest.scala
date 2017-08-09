package com.test

/**
  * Created by tuze on 2017/8/4.
  */
object WhileTest {

  def main(args: Array[String]): Unit = {

    //局部变量
    var a = 10
    do {
      println("Value of a:" + a);
      a = a + 1;
    } while (a < 20)

  }

}
