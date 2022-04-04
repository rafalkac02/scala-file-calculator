import scala.io.Source._

object Calculator {

  def instructions(path: String): Seq[String] = fromFile(path)
    .getLines
    .toSeq

  def calculate(lines: Seq[String]): Int = lines.foldLeft(0) { (result, l) =>
    val splitted = l.split(" +")

    // get array of numbers from line (or keep it empty if line is a comment)
    val numbers = if (l(0) == '#' || l.startsWith("//")) Array.empty[Int] else splitted.drop(1).map(_.toInt)

    splitted(0).toUpperCase match {
      case "PRINT" =>
        println(result)
        result
      case "+" => result + numbers.sum
      case "-" => if (numbers.isEmpty) -result else result - numbers.sum
      case "*" => result * numbers.product
      case "/" => result / numbers.product
      case _ => result
    }
  }
}
