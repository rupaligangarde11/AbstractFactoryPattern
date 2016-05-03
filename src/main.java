public class Main {

    public static void main(String[] args) {

        boolean macWindow = true;
        GUIBuilder guiBuilder = new GUIBuilder();
        if (macWindow) {
            guiBuilder.buildWindow(new MacWindowFactory());
        }
        else
            guiBuilder.buildWindow(new MSWindowFactory());

    }
}
