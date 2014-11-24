class Phrase(words : String) {
  def wordCount() : Map[String, Int] = {
    var m:Map[String, Int] = Map()

    filterPunctuation(words)
    .replace(',', ' ')
    .toLowerCase
    .split("\\s+")
    .foreach { word =>
      val newCount = m.getOrElse(word, 0) + 1
      m += (word -> newCount)
    }
    m
  }

  private

  def filterPunctuation(input : String) : String = {
    input.filterNot { ":!&@$%^." contains _ }
  }
}
