package com.ada.projeto.dto.response;

import com.ada.projeto.ENUM.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private Long id;
    private String nome;
    private double preco;
    private String descricao;
    private Category categoria;
}
