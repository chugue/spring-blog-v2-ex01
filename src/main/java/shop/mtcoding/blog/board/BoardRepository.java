package shop.mtcoding.blog.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class BoardRepository {
    private final EntityManager em;

    public void findAll () {
        Query query = em.createQuery("SELECT b FROM Board b ORDER BY b.id DESC", Board.class);
    }

    @Transactional
    public void save() {

    }


    public Board findById (int id){

        Board board = em.find(Board.class, id);
        return board;
    }

}
