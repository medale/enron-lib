package com.databricks.demo.enron

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class EnronUtilsSpec extends FlatSpec with Matchers {

  "emailToState for null" should "return bucket 0 = AK for state" in {
    EnronUtils.emailToState(null) should be("AK")
  }

  "emailToState for jeff@enron.com with negative hashCode" should "return NJ" in {
    val email = "jeff@enron.com"
    EnronUtils.emailToState(email) should be("NJ")
  }

  "emailToState for me@you.com with positive hashCode" should "return TX" in {
    val email = "me@you.com"
    EnronUtils.emailToState(email) should be("TX")
  }
}