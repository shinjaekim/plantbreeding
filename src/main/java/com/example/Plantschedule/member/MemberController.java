package com.example.Plantschedule.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    MemberService memberService;
    MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postMember(@RequestBody Dto.PostDto postDto){

        Member member = mapper.postDtoToMember(postDto);

        Member response = memberService.createMember(member);

        return new ResponseEntity(mapper.MemberToResponseDto(response), HttpStatus.CREATED);
    }

    @PatchMapping("/{member_id}")
    public ResponseEntity patchMember(@PathVariable("member_id") long memberId,
                                      @RequestBody Dto.PatchDto patchDto){

        Member member = mapper.patchDtoToMember(patchDto);

        Member response = memberService.updateMember(member);

        return new ResponseEntity(mapper.MemberToResponseDto(response), HttpStatus.OK);
    }

    @GetMapping("/{member_id}")
    public ResponseEntity getMember(@PathVariable("member_id") long memberId){

        Member response = memberService.findMember(memberId);

        return new ResponseEntity(mapper.MemberToResponseDto(response), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{member_id}")
    public ResponseEntity deleteMember(@PathVariable("member_id") long memberId){

        memberService.deleteMember(memberId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
