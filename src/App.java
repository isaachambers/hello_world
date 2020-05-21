import com.demo.model.*;

public class App {

    // Interoperability with Java
    public static void main(String[] args) {
        FunctionsUtility fn = new FunctionsUtility();
        fn.display();
        fn.display("Message", 4);
        fn.display("Message");
    }
}
