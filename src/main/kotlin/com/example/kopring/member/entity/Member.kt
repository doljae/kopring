package com.example.kopring.member.entity

import com.example.kopring.member.domain.Gender
import com.example.kopring.member.dto.MemberResponseDto
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.OffsetDateTime
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    val firstName: String? = null
    val lastName: String? = null

    val age: Int? = null

    @Enumerated(EnumType.STRING)
    val gender: Gender? = null

    @CreatedDate
    var createdAt: OffsetDateTime? = null

    @LastModifiedDate
    var updatedAt: OffsetDateTime? = null

    fun toResponseDto(): MemberResponseDto = MemberResponseDto(id!!, firstName, lastName, age, gender)
}