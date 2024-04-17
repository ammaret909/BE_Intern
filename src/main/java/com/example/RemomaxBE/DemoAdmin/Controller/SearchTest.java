package com.example.RemomaxBE.DemoAdmin.Controller;

import com.example.RemomaxBE.DemoAdmin.DTO.LoginDTO;
import com.example.RemomaxBE.DemoAdmin.Model.SearchTestModel;
import com.example.RemomaxBE.DemoAdmin.Service.AdminLoginService;
import com.example.RemomaxBE.DemoAdmin.Service.SearchTestService;
import com.example.RemomaxBE.Model.MassageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SearchTest {
    @Autowired
    SearchTestService searchTestService;

    @GetMapping("/search/test/{text}")
    public Object searchBy(@PathVariable String text) {
        return searchTestService.searchBy(text);
    }

}
