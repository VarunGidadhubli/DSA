package datastructures.code.arrays;

public class UserService {

    public static void checkAge(int age) throws AgeInvalidException {

        if (age < 18) {
            throw new AgeInvalidException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }
}

