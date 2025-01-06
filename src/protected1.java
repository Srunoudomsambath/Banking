import lombok.*;

import javax.management.ConstructorParameters;
import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Sambath{
    private Integer id;
    private String name;
    private String uuid;
    private String email;
    private String password;
    //
    private Boolean isDeleted;
    //
//    public void setId(Integer Id){
//        this.id = id;
//    }
//    public Integer getId(){
//        return id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }
//
//    public String getPassword() {
//        return this.password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Boolean getDeleted(boolean b) {
//        return isDeleted;
//    }
//
//    public void setDeleted(Boolean deleted) {
//        isDeleted = deleted;
//    }

}
public class protected1 {
    public static void main(String[] args){
        Sambath sambath = new Sambath();
        sambath.setId(1);
        sambath.setUuid(UUID.randomUUID().toString());
        sambath.setName("koko");
        sambath.setEmail("koko@gmail.com");
        sambath.setPassword("password");
//        sambath.setDeleted(false);
        System.out.println("id"+ sambath.getId());
        System.out.println("UUID" + sambath.getUuid());
        System.out.println("Name : " + sambath.getName());
        System.out.println("Email " + sambath.getEmail());
        System.out.println("Password " + sambath.getPassword());


    }
}
