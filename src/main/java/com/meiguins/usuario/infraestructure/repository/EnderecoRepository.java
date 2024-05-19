package com.meiguins.usuario.infraestructure.repository;

import com.meiguins.usuario.infraestructure.entity.EnderecoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnderecoRepository extends MongoRepository<EnderecoEntity, String> {
}
