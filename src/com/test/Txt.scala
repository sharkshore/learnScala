package com.test

import java.io._
import scala.io.Source

/**
  * Created by tuze on 2017/8/3.
  */
object Txt {
  def main(args: Array[String]): Unit = {
//    val writer = new PrintWriter(new File("text.txt"))
//    writer.write("hello.scala")
//    writer.close()
    println(read("text.txt"))
  }

  def read(file: String): String = {
    val buf=new StringBuilder
    Source.fromFile(file).foreach(s=>buf.append(s))
    return buf.toString()
  }

}
