package org.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.example.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
