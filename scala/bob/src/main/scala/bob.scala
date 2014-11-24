class Bob {
  def hey(input : String) = {
    if (isAllCaps(input)) {
      "Whoa, chill out!"
    } else if(isQuestion(input)) {
      "Sure."
    } else if(isSilence(input)) {
      "Fine. Be that way!"
    } else {
      "Whatever."
    }
  }

  private
  def isAllCaps(input: String) : Boolean = {
    hasLetters(input) &&
    input == input.toUpperCase
  }

  def isQuestion(input: String) : Boolean = {
    input.takeRight(1) == "?"
  }

  def hasLetters(input : String) : Boolean = {
    input.matches(".*[a-zA-Z]+.*")
  }

  def isSilence(input : String) : Boolean = {
    input.matches("\\s*")
  }
}
