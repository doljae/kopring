package com.example.kopring.member.entity

import com.example.kopring.member.domain.Gender
import com.example.kopring.member.dto.MemberResponseDto
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    val firstName: String? = null
    val lastName: String? = null

    val age: Int? = null

    val gender: Gender? = null

    fun toResponseDto(): MemberResponseDto = MemberResponseDto(id!!, firstName, lastName, age, gender)
}