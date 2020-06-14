package APIBDD.PageObjectPackage;

public class PostUser {
    public String PostPayload(){
        String payload = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        return payload;
    }
    public String PostResource(){
        String Resource = "/api/users";
        return Resource;
    }
}
