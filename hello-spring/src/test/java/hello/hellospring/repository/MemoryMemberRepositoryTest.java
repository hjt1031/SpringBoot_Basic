package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
        // ID셋팅
        repository.save(member);
        // 메모리에서 get
        Member result = repository.findById(member.getId()).get();

        Assertions.assertEquals(result,member);
    }
}
