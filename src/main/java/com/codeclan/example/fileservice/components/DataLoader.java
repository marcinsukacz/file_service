package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user1 = new User("Marcin");
        userRepository.save(user1);
        User user2 = new User("Tomas");
        userRepository.save(user2);

        Folder folder1 = new Folder("docs", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("data", user2);
        folderRepository.save(folder2);

        File file1 = new File("document", "txt", 20, folder1);
        fileRepository.save(file1);
        File file2 = new File("spreedsheet", "xls", 30, folder2);
        fileRepository.save(file2);




    }
}
