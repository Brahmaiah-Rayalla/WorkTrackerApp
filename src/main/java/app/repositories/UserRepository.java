package app.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.models.User;

/**
 * Spring data repository class for all the CRUD operations
 * 
 * @author RAYALLB
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findOneByUserName(String name);

	User findOneByEmail(String email);

	User findOneByUserNameOrEmail(String username, String email);

	User findOneByToken(String token);

	Iterable<User> findAllByGroupName(String groupName);

	@Modifying
	@Transactional
	@Query("update User u set u.email = :email, u.groupName = :groupName, u.firstName = :firstName, "
			+ "u.lastName = :lastName, u.address = :address, u.companyName = :companyName "
			+ "where u.userName = :userName")
	int updateUser(@Param("userName") String userName, @Param("email") String email,
			@Param("groupName") String groupName, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("address") String address,
			@Param("companyName") String companyName);

	@Modifying
	@Transactional
	@Query("update User u set u.lastLogin = CURRENT_TIMESTAMP where u.userName = ?1")
	int updateLastLogin(String userName);

	@Modifying
	@Transactional
	@Query("update User u set u.profilePicture = ?2 where u.userName = ?1")
	int updateProfilePicture(String userName, String profilePicture);
}