package io.github.USERNAME

import org.scalatest.FlatSpec

class YoSpec extends FlatSpec {

  "A Yo" should "be able to greet someone" in {
    val yo = Yo("Scala coder")
    assert(yo.greet == "Yo, Scala coder")
  }

  it should "refuse to greet an empty name" in {
    try {
      val yo = Yo("")
      println(yo.greet)
      fail("Should not have greeted empty string")
    } catch {
      case t: Throwable => {
        val expectedException = "java.lang.Exception: Yo: cannot greet empty string."
        assert(t.toString == expectedException)
      }
    }
  }
}
