package com.example.RemomaxBE.Repository;

import com.example.RemomaxBE.Model.KeywordPackModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeywordPackRepository extends JpaRepository<KeywordPackModel,String> {
}
