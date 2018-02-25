package variant5.decoraters;

import variant5.AbstractElement;

public class RedDecorator extends AbstractColorDecorator {
    public RedDecorator(AbstractElement abstractElement) {
        super(abstractElement);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("===RED===");
        abstractElement.show();
        System.out.println("===RED===");
    }
}
