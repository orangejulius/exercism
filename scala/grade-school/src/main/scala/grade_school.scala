class School {
  var db = Map[Int, Seq[String]]().withDefaultValue(Nil)

  def add(name : String, grade : Int) = {
    db = db + (grade -> (db(grade) :+ name))
  }

  def grade(grade : Int) : Seq[String] = {
    db(grade)
  }

  def sorted() : Map[Int, Seq[String]] = {
    db.map {
      case (i : Int, l : Seq[String]) => (i, l.sorted)}.toSeq.sortBy(_._1).toMap
  }
}
