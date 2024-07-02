package com.programacaoweb.categorias.controllers;

import com.programacaoweb.categorias.models.Produto;
import com.programacaoweb.categorias.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService ProdutoService;

    @GetMapping
    public List<Produto> findAll() {
        return ProdutoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> findById(@PathVariable Long id) {
        return ProdutoService.findById(id);
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        return ProdutoService.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        ProdutoService.deleteById(id);
    }
}
