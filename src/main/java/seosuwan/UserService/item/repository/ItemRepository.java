package seosuwan.UserService.item.repository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import seosuwan.UserService.item.entity.Item;

public interface ItemRepository extends ReactiveCrudRepository<Item, String>{


}
