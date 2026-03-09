public class MainSystem {

    public static void main(String[] args) {

        WasteHandler organicHandler = new OrganicWasteHandler();
        WasteHandler recyclableHandler = new RecyclableWasteHandler();
        WasteHandler hazardousHandler = new HazardousWasteHandler();

        organicHandler.setNextHandler(recyclableHandler);
        recyclableHandler.setNextHandler(hazardousHandler);

        WasteContainer container1 = new WasteContainer("organic", 100, 100);
        WasteContainer container2 = new WasteContainer("recyclable", 80, 80);
        WasteContainer container3 = new WasteContainer("hazardous", 50, 50);

        if (container1.isFull()) {
            organicHandler.handleWaste(container1);
        }

        if (container2.isFull()) {
            organicHandler.handleWaste(container2);
        }

        if (container3.isFull()) {
            organicHandler.handleWaste(container3);
        }
    }
}