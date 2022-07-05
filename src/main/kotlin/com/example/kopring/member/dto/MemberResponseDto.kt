package com.example.kopring.member.dto

import com.example.kopring.member.domain.Gender

data class MemberResponseDto(
    val memberId: Long?,
    val firstName: String?,
    val lastName: String?,
    val age: Int?,
    val gender: Gender?
) {}
