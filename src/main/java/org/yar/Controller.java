package org.yar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Controller {
  @GetMapping(path = "create")
  public String create(@RequestParam String name) {
    User user = new User();
    user.setName(name);

    UserService service = new UserService();
    service.saveUser(user);
    return "Entity save to DB.";
  }

  @GetMapping(path = "delete")
  public String delete(@RequestParam long id) {
    UserService service = new UserService();
    service.deleteUser(id);
    return "Entity delete.";
  }

  @GetMapping(path = "find")
  public String find(@RequestParam long id) {
    UserService service = new UserService();
    return service.findUser(id).toString();
  }

  @GetMapping(path = "update")
  public String update(@RequestParam long id, String name) {
    UserService service = new UserService();
    User user = service.findUser(id);
    user.setName(name);
    service.updateUser(user);
    return "Entity update to DB.";
  }
}
