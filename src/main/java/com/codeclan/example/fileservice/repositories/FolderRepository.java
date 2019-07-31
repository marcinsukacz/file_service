package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
