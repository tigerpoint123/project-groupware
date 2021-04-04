package com.mju.groupware.service;

import com.mju.groupware.dto.User;

public interface UserService {

	// 회원가입
	public void signUp(User user);

	// 중복확인
	public boolean IdConfirm(User user);

	// 비번 찾기
	public boolean pwdConfirm(User user);

}
