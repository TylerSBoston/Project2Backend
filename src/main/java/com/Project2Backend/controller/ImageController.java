package com.Project2Backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Project2Backend.entities.ImageEntity;
import com.Project2Backend.service.ImageService;

@RestController
@CrossOrigin
@RequestMapping("images")
public class ImageController {
	
	@Autowired
	ImageService imageService;
	
    @PostMapping("{id}")
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file, @PathVariable("id") Integer id) {
        try {
        	
            imageService.save(file,id);

            return ResponseEntity.status(HttpStatus.OK)
                                 .body(String.format("File uploaded successfully: %s", file.getOriginalFilename()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(String.format("Could not upload the file: %s!", file.getOriginalFilename()));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Integer id) {
        Optional<ImageEntity> fileEntityOptional = imageService.getImagebyReimbursementId(id);

        if (!fileEntityOptional.isPresent()) {
            return ResponseEntity.notFound()
                                 .build();
        }

        ImageEntity imageEntity = fileEntityOptional.get();
        return ResponseEntity.ok()
                             .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageEntity.getName() + "\"")
                             .contentType(MediaType.valueOf(imageEntity.getContentType()))
                             .body(imageEntity.getImage());
    }
	
	
	

}
