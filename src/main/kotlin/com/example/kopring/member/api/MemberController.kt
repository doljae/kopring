package com.example.kopring.member.api

import com.example.kopring.configuration.web.V1Api
import com.example.kopring.member.dto.MemberRequestDto
import com.example.kopring.member.dto.MemberResponseDto
import com.example.kopring.member.service.MemberService
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class MemberController(val memberService: MemberService) : V1Api {

    @GetMapping("/member/test")
    fun test(): String = "MemberController, it works"

    @GetMapping("/member")
    fun getMember(@RequestBody requestBody: MemberRequestDto): ResponseEntity<MemberResponseDto> =
            ResponseEntity.ok().body(memberService.getMember(requestBody))

}