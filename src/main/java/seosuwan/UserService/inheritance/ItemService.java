package seosuwan.UserService.inheritance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service public class ItemService {
    private final ItemRepository itemRepository;

}
