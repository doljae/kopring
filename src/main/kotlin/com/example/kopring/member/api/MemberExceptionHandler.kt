package com.example.kopring.member.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice(assignableTypes = [MemberController::class])
class MemberExceptionHandler {

    @ExceptionHandler(RuntimeException::class)
    fun handleGlobalRuntimeException() = ResponseEntity.ok().body(null)
}