package com.example.Plantschedule.member;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    Member postDtoToMember(Dto.PostDto postDto);
    Member patchDtoToMember(Dto.PatchDto patchDto);
    Dto.ResponseDto MemberToResponseDto(Member member);
}
