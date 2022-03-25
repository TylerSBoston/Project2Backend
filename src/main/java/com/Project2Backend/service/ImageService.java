package com.Project2Backend.service;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.Project2Backend.dao.ImageDao;
import com.Project2Backend.entities.ImageEntity;



@Service
public class ImageService {
	
	@Autowired
    ImageDao imageDao;

    public void save(MultipartFile file) throws IOException {
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        imageEntity.setContentType(file.getContentType());
        imageEntity.setImage(file.getBytes());
        imageEntity.setSize(file.getSize());
        imageDao.save(imageEntity);
    }

    public Optional<ImageEntity> getImage(int id) {
        return imageDao.findById(id);
    }
    
    public Optional<ImageEntity> getImagebyReimbursementId(int id) {
        return imageDao.findById(id);
    }


    public List<ImageEntity> getAllFiles() {
        return imageDao.findAll();
    }
}