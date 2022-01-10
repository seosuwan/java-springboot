package seosuwan.UserService.inheritance;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//기본형태
@Repository
public interface ItemRepository extends MongoRepository<ItemDto,Long> {
}
