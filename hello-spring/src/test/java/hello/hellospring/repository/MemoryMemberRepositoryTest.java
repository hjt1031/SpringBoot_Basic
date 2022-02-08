package hello.hellospring.repository;

import hello.hellospring.domain.Member;
<<<<<<< HEAD
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }
=======
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

>>>>>>> origin/master
    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
<<<<<<< HEAD

        repository.save(member);

        repository.findById(member.getId());

        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(member).isEqualTo(result);

=======
        // ID셋팅
        repository.save(member);
        // 메모리에서 get
        Member result = repository.findById(member.getId()).get();

        Assertions.assertEquals(result,member);
>>>>>>> origin/master
    }
}
