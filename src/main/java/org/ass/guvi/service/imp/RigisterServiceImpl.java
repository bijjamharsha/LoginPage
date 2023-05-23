package org.ass.guvi.service.imp;

import org.ass.guvi.dto.LoginDto;
import org.ass.guvi.entity.ProfileEntity;
import org.ass.guvi.entity.SignupEntity;
import org.ass.guvi.repository.RigisterRepository;
import org.ass.guvi.service.RigisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RigisterServiceImpl implements RigisterService{
	@Autowired
	private RigisterRepository repository;
	@Autowired
	private SignupEntity signupEntity;
	@Override
	public void signUserInfo(SignupEntity signupEntity) {
		repository.save(signupEntity);
		 
	}

	

	@Override
	public void profileUserInfo(ProfileEntity profileEntity) {
		repository.update(profileEntity);
		
		
	}



	@Override
	public void login(String email, String password) {
		repository.login(email, password);
		
	}



	
	

}
