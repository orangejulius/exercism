class DNA(input: String) {
  input.foreach { c => checkLetter(c) }

  def count(symbol: Char) = {
    checkLetter(symbol)
    input.filter{ c =>
      c == symbol
    }.length
  }

  def nucleotideCounts():Map[Char, Int] = {
    List('A', 'T', 'C', 'G').foldLeft(Map[Char, Int]()) { (map, char) =>
      map + (char -> count(char))
    }
  }

  private
  def checkLetter(c : Char) {
    if (!"ATCG".contains(c)) {
      throw new IllegalArgumentException
    }
  }

}
