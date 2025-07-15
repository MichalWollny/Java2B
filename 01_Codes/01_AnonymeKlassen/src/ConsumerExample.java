// Beispiel für das Java Consumer Interface

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer, der einen String entgegennimmt und ausgibt
        Consumer<String> drucker = text -> System.out.println("Gedruckter Text: " + text);

        drucker.accept("Beispieltext über Consumer Interface");
    }
}