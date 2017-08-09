package com.test

import scala.collection.immutable.IndexedSeq

import Array._

/**
  * Created by tuze on 2017/8/1.
  */
object Tes {

  var factor = 55;
  val multiplier = (i: Int) => i * factor;

  def main(args: Array[String]): Unit = {

    println("hello,scala")
    printf("字符串为%s\n", addInt(2, "hello"))
    printf("计算结果为:%d", multiplier(99))
    printMe()

    var greeting: Any = "hello,world";
    greeting = 225;
    greeting = 335
    println(greeting)
  }

  def addInt(a: Int, b: String): String = {
    val sum = a + b
    return sum
  }

  def printMe(): Unit = {
    println("打印自己")
    println(one(90))
    println(two(99))
    println(three(99))
    println(four(9, 9))
    println("特殊计算结果为:" + five(45))
    six(9)
    println(serven(9))
    println(eight(99))
    nine()
    ten()
    eleven()
    println(twelve("hello,world"))
    thirteen()
    fourteen()
    println("-------------------------")
    fiveteen()
    sixteen()

    println("-------------------------")
    seventeen()

    println("---------18----------------")
    eightteen()

    println("--------19-----------------")
    nineteen()
    println("--------20-----------------")
    twenty()
    println("--------21-----------------")
    twnenty_one()
    println("--------22-----------------")
    twenty_two()
    println("--------23-----------------")
    twenty_three()
    println("-------24------------------")
    twenty_four()
    println("-------25------------------")
    twenty_five()
    println("-------26------------------")
    twenty_six()
    println("-------------------------")
  }

  //if语句
  def one(x: Int): Int = {
    if (x < 10) return 10;
    else if (x < 20) return 20;
    else return 30;
  }

  //to循环
  def two(x: Int): String = {
    var msg = ""
    var a = 0
    for (a <- 1 to x) {
      msg = msg + a + ","
    }
    return msg
  }

  //until循环
  def three(x: Int): String = {
    var msg = ""
    var a = 0
    for (a <- 1 until x) {
      msg = msg + a + ","
    }
    return msg
  }

  //four
  def four(x: Int, y: Int): String = {
    var msg = ""
    var a = 0
    var b = 0
    for (a <- 1 to x; b <- 1 until y) {
      msg = msg + "(" + a + "," + b + "),"
    }
    return msg
  }

  //five
  def five(x: Int): Int = {
    var sum = 0
    val list = List(2, 4, 6, 8, 9, 11)
    var a = 0
    var b = 0
    for (a <- 1 to x; b <- list) {
      sum = sum + a * b
    }
    return sum
  }

  //six
  def six(x: Int): Unit = {
    var a = 0
    for (a <- 1 to x; if a != 3) {
      print(a)
    }
    println()
  }

  //serven
  def serven(x: Int): IndexedSeq[Int] = {
    var a = 0
    var list = for {a <- 1 to x; if a != 3; if a * a != 4} yield a
    return list
  }

  //eight
  //Unit相当于Java的void
  def eight(total: Int): Any = {
    println("打印空值")
    return total + "就是这个值"
  }

  //nine
  def nine() = {
    val sb = new StringBuilder
    sb += 'a'
    sb ++= "hello"
    println("buf is" + sb.toString())

  }


  //ten
  def ten() = {
    var str1 = "www.runoob.com"
    var str2 = "学的不仅是技术,更是梦想!!!"
    var str3 = "hello,scala"
    println(str1 + str2)
    println(str2.concat(str3))
    println("字符串长度:" + str1.concat(str3).length)
    println("字符串比较:" + str1.compareTo(str2))
    println("字符串比较:" + str1.equalsIgnoreCase(str2))
    println("hascode:" + str1.hashCode)
    println("判断:" + str1.startsWith("www"))
    var arr = str1.toCharArray
    var a = 0
    for (a <- arr) {
      println("单个字符:" + a)
    }
  }

  //eleven
  def eleven() = {
    var str1 = "www.runoob.com"
    println(str1.indexOf('o'))
  }

  //twelve
  def twelve(str: String): String = {
    return str.substring(2, 8)
  }


  //thirteen
  def thirteen() = {
    var a_arr = new Array[String](3)
    var b_arr = Array("hello", "world", "scala")

    var a = 0
    var c_arr = for {a <- b_arr; if !a.equals("hello")} yield a

    var c = 0
    for (c <- 0 until c_arr.length) {
      a_arr(c) = c_arr(c)
    }
    //打印所有
    var r = 0
    for (r <- a_arr) {
      println(r)
    }
  }

  def fourteen() = {
    var myMatrix = new Array[Int](3)

    //创建矩阵
    for (i <- 0 to 2) {
      myMatrix(i) = 2
    }

    for (k <- myMatrix) {
      println(k)
    }
  }

  def fiveteen() = {
    var a_arr = new Array[Int](3)
    var b_arr = Array[Int](3)

    for (a <- a_arr) {
      println(a)
    }

    for (b <- b_arr) {
      println(b)
    }
  }

  def sixteen() = {
    var arr1 = Array[Any](2, 4, 5, 9)
    var arr2 = Array[Any]("hello", "world", "scala")
    var arr = Array.concat(arr1, arr2)

    for (c <- arr) {
      println(c)
    }
  }

  def seventeen() = {
    var list1 = range(22, 40, 3)
    var list2 = range(9, 15, 5)

    var list3 = concat(list1, list2)
    println(list3.length)
    for (l <- list3) {
      println(l)
    }
  }

  def eightteen() = {
    var matrix = ofDim[Int](3, 3)

    //创建矩阵
    for (a <- 0 to 2) {
      for (b <- 0 to 2) {
        matrix(a)(b) = a + b + a * b
      }
    }
    //打印矩阵
    for (c <- matrix) {
      for (d <- c) {
        println(d)
      }
    }
  }

  def nineteen() = {
    val list = List(1, 2, 3, 4)
    var set = Set(5, 6, 7, 8)
    var map = Map("one" -> 1, "two" -> 2, "three" -> 3)
    var yuan = (10, "Runoob")

    for (a <- list) {
      println(a)
    }

    for (b <- set) {
      println(b)
    }

    for (c <- map) {
      println(c)
    }

    /*    for(d <- yuan) {
          println(d)
        }*/
  }

  //List
  def twenty() = {
    val site: List[String] = List("Runoob", "Google", "Baidu")
    val nums: List[Int] = List(1, 2, 3, 4)
    val empty: List[Nothing] = List()
    val dim: List[List[Int]] = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

    val site2 = "Runoob" :: ("Google" :: Nil)
    val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))

    println("头:" + site.head)
    println("尾:" + site.tail)
    println("是否为空:" + site.isEmpty)
    println("是否为空:" + empty.isEmpty)

    var newsite = site ::: nums

    for (n <- newsite) {
      println(n)
    }
  }


  def twnenty_one()={
    val site =List.fill(3)("hello,world")
    val nums=List.fill(10)(2)
    for(a <- site) {
      print(a +",")
    }
    for(b <- nums) {
      print(b+",")
    }
  }

  def twenty_two()={
    val sec=List.tabulate(6)(n => n*n+1)

    for(a <- sec) {
      println("元素:"+a)
    }
  }

  def twenty_three()={
    val one=List(1)
    val two=List(2,5,6)
    val y=2+:one
    val z= 3 ::y
    println(one)
    println(y)
    println(z)

    val three=one :::two
    println(three)

    val yy=one :+ 3
    println(yy)

    val k=yy.drop(1)
    println(k)

    val kk= yy.dropRight(1)
    println(kk)

    val e=kk.exists(_ == 1)
    println(e)

    val ee=two.filter(p => p%2==0)
    println(ee)

    val eee=two.foreach(f=>{
      println(f)
    })

    val eeee=one.intersect(yy)
    println(eeee)

    println(ee.last)

    val ttt=two.map(t=>t*t+1)
    println(ttt)

    println(ttt.max)
    println(ttt.min)

    println(ttt.mkString)

    println(ttt.reverse)

    var jjj=ttt.sortWith((a,b)=>a%10<b%10)
    println(jjj)

    var jjjj=jjj.toSet[Int]
    println(jjjj)

//    var mmmm=jjj.toMap[Int,Int]
//    println(mmmm)
    var rrr=jjj.takeRight(2)
    println(rrr)

    var mks=ttt.mkString(",")
    println(mks)


    println("迭代器....")
    var iii=ttt.iterator
    while(iii.hasNext){
      println(iii.next())
    }


  }

  def twenty_four()={


    var set=Set(2,8,9,99,11,11)
    println(set.size)

    var t=set +12
    println(t)

    var tt=set-11
    println(tt)
  }


  def twenty_five()={
    var colors = Map("red" -> "#FF0000", "blue" -> "#F0FFFF")
    var colors2=colors+("I"->2)
    println(colors2)
    println(colors2.keys)
    println(colors2.values)

    println(colors2.empty)

    var dtos=Map("name"->"小明","phoneNo"->"134535366")
    var dd=colors++dtos
    println(dd)
    println(dd.mkString)
    println(dd.contains("name"))

    var list=dtos.toList
    println(list)

  }

  def twenty_six()={

    var t=("1","3.14","hello")
    var s=t.productIterator.forall(p=>  p.getClass.equals("java.lang.String"))
    println(s)
    println(t._1,t._2,t._3)
    t.productIterator.foreach(i=>println("value="+i))

  }










}
