package com.example.RemomaxBE.Repository;

import com.example.RemomaxBE.Model.ConvertAspModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConvertAspRepository extends JpaRepository<ConvertAspModel,String> {
    ConvertAspModel findByNamePage(String pageName);

    @Query(value = "SELECT * FROM pages WHERE name_page LIKE %:namePage%",nativeQuery = true)
    List<ConvertAspModel> findAllNamePage(String namePage);
}
