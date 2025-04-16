package example

class HelloSuiteTest extends munit.FunSuite {
  test("numbers") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }
}
