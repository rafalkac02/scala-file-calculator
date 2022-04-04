import org.scalatest._
import flatspec._
import matchers._
import Calculator._

class CalculatorSpec extends AnyFlatSpec with should.Matchers {

  "instructions()" should "return Seq of Strings representing a file" in {

    val path = "C:\\adform-scala-academy-projects\\calculator-scripts\\src\\main\\scala\\scripts.txt"
    instructions(path) shouldBe Seq("# + 4 5", "- 8", "+ 5", "-", "PRINT", "- 7", "PRINT", "PRINT", "/ 2")
  }

  "calculate()" should "return number after running all the calculations" in {

    val lines0 = Seq("// hello ", "// world", "# these", "are", "comments")
    calculate(lines0) shouldBe 0

    val lines1 = Seq("// add 2", "+ 2", "// multiply by 2", "* 2", "# substract 2", "- 2", "# divide by 2", "/ 2")
    calculate(lines1) shouldBe 1

    val lines2 = Seq("+ 10",  "-")
    calculate(lines2) shouldBe -10

    val lines3 = Seq("- 8",  "+ 5", "-", "- 7", "/ 2")
    calculate(lines3) shouldBe -2
  }
}