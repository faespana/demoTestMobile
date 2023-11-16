package screens.parts;

import screens.DragScreen;
import screens.FormsScreen;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.SwipeScreen;
import screens.WebviewScreen;

public interface BottomMenuBar {
    public HomeScreen touchHomeButton();

    public WebviewScreen touchWebviewButton();

    public LoginScreen touchLoginButton();

    public FormsScreen touchFormsButton();

    public SwipeScreen touchSwipeButton();

    public DragScreen touchDragButton();
}
