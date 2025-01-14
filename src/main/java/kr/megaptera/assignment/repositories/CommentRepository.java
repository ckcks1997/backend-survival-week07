package kr.megaptera.assignment.repositories;

import kr.megaptera.assignment.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Modifying
    @Query(value = "delete from Comment p where p.id = ?1")
    int deleteByIdCount(Long id);

    List<Comment> findAllByPostComment(Long id);
}
