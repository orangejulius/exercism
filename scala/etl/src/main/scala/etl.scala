object ETL {
  def transform(old: Map[Int, Seq[String]]): Map[String, Int] = {
    old.foldLeft(Map[String, Int]()) { case (accu_map, (key, sublist)) =>
      accu_map ++ sublist.map(_.toLowerCase).map( word => (word, key)).toMap
    }
  }
}
