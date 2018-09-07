package com.miroshnik.repository;

import com.miroshnik.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

    @Query(value = "select t from News t where t.categoryId = :categoryId")
    List<News> findByCategoryId(@Param("categoryId") int categoryId);

}
