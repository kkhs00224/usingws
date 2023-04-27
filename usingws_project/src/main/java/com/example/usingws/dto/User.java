package com.example.usingws.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.domain.Persistable;

import java.util.Date;

@Data
@Entity
@Table
public class User{
    @Id // primary key
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_pw")
    private String userPw;
    @Column(name = "reg_date", insertable = false, updatable = false)
    private Date regDate;
}
