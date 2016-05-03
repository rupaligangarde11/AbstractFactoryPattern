class MacWindowFactory implements AbstractWidgetFactory {
    public Window createWindow() {
        return new MacWindow();
    }
}
