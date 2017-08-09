package com.test

/**
  * Created by tuze on 2017/8/3.
  */
object ApplyTest {
  def main(args: Array[String]): Unit = {
    println("Apply 方法 : " + apply("Zara", "gmail.com"));
    println("Unapply 方法 : " + unapply("Zara@gmail.com"));
    println("Unapply 方法 : " + unapply("Zara Ali"));

  }

  def apply(user: String, domain: String)  = {
    user + "@" + domain
  }

  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else {
      None
    }
  }


}
