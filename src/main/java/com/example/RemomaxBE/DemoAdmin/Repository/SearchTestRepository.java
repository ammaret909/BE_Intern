package com.example.RemomaxBE.DemoAdmin.Repository;

import com.example.RemomaxBE.DemoAdmin.Model.SearchTestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchTestRepository extends JpaRepository<SearchTestModel,Integer> {

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:main% AND name LIKE %:plus% AND name NOT LIKE %:minus% ",nativeQuery = true)
    List<SearchTestModel> searchByText(String main,String plus,String minus);

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain%",nativeQuery = true)
    List<SearchTestModel> findByNameProduct(String sumMain);

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:sumMinus%",nativeQuery = true)
    List<SearchTestModel> findNameByMinus(String sumMain,List<String> sumMinus);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2%",nativeQuery = true)
    List<SearchTestModel> findNameByMinus2(String sumMain, String minus1, String minus2);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name NOT LIKE %:minus3%",nativeQuery = true)
    List<SearchTestModel> findNameByMinus3(String sumMain, String minus1, String minus2, String minus3);

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name LIKE %:plusList%",nativeQuery = true)
    List<SearchTestModel> findNameByPlus(String sumMain, List<String> plusList);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name LIKE %:plus1% OR name LIKE %:plus2%",nativeQuery = true)
    List<SearchTestModel> findNameByPlus2(String sumMain, String plus1, String plus2);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name LIKE %:plus1% OR name LIKE %:plus2% OR name LIKE %:plus3%",nativeQuery = true)
    List<SearchTestModel> findNameByPlus3(String sumMain, String plus1, String plus2, String plus3);

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name LIKE %:plus1% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlusAndMinus(String sumMain,String plus1,String minus1);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name LIKE %:plus1% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlusAndMinus2(String sumMain, String plus1, String minus1, String minus2);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name NOT LIKE %:minus3% AND name LIKE %:plus1% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlusAndMinus3(String sumMain, String plus1, String minus1, String minus2, String minus3);

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name LIKE %:plus1% OR name LIKE %:plus2% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlus2AndMinus1(String sumMain, String plus1, String plus2, String minus1);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name LIKE %:plus1% OR name LIKE %:plus2% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlus2AndMinus2(String sumMain, String plus1, String plus2, String minus1, String minus2);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name NOT LIKE %:minus3% AND name LIKE %:plus1% OR name LIKE %:plus2% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlus2AndMinus3(String sumMain, String plus1, String plus2, String minus1, String minus2, String minus3);

    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name LIKE %:plus1% OR name LIKE %:plus2% OR name LIKE %:plus3% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlus3AndMinus1(String sumMain, String plus1, String plus2, String plus3, String minus1);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name LIKE %:plus1% OR name LIKE %:plus2% OR name LIKE %:plus3% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlus3AndMinus2(String sumMain, String plus1, String plus2, String plus3, String minus1, String minus2);
    @Query(value = "SELECT * FROM product_test WHERE name LIKE %:sumMain% AND name NOT LIKE %:minus1% AND name NOT LIKE %:minus2% AND name NOT LIKE %:minus3% AND name LIKE %:plus1% OR name LIKE %:plus2% OR name LIKE %:plus3% " ,nativeQuery = true)
    List<SearchTestModel> findNameByPlus3AndMinus3(String sumMain, String plus1, String plus2, String plus3, String minus1, String minus2, String minus3);
}
