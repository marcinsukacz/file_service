package com.codeclan.example.fileservice.projections;

import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
}
