package com.meiguins.usuario.infraestructure.repository;


import com.meiguins.usuario.infraestructure.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {
}
