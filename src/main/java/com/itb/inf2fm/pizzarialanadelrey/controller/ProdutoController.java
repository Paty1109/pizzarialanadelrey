package com.itb.inf2fm.pizzarialanadelrey.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();
}
