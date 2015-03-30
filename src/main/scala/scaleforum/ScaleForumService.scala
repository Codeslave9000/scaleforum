package scaleforum

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.web.bind.annotation.{RestController, RequestMapping}
import scaleforum.resources.userprofile.UserProfileResource

import scala.beans.BeanProperty

/**
 * Created by ccebelenski on 3/19/2015.
 */


object ScaleForumService {
  def main(args: Array[String]) {

    val ctx = SpringApplication.run(classOf[UserProfileResource])
    //System.out.println("Beans provided by Spring Boot:")
    //val beanName = ctx.getBeanDefinitionNames
    //beanName.sortWith(_ <= _).foreach(System.out.println(_))
  }
}

class ScaleForumService {

}