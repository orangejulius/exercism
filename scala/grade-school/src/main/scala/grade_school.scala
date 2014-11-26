class School {
  val db = scala.collection.mutable.Map[Int, Seq[String]]()
  def add(name : String, grade : Int) = {
    db(grade) = db.getOrElse(grade,Seq()) ++ Seq(name)
  }

  def grade(grade : Int) : Seq[String] = {
    db.getOrElse(grade, Seq())
  }

  def sorted() : Map[Int, Seq[String]] = {
    db.map{ case (i : Int, l : Seq[String]) =>
      (i, l.sorted)}.toSeq.sortBy(_._1).toMap
  }
}
