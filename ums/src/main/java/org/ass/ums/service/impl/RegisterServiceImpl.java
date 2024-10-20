//package org.ass.ums.service.impl;
//
//import java.util.List;
//
//import org.ass.ums.entity.RegisterEntity;
//import org.ass.ums.repository.RegisterRepository;
//import org.ass.ums.service.RegisterService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RegisterServiceImpl implements RegisterService {
//
//	@Autowired
//	private RegisterRepository registerRepository;
//
//	@Override
//	public void processUserInfo(RegisterEntity registerEntity) {
//		registerRepository.saveUser(registerEntity);
//	}
//
//	@Override
//	public List<RegisterEntity> getAllUser() {
//		// TODO Auto-generated method stub
//		return registerRepository.findAllUsers();
//	}
//
//}

package org.ass.ums.service.impl;


import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.repository.RegisterRepository;
import org.ass.ums.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		registerRepository.saveUser(registerEntity);
		// TODO Auto-generated method stub
	}

	@Override
	public List<RegisterEntity> getAllUser() {
		return registerRepository.findAllUsers();
		// TODO Auto-generated method stub
		
	}
}
