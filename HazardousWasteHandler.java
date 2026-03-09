public class HazardousWasteHandler extends WasteHandler {

    @Override
    public void handleWaste(WasteContainer container) {
        if (container.type.equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous waste handled with special disposal.");
        } else if (nextHandler != null) {
            nextHandler.handleWaste(container);
        }
    }
}





