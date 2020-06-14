package APIBDD.PageObjectPackage;

public class PostRegister {
    public String PostRegPayload(){
        String payload = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";
        return payload;
    }
    public String PostRegResource(){
        String Resource = "/api/register";
        return Resource;
    }
}
