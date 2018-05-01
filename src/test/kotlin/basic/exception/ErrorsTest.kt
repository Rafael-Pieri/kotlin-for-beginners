package basic.exception

import org.junit.Test

class ErrorsTest {

    @Test(expected = ErrorsException::class)
    fun shouldThrowCustomException() {
        throwCustomException("a8h5g")
    }

    @Test(expected = ErrorsException::class)
    fun shouldRunFinallyPart() {
        runFinallyPart("1")
    }
}