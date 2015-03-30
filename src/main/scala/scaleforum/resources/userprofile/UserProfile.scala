package scaleforum.resources.userprofile

import javax.persistence.{GenerationType, GeneratedValue, Id, Entity}

import org.hibernate.validator.constraints.NotEmpty

import scala.beans.BeanProperty


/**
 * Created by ccebelenski on 3/20/2015.
 */
@Entity
class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id : Long = 0

  @BeanProperty
  @NotEmpty
  var userName :String = _

  @BeanProperty
  @NotEmpty
  var userEmail :String = _

  @BeanProperty
  @NotEmpty
  var userRole: UserProfileRoleEnum = UserProfileRoleEnum.USER
}
