package org.ass.guvi.service;

import org.ass.guvi.dto.LoginDto;
import org.ass.guvi.entity.ProfileEntity;
import org.ass.guvi.entity.SignupEntity;

public interface RigisterService {
	public void signUserInfo(SignupEntity signupEntity);
	public void profileUserInfo( ProfileEntity profileEntity );
	public void login(String email ,String password);
}
