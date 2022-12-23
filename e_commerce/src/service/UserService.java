package service;

import java.util.List;

import entity.User;
import entity.UserLogin;

public interface UserService {

	public boolean createUserRegistration(User user);

	public String loginUser(UserLogin loginUser);

	public List<User> getAllUsers(String token);

	public int makeUserAsAdmin(String token, int userId);

}
