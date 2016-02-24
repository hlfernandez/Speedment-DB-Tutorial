package es.uvigo.ei.sing.hlfernandez.hellospeedment;

import java.util.stream.Stream;

import com.speedment.Manager;
import com.speedment.Speedment;

import es.uvigo.ei.sing.hlfernandez.hellospeedment.db0.hellospeedment.user.User;

public class UsersController {

	private Speedment db;
	private Manager<User> users;

	public UsersController(Speedment db) {
		this.db = db;
		this.users = this.db.managerOf(User.class);
	}

	public Stream<User> getUsers() {
		return users.stream();
	}

	public User addUser(String name, int age) {
		return users.newInstance().setName(name).setAge(age).persist();
	}
}
