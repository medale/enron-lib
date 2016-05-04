package com.databricks.demo.enron

/**
 * Utils for Enron Demo.
 */
object EnronUtils {

  val States = Array("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME",
    "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT",
    "WA", "WI", "WV", "WY")

  /**
   * Map email to a state based on hashCode (demo only).
   */
  def emailToState(email: String): String = {
    val bucketNumber = if (email == null) {
      0
    } else {
      math.abs(email.hashCode) % States.size
    }
    States(bucketNumber)
  }
  
}