package com.example.kopring.member.api

import com.example.kopring.configuration.web.V1Api
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class MemberController : V1Api {

    @GetMapping("/member/test")
    fun test(): String = "MemberController, it works"
}