package variant5.decoraters;

import variant5.AbstractElement;

public abstract class AbstractDecorator extends AbstractElement {
    AbstractElement abstractElement;

    public AbstractDecorator(AbstractElement abstractElement) {
        this.abstractElement = abstractElement;
    }
}
