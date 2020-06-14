package APIBDD.PageObjectPackage;

public class GetUsers {
    public String GetBaseUri(){
        String baseuri = "https://reqres.in/";
        return baseuri;
    }
    public String GetResource() {
        String Rescource = "/api/users?page=2";
        return Rescource;
    }
}
