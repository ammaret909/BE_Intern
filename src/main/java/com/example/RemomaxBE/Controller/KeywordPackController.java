package com.example.RemomaxBE.Controller;

import com.example.RemomaxBE.DTO.SearchDTO;
import com.example.RemomaxBE.DTOout.RedirectPageDTOout;
import com.example.RemomaxBE.Model.KeywordPackModel;
import com.example.RemomaxBE.Model.MassageModel;
import com.example.RemomaxBE.Service.KeywordPackService;
import com.example.RemomaxBE.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class KeywordPackController {
    @Autowired
    KeywordPackService keywordPackService;

    @PostMapping("/pack/{keyword}/{rcc}")
    public KeywordPackModel packKeyword(@PathVariable("keyword") String keyword,@PathVariable("rcc") String rcc) {
        return keywordPackService.packKeyword(keyword,rcc);
    }

    @PostMapping("/pack/massage")
    public String packMassageToStringTest(@RequestBody SearchDTO searchDTO) {
        return keywordPackService.packMessageToStringTest(searchDTO.getSearch());
    }
}
