package com.test

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by tuze on 2017/8/3.
  */
object MatchTest {
  def main(args: Array[String]): Unit = {
    /*    println(matchTest(2))
        println(mt("two"))
        println(mt("test"))
        println(mt(1))
        println(mt(6))*/


    try {
      val f = new FileReader("text.txt")
      throw new IOException()
    }catch{
      case e:FileNotFoundException=>{
        println("Missing file exception")
      }
      case ex:IOException=>{
        println("IO Exception")
      }
    }finally {
      println("Exiting finally...")
    }


  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  def mt(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }

}
