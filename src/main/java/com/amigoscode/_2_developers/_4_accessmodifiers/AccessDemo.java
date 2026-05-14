package com.amigoscode._2_developers._4_accessmodifiers;

/**
 * Access Modifiers Demo
 *
 * Demonstrates how different access modifiers behave when accessing members
 * from another class in the SAME package. Complete the AccessModifiers class first.
 */
public class AccessDemo {

    public static void main(String[] args) {
        // TODO: 1 - Create an instance of AccessModifiers.
        AccessModifiers am = new AccessModifiers();

        System.out.println("=== Calling Public Method ===");
        // TODO: 2 - Call the publicGreeting() method on your instance and print the result.
        //  This works because public methods are accessible from anywhere.
        System.out.println(am.publicGreeting());

        System.out.println("\n=== Calling Package-Private Method ===");
        // TODO: 3 - Call the packageGreeting() method on your instance and print the result.
        //  This works because AccessDemo is in the SAME package as AccessModifiers.
        System.out.println(am.packageGreeting());

        System.out.println("\n=== Accessing Private Field Through Getter ===");
        // TODO: 4 - Use setSecret() to set a value, then use getSecret() to read it back.
        //  Print the result. This demonstrates proper encapsulation:
        //  we access the private field only through public getter/setter methods.
        am.setSecret("I'm not 18 years old!");
        System.out.println(am.getSecret());

        System.out.println("\n=== Why Direct Private Access Won't Work ===");
        // TODO: 5 - Write a comment explaining why the following line would NOT compile:
        //  // instance.secret = "trying direct access";
        //  Then leave the line commented out, preceded by your explanation.
        //  Hint: think about what 'private' means for field visibility outside the class.

        // Directly setting the value for a private field is not possible because
        // when a field is set private, the visibility of the field is set to be accessible inside where it's declared, which means the class itself.
        // When other classes try to access to a private field of a class, it's not possible.
        // So `private` is like personal information that I - myself - know very clearly but I refuse to share with the other or let others change my information
        // if they just go straight to me and ask me about that info (or try to change that).
        // Instead, I have my own method/way to sharing that information (the getter). So if somebody uses that way to ask me, I'll share that information.
    }
}
