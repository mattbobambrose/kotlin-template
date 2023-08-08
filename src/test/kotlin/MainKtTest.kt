import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class MainKtTest : FunSpec({
    test("1 + 1 = 2") {
        1 + 1 shouldBe 2
    }

    test("1 + 1 != 3") {
        1 + 1 shouldNotBe 3
    }

    test("Test test") {
        Test().isWorking() shouldBe true
    }
})

class StringTest : StringSpec({
    "strings.length should return size of string" {
        "hello".length shouldBe 5
    }
})