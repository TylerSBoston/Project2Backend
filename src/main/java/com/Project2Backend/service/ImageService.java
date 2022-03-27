package com.Project2Backend.service;


import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
	private final static Logger log = LogManager.getLogger(ImageService.class);

    public void save(MultipartFile file) throws IOException {
    	log.info("in save");
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        imageEntity.setContentType(file.getContentType());
        imageEntity.setImageByte(file.getBytes());
        imageEntity.setSize(file.getSize());
        imageDao.save(imageEntity);
    }

    public Optional<ImageEntity> getImage(int id) {
    	log.info("in getImage");
        return imageDao.findById(id);
    }
    
    public Optional<ImageEntity> getImagebyReimbursementId(int id) {
    	log.info("in getImageByReimbursement(defunct)");
        return imageDao.findById(id);
    }


    public List<ImageEntity> getAllFiles() {
    	log.info("in get all files");
        return imageDao.findAll();
    }
}