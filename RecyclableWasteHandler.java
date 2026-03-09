public class RecyclableWasteHandler extends WasteHandler {

    @Override
    public void handleWaste(WasteContainer container) {
        if (container.type.equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable waste collected and sent for recycling.");
        } else if (nextHandler != null) {
            nextHandler.handleWaste(container);
        }
    }
}