package com.example.kopring.member.repository

import com.example.kopring.member.entity.Member
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryDecorator(val memberRepository: MemberRepository) {
    fun findById(memberId: Long): Member = memberRepository.findByIdOrNull(memberId) ?: throw RuntimeException()
}
