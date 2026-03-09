abstract public class WasteHandler {

    protected WasteHandler nextHandler;

    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleWaste(WasteContainer container);
}


class OrganicWasteHandler extends WasteHandler {

    @Override
    public void handleWaste(WasteContainer container) {
        if (container.type.equalsIgnoreCase("organic")) {
            System.out.println("Organic waste collected and disposed.");
        } else if (nextHandler != null) {
            nextHandler.handleWaste(container);
        }
    }
}