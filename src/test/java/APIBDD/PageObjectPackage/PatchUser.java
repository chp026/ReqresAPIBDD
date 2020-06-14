package APIBDD.PageObjectPackage;

public class PatchUser {
    public String patchUer(){
        String payload = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        return payload;
    }
    public String PatchResource(){
        String Resource = "/api/users/2";
        return Resource;
    }
}
