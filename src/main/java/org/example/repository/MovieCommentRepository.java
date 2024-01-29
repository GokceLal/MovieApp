package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.entity.MovieComment;

public interface MovieCommentRepository extends JpaRepository<MovieComment,Long> {
}
