package shop.mtcoding.blog.board;


import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(BoardRepository.class)
@DataJpaTest
public class BoardRepositoryTest {
    @Autowired
    private EntityManager em;
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void findAll_test(){
        // given

        // when
        List<Board> boardList = boardRepository.findAll();
        // then

    }


    @Test
    public void findById_test(){
        // given
        int id = 1;
        // when
        boardRepository.findById(id);
        // then

    }

    @Test
    public void findAll_lazyloading_test () {
        //given
        List<Board> boardList = boardRepository.findAll();
        boardList.forEach(board -> {
            System.out.println(board.getUser().getUsername()); // lazyloading
        });
        //when
        //then
    }
}
