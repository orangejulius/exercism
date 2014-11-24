object Hamming {
  def compute(a : String, b : String) : Int = {
    val min_length = Math.min(a.length, b.length)

    var start_differences = 0
    for(i <- 0 until min_length) {
      if (a(i) != b(i)) {
        start_differences += 1
      }
    }

    return start_differences
  }
}
