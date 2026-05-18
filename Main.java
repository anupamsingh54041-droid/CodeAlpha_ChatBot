import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            // Greetings
            if (userInput.contains("hello") ||
              //  userInput.contains("hi") ||
                userInput.contains("hey")) {

                System.out.println("Bot: Hello! Nice to meet you.");
            }

            else if (userInput.contains("good morning")) {

                System.out.println("Bot: Good morning! Have a great day.");
            }

            else if (userInput.contains("good night")) {

                System.out.println("Bot: Good night! Take care.");
            }

            // Personal Questions
            else if (userInput.contains("your name")) {

                System.out.println("Bot: I am Java ChatBot.");
            }

            else if (userInput.contains("who made you")) {

                System.out.println("Bot: Sakshi created me.");
            }
            else if ( userInput.contains("sakshi" ) ){
    System.out.println("Bot:sakshi is a student. \n Persuing bca program toh enhance their skills in technology field. \n She create me vy using different java concept");
}
            else if (userInput.contains("how are you")) {

                System.out.println("Bot: I am doing great. Thanks for asking!");
            }

            // Java / Coding Questions
            else if (userInput.contains("java")) {

                System.out.println("Bot: Java is a powerful programming language.");
            }

            else if (userInput.contains("oop")) {

                System.out.println("Bot: OOP means Object Oriented Programming.");
            }

            else if (userInput.contains("coding")) {

                System.out.println("Bot: Coding means giving instructions to a computer.");
            }

            // Internship Questions
            else if (userInput.contains("internship")) {

                System.out.println("Bot: Internships help improve practical skills.");
            }

            else if (userInput.contains("codealpha")) {

                System.out.println("Bot: CodeAlpha provides amazing internship opportunities.");
            }

            else if (userInput.contains("project")) {

                System.out.println("Bot: Projects help build programming knowledge.");
            }

            // Fun Questions
            else if (userInput.contains("joke")) {

                System.out.println("Bot: Why do programmers hate bugs? Because they bug them!");
            }

            else if (userInput.contains("human")) {

                System.out.println("Bot: No, I am a chatbot.");
            }

            else if (userInput.contains("busy")) {

                System.out.println("Bot: I am always available for chatting.");
            }

            else if (userInput.contains("what are you doing")) {

                System.out.println("Bot: I am talking with you.");
            }

            else if (userInput.contains("like coding")) {

                System.out.println("Bot: Yes! Coding is fun.");
            }

            // Exit
            else if (userInput.contains("bye") ||
                     userInput.contains("exit") ||
                     userInput.contains("goodbye")) {

                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            // Unknown Input
            else {

                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}
