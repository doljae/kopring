package com.example.kopring.member.service

import com.example.kopring.member.dto.MemberRequestDto
import com.example.kopring.member.dto.MemberResponseDto
import com.example.kopring.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(val memberRepository: MemberRepository) {

    fun getMember(memberRequestDto: MemberRequestDto): MemberResponseDto? {
        return memberRepository.findById(memberRequestDto.memberId).orElse(null)?.toResponseDto()
    };

}