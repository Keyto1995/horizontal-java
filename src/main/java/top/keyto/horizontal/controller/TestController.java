package top.keyto.horizontal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

  /**
   * 获取请求参数: 路径参数
   *
   * @param pathVar 路径参数
   * @return 路径参数
   */
  @GetMapping("/pathVariable/{pathVar}")
  public Map pathVariable(@PathVariable String pathVar) {
    log.debug("[GET] /pathVariable/{}", pathVar);
    return Map.of("data", pathVar);
  }

  /**
   * 获取请求参数: 查询参数
   *
   * @param a 查询参数
   * @return 查询参数
   */
  @GetMapping("/requestParam")
  public Map requestParam(@RequestParam String a, @RequestParam(required = false, defaultValue = "") String[] b) {
    log.debug("[GET] /requestParam?a={}&b={}", a, b);
    return Map.of("a", a, "b", b);
  }

  /**
   * 获取请求参数: 请求体参数
   *
   * @param a 请求体参数
   * @return 请求体参数
   */
  @PostMapping("/requestBody")
  public Map requestBody(@RequestBody Map a) {
    log.debug("[POST] /requestBody {}", a);
    return a;
  }
}
