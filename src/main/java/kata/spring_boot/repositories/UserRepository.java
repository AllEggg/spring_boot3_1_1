package kata.spring_boot.repositories;

import kata.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    List<User> findAll();

    User findUserById(Long id);

    @Modifying
    @Query(nativeQuery = true, value = "delete from users where id =:id")
    void deleteUserById(Long id);
    @Modifying
    @Query(nativeQuery = true, value = "update users set name = :name, age = :age where id = :id")
    void editUser(Long id, String name, int age);
}
