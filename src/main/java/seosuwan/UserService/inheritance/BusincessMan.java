package seosuwan.UserService.inheritance;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
class Man {
    private String name;

}
@Data
class BusinessMan extends Man{
    private final String company;
    private final String position;

}
