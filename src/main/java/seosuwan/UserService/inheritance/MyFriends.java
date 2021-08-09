package seosuwan.UserService.inheritance;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.TableOwner;

public class MyFriends {
    public Friend[] getFriends(){
        Friend[] friends = new Friend[4];
        int count = 0;
        String[] names = {"Lee","Seo","Yoon","Park"};
        String[] majors = {"Computer","Electronics"};
        String[] departments = {"R&D 1","R&D 2"};
        String[] phones = {"010-123","010-234","010-345","010-456"};
        for(int i=0; i< friends.length; i++){
            if(i<2){
                friends[i] = new UnivFriend(names[i],majors[i],phones[i]);
            }else {
                friends[i] = new CompFriend(names[i],departments[i-2],phones[i]);
            }
            friends[i] = (i<2) ? new UnivFriend(names[i],majors[i],phones[i])
                          : new CompFriend(names[i],departments[i-2],phones[i]);
        }
        return friends;
    }

}
@NoArgsConstructor
@Data class Friend{
    protected String name;
    protected String phone;
    public Friend(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

}
final class UnivFriend extends Friend{
    private String major;
    public UnivFriend(String name, String major,String phone) {
        super(name, phone);
        this.major = major;
    }
    @Override public String toString(){
        return String.format("대학친구: %s %s %s",name,major,phone);
    }
}
class CompFriend extends Friend{
    private String department;
    public CompFriend(String name, String department,String phone){
        super(name,phone);
        this.department = department;
    }
    @Override public String toString(){
        return String.format("직장동료: %s %s %s",name,department,phone);
    }

}

