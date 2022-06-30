package com.example.kopring.member.api

import com.example.kopring.configuration.web.V1Api
import com.example.kopring.member.dto.MemberResponseDto
import com.example.kopring.member.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(val memberService: MemberService) : V1Api {

    @GetMapping("/member/test")
    fun test(): String = "MemberController, it works"

    @GetMapping("/member/{id}")
    fun getMember(@PathVariable id: Long): ResponseEntity<MemberResponseDto> =
        ResponseEntity.ok().body(memberService.getMember(id))
}