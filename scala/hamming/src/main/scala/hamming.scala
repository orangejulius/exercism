object Hamming {
  def compute(a : String, b : String) : Int = {
    a.zip(b).filter{ case (i:Char, j:Char) =>
        i != j
    }.length
  }
}
