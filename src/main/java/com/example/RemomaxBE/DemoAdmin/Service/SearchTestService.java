package com.example.RemomaxBE.DemoAdmin.Service;

import com.example.RemomaxBE.DemoAdmin.Model.SearchTestModel;
import com.example.RemomaxBE.DemoAdmin.Repository.SearchTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

@Service
public class SearchTestService {
    @Autowired
    SearchTestRepository searchTestRepository;

    public Object searchBy(String text) {
        List<String> plusList = new ArrayList<>();
        List<String> minusList = new ArrayList<>();
        List<String> mainList = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.startsWith("+")) {
                plusList.add(token.substring(1));
            } else if (token.startsWith("-")) {
                minusList.add(token.substring(1));
            } else {
                mainList.add(token);
            }
        }

        String sumMain = concatenateArrayToString(mainList);

        System.out.println(minusList);
        System.out.println(plusList);
        System.out.println(mainList);

        if (mainList.size() == 0){
            List<SearchTestModel> searchTestModelList = new ArrayList<>();
            return searchTestModelList;
        }
        else if(plusList.size() == 0 && minusList.size() > 0){
            if(minusList.size() == 1){
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByMinus(sumMain,minusList);
                return searchTestModels;
            }
            else if(minusList.size() == 2){
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByMinus2(sumMain,minus1,minus2);
                return searchTestModels;
            }
            else {
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                String minus3 = minusList.get(2);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByMinus3(sumMain,minus1,minus2,minus3);
                return searchTestModels;}

        }
        else if(plusList.size() > 0 && minusList.size() == 0){
            if(plusList.size() == 1){
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus(sumMain,plusList);
                return searchTestModels;
            }
            else if(plusList.size() == 2){
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus2(sumMain,plus1,plus2);
                return searchTestModels;
            }
            else {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String plus3 = plusList.get(2);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus3(sumMain,plus1,plus2,plus3);
                return searchTestModels;
            }

        }
        else if(plusList.size() > 0 && minusList.size() > 0){
            if(plusList.size() == 1 && minusList.size() == 1) {
                String plus1 = plusList.get(0);
                String minus1 = minusList.get(0);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlusAndMinus(sumMain, plus1, minus1);
                return searchTestModels;
            }
            else if(plusList.size() == 1 && minusList.size() == 2) {
                String plus1 = plusList.get(0);
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlusAndMinus2(sumMain, plus1, minus1,minus2);
                return searchTestModels;
            }
            else if(plusList.size() == 1 && minusList.size() == 3) {
                String plus1 = plusList.get(0);
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                String minus3 = minusList.get(2);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlusAndMinus3(sumMain, plus1, minus1,minus2,minus3);
                return searchTestModels;
            }

            else if(plusList.size() == 2 && minusList.size() == 1) {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String minus1 = minusList.get(0);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus2AndMinus1(sumMain, plus1, plus2,minus1);
                return searchTestModels;
            }
            else if(plusList.size() == 2 && minusList.size() == 2) {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus2AndMinus2(sumMain, plus1, plus2,minus1,minus2);
                return searchTestModels;
            }
            else if(plusList.size() == 2 && minusList.size() == 3) {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                String minus3 = minusList.get(2);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus2AndMinus3(sumMain, plus1, plus2,minus1,minus2,minus3);
                return searchTestModels;
            }

            else if(plusList.size() == 3 && minusList.size() == 1) {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String plus3 = plusList.get(2);
                String minus1 = minusList.get(0);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus3AndMinus1(sumMain, plus1, plus2,plus3,minus1);
                return searchTestModels;
            }
            else if(plusList.size() == 3 && minusList.size() == 2) {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String plus3 = plusList.get(2);
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus3AndMinus2(sumMain, plus1, plus2,plus3,minus1,minus2);
                return searchTestModels;
            }
            else {
                String plus1 = plusList.get(0);
                String plus2 = plusList.get(1);
                String plus3 = plusList.get(2);
                String minus1 = minusList.get(0);
                String minus2 = minusList.get(1);
                String minus3 = minusList.get(2);
                List<SearchTestModel> searchTestModels = searchTestRepository.findNameByPlus3AndMinus3(sumMain, plus1, plus2,plus3,minus1,minus2,minus3);
                return searchTestModels;
            }

        }
        else {
            List<SearchTestModel> searchTestModelList = searchTestRepository.findByNameProduct(sumMain);
            return searchTestModelList;
        }

    }

    public static String concatenateArrayToString(List<String> list) {
        StringBuilder result = new StringBuilder();

        for (String element : list) {
            result.append(element).append(" ");
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}
