package Functions.HaveNoSideEffects.UserValidator;

public class UserGateway {
    public static User findByName(String userName)
    {
        return new User();
    }
}
