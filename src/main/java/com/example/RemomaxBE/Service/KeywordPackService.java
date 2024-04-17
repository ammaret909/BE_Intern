package com.example.RemomaxBE.Service;

import com.example.RemomaxBE.Model.KeywordPackModel;
import com.example.RemomaxBE.Model.MassageModel;
import com.example.RemomaxBE.Repository.KeywordPackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KeywordPackService {
    @Autowired
    KeywordPackRepository keywordPackRepository;
    @Autowired
    RCCService rccService;

    public KeywordPackModel packKeyword(String keyword, String rcc) {

        return null;
    }

    public KeywordPackModel packKeywordMassageError(MassageModel massageModel,String table) {
        KeywordPackModel keywordPackModel = new KeywordPackModel();
        keywordPackModel.setRcc(rccService.createRcc().getCheck_rcc());
        keywordPackModel.setRccKey(massageModel.getRCC());
        keywordPackModel.setKeyword(packMassageToString(massageModel,table));
        keywordPackModel.setRactive(0);
        keywordPackModel.setRemark("");
        return keywordPackModel;
    }

    public String packMassageToString(MassageModel massageModel,String table){
        String pack = table;
        ArrayList<String> packList = new ArrayList<>(Arrays.asList(massageModel.getRCC(), massageModel.getID(), massageModel.getMassage(), massageModel.getDescription()));

        for(int count = 0;count<packList.stream().count();count++){
            String position = packList.get(count);

            StringBuilder result = new StringBuilder();
            for (char character : position.toCharArray()) {
                int asciiValue = character;

                if ((asciiValue >= 0x0E01 && asciiValue <= 0x0E2E) || (asciiValue >= 97 && asciiValue <= 122) || (asciiValue >= 48 && asciiValue <= 57)) {
                    result.append(character);
                }
            }
            pack = pack + " " + result;
            System.out.println(result);
        }
        return pack;
    }

    public String packMessageToStringTest(String text) {
        String[] words = text.split("\\s+");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        String packKeyWord = null;

        for (String word : wordList) {
            StringBuilder result = new StringBuilder();

            for (char character : word.toCharArray()) {
                int asciiValue = character;

                if ((asciiValue >= 0x0E01 && asciiValue <= 0x0E2E) || (asciiValue >= 97 && asciiValue <= 122) || (asciiValue >= 48 && asciiValue <= 57)) {
                    result.append(character);
                }
            }

            if (packKeyWord == null) {
                packKeyWord = result.toString();
            } else if (!packKeyWord.contains(result)) {
                packKeyWord += result;
            }
        }

        return packKeyWord;
    }
}
