package top.keyto.horizontal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  /**
   * 测试服务联通
   * @return String "Pong"
   */
  @GetMapping("/ping")
  public String ping(){
    return "Pong";
  }
}
