package com.meiguins.usuario.api.converter;

import com.meiguins.usuario.api.response.UsuarioResponseDTO;
import com.meiguins.usuario.infraestructure.entity.EnderecoEntity;
import com.meiguins.usuario.infraestructure.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", source = "usuario.id")
    @Mapping(target = "nome", source = "usuario.nome")
    @Mapping(target = "documento", source = "usuario.documento")
    @Mapping(target = "endereco", source = "enderecoEntity")
    UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity usuario, EnderecoEntity enderecoEntity);
}
