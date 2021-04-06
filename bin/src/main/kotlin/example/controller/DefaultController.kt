package example.controller

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class DefaultController {

  @Throws(Exception::class)
  @MessageMapping("/click")
  @SendTo("/topic/click")
  fun greeting(clicks :example.model.Input) :example.model.Output {
//    if (!clicks.isInit) return example.model.Output(0)

    return example.model.Output( )
  }
}
