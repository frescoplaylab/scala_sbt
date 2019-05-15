import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {
  test("AddCalculator.add") {
    assert(Calculator.add(3,4) === 7)
  }
  test("SubCalculator.sub") {
    assert(Calculator.sub(1,-1) === 2)
  }
  test("MulCalculator.mul") {
    assert(Calculator.mul(1,100) === 100)
  }
  test("DivCalculator.div") {
    assert(Calculator.div(5,2) === 2)
  }
  test("SquareCalculator.square") {
    assert(Calculator.square(5) === 25)
  }
  test("CubeCalculator.cube") {
    assert(Calculator.cube(5) === 125)
  }
}