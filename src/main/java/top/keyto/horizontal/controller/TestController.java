package top.keyto.horizontal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
public class TestController {

  /**
   * 测试服务联通
   *
   * @return String "Pong"
   */
  @GetMapping("/ping")
  public String ping() {
    log.debug("[GET] /ping");
    return "Pong";
  }

  /**
   * 获取访问者IP
   *
   * @param request 注入HttpServletRequest参数
   * @return 访问者IP
   */
  @GetMapping("/clientIP")
  public Map clientIP(HttpServletRequest request) {
    log.debug("[GET] /clientIP");
    String remoteAddr = request.getRemoteAddr();
    return Map.of("data", remoteAddr);
  }
}
