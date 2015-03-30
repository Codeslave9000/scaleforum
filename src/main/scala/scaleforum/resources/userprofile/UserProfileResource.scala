package scaleforum.resources.userprofile

import java.util.UUID

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.http.MediaType
import org.springframework.transaction.annotation.{Transactional, EnableTransactionManagement}
import org.springframework.web.bind.annotation.{RequestMethod, RequestMapping, RestController}
import scala.collection.JavaConversions._

/**
 * Created by ccebelenski on 3/20/2015.
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
@RestController
@RequestMapping(Array("/user/"))
@EnableTransactionManagement
class UserProfileResource {

  @Autowired
  var respository: UserProfileRepository = _


  @RequestMapping(value = Array("/test"), method = Array(RequestMethod.GET), produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @Transactional
  def getAll: java.util.Map[String, Object] = {

    val model = new java.util.HashMap[String, Object]
    val x = respository.findAll()
    x.iterator().toList.size.toString

    model.put("id", UUID.randomUUID().toString)
    model.put("content", "Hello World")

    model
  }
}
