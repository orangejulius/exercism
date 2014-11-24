class Anagram(input : String) {
  def matches(words : Seq[String]) : Seq[String] = {
    words
      .foldLeft(Seq[String]()){ (matches, word) =>
        if ( word.toLowerCase != input.toLowerCase &&
          normalize(word) == normalize(input) &&
          ! matches.map{ m => m.toLowerCase}.contains(word.toLowerCase)) {
            matches :+ word
          } else {
            matches
          }
    }
  }

  private
  def normalize(input : String) : String = {
    input.toLowerCase.toCharArray.sorted.mkString
  }
}
