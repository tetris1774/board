package com.icia.board.dto;

import com.icia.board.entity.MemberEntity;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberBirth;
    private String memberMobile;

    // Constructor that takes a MemberEntity as a parameter
    public MemberDTO(MemberEntity memberEntity) {
        this.id = memberEntity.getId();
        this.memberEmail = memberEntity.getMemberEmail();
        this.memberPassword = memberEntity.getMemberPassword();
        this.memberName = memberEntity.getMemberName();
        this.memberBirth = memberEntity.getMemberBirth();
        this.memberMobile = memberEntity.getMemberMobile();
    }

    // Your existing toDTO method
    public static MemberDTO toDTO(MemberEntity memberEntity) {
        return new MemberDTO(memberEntity);
    }
}
