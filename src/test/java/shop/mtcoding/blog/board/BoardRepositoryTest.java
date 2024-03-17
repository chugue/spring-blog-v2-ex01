package shop.mtcoding.blog.board;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

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
        Query query = em.createQuery("SELECT b FROM Board b ORDER BY b.id DESC", Board.class);
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
}
