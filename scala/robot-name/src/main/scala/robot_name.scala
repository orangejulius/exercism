import scala.util.Random

class Robot {
  var name = new_name

  def reset() = {
    name = new_name
  }

  private

  def new_name() : String = {
    random_letter + random_letter + "321"
  }

  def random_letter() : String = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    alphabet(Random.nextInt(26)).toString
  }
}
