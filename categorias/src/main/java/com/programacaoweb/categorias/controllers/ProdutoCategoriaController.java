package com.programacaoweb.categorias.controllers;

import com.programacaoweb.categorias.models.ProductCategory;
import com.programacaoweb.categorias.models.Produto;
import com.programacaoweb.categorias.services.ProdutoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/product-categories")
public class ProdutoCategoriaController {

    private final ProdutoService produtoService;

    public ProdutoCategoriaController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @ApiOperation(value = "Obter todos os produtos com suas categorias")
    @GetMapping
    public List<ProductCategory> getAllProductCategories() {
        List<Produto> produtos = produtoService.getAllProdutos();
        return produtos.stream().map(produto -> {
            ProductCategory dto = new ProductCategory();
            dto.setProductId(produto.getId());
            dto.setProductName(produto.getName());
            dto.setProductDescription(produto.getDescription());
            dto.setCategoryName(produto.getCategoria().getType());
            return dto;
        }).collect(Collectors.toList());
    }
}
