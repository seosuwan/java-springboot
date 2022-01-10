package seosuwan.UserService.inheritance;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import seosuwan.UserService.pesron.Person;

@RequiredArgsConstructor@RestController
public class ItemController {
    private final ItemService itemService;

    public void some(Person p){

    }
}
