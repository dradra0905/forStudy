package com.forStudy.OnlineShopping.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false,nullable = false)
    @Comment("생성날짜")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    @Comment("수정날짜")
    private LocalDateTime updatedAt;
}
