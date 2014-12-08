class PhoneNumber(input: String) {
  def number() : String = {
    val full_number = input.toCharArray.filter{ c =>
      "1234567890".contains(c)
    }.mkString

    full_number.length match {
      case 10 => full_number
      case 11 => parse_11_digits(full_number)
      case _ => "0000000000"
    }
  }

  def areaCode() : String = {
    number take 3
  }

  override def toString() : String = {
    "(" + areaCode + ") " + number.substring(3, 6) + "-" + number.takeRight(4)
  }

  def parse_11_digits(full_number: String) : String = {
    if (full_number(0) == '1') {
      full_number.takeRight(10)
    } else {
      "0000000000"
    }
  }
}
