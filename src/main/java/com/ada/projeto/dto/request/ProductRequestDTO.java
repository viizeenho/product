package com.ada.projeto.dto.request;

import com.ada.projeto.ENUM.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    private String nome;
    private double preco;
    private String descricao;
    private Category categoria;
}
