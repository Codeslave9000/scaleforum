package scaleforum.resources.userprofile

import org.springframework.data.repository.CrudRepository

/**
 * Created by ccebelenski on 3/20/2015.
 */
trait UserProfileRepository extends CrudRepository[UserProfile,java.lang.Long] {

  def findByUserEmail(userEmail: String): List[UserProfile]

  }