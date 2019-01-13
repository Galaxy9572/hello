package org.ljy.hello.rest.common

import org.ljy.hello.rest.domain.RestResult
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{ControllerAdvice, ExceptionHandler, RestController}
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite

@RestController
@ControllerAdvice
class GlobalExceptionHandler extends HandlerExceptionResolverComposite {

    @ExceptionHandler(value = Array(classOf[Exception]))
    def exceptionHandler(e: Exception): ResponseEntity[RestResult] = {
        val restResult = RestResult.failed(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error")
        new ResponseEntity[RestResult](restResult, HttpStatus.INTERNAL_SERVER_ERROR)
    }

}
