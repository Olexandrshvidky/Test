package variant5.decoraters;

import variant5.AbstractElement;

public class BlueDecorator extends AbstractColorDecorator{
    public BlueDecorator(AbstractElement abstractElement) {
        super(abstractElement);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("===BLUE===");
        abstractElement.show();
        System.out.println("===BLUE===");
    }
}
