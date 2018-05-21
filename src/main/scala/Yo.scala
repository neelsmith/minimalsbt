package io.github.USERNAME


/** Minimal case class to demonstrate building
* a project with tests and documentation.
*
* @param vocative Person to address in direct form.
*/
case class Yo(vocative: String)  {

  /** Create a greeting String. */
  def greet : String = {
    if (vocative.isEmpty) {
      val msg = "Yo: cannot greet empty string."
      throw new Exception(msg)
    } else {
      "Yo, " + vocative
    }
  }


}
