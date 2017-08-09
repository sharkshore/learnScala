package com.test

/**
  * Created by tuze on 2017/8/4.
  */
object NoReturnTest {
  def main(args: Array[String]): Unit = {
    println(noreturn());//结果打印4
    println(noreturn);//结果打印4
  }
  def noreturn()={
    3+3
    3-1
    2+2
  }

}
