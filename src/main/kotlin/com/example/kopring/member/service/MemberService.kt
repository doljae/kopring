package com.example.kopring.member.service

import com.example.kopring.member.dto.MemberResponseDto
import com.example.kopring.member.repository.MemberRepositoryDecorator
import org.springframework.stereotype.Service

@Service
class MemberService(val memberRepository: MemberRepositoryDecorator) {

    fun getMember(memberId: Long): MemberResponseDto = memberRepository.findById(memberId).toResponseDto()
}