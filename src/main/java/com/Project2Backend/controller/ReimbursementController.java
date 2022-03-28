package com.Project2Backend.controller;


import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.Project2Backend.config.FileUploadUtil;
import com.Project2Backend.entities.ReimbursementEntity;

import com.Project2Backend.exceptions.ReimbursementNotFoundException;
import com.Project2Backend.exceptions.SystemException;
import com.Project2Backend.service.ReimbursementServiceImpl;

@RestController
@RequestMapping("/api")
public class ReimbursementController {
	
	ReimbursementServiceImpl reimbursementServiceImpl;
	
	@Autowired
	public ReimbursementController(ReimbursementServiceImpl reimbursementServiceImpl)
	
	{
		this.reimbursementServiceImpl = reimbursementServiceImpl;
	}
	
	//FETCH ALL REIMBURSEMENTS
		@GetMapping(value = "/reimbursements")
		public List<ReimbursementEntity> getAllReimbursements() {
			return reimbursementServiceImpl.getAllReimbursements();
		
		}
		
		//FIND SINGLE REIMBURSEMENT BY ID
		//ComeBack to
		@GetMapping(value = "/reimbursements/{reimbursementId}")
		public ReimbursementEntity findById(@PathVariable("reimbursementId")   int reimbursementId) {
			
			ReimbursementEntity reimbursementEntity = null;
			try {
				reimbursementEntity = reimbursementServiceImpl.findById(reimbursementId)
						.orElseThrow(()->new ReimbursementNotFoundException("Not Found"+reimbursementId+"Not found"));
			} catch (ReimbursementNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return reimbursementEntity;
			
			
		}
		
		//INSERT NEW REIMBURSEMENT
		@PostMapping(value = "/reimbursements/new")
		public ResponseEntity<ReimbursementEntity> addReimbursement(@Validated @RequestBody ReimbursementEntity reimbursementEntity){
					return ResponseEntity.ok(reimbursementServiceImpl.save(reimbursementEntity));

		}
		

		@PutMapping(value = "/reimbursements/update")
		public ReimbursementEntity updateReimbursement(@RequestBody ReimbursementEntity reimbursementEntity)
			 throws SystemException{
			return reimbursementServiceImpl.save(reimbursementEntity);
		}
		
		@PostMapping("/riembursements/save")
	    public RedirectView saveReimbursement(ReimbursementEntity reimbursementEntity,
	            @RequestParam("image") MultipartFile multipartFile) throws IOException {
        
	        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//	        reimbursementEntity.setReceiptImage(fileName);
         
	        ReimbursementEntity savedReimbursement = reimbursementServiceImpl.save(reimbursementEntity);
	 
	        String uploadDir = "user-photos/" + savedReimbursement.getId();
	 
	        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
	         
       return new RedirectView("/reimbursements", true);
	        
		}
		




















}
		
		
		






















		
//		
//		ReimbursementEntity reim = reimbursementServiceImpl.findById(reimbursementId)
//				.orElseThrow(()-> new SystemException("Reimbursement not found for this id ::"+reimbursementId));
//	
//		reim.setReimbursementId(newReimbursement.getReimbursementId());
//		reim.setEmployeeId(newReimbursement.getEmployeeId());
//		reim.setStatusId(newReimbursement.getStatusId());
//		reim.setStatus(newReimbursement.getStatus());
//		reim.setExpenseType(newReimbursement.getExpenseType());
//		reim.setDateOfTransaction(newReimbursement.getDateOfTransaction());
//		reim.setDateSubmitted(newReimbursement.getDateSubmitted());
//		reim.setAmount(newReimbursement.getAmount());
//		reim.setDetails(newReimbursement.getDetails());
//		reim.setMerchant(newReimbursement.getMerchant());
//		final ReimbursementEntity updatedReim = reimbursementServiceImpl.save(newReimbursement);
//		return ResponseEntity.ok(updatedReim);




