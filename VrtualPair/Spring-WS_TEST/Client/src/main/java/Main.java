import ua.mega.urm.GetUserByIdRequest;
import ua.mega.urm.GetUserByIdResponse;
import ua.mega.urm.UserService;
import ua.mega.urm.UserServiceService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceService().getUserServiceSoap11();
        GetUserByIdRequest getUserByIdRequest = new GetUserByIdRequest();
        getUserByIdRequest.setId("1");
        GetUserByIdResponse response = service.getUserById(getUserByIdRequest);

        System.out.println(response.getUser().getUserName());
    }
}
