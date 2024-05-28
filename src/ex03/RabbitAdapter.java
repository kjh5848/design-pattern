package ex03;

import ex03.Animal;
import ex03.lib.OuterRabbit;

//애니멀에 아우터 래빗을 포함시면 된다.
public class RabbitAdapter extends Animal {

    private final OuterRabbit outerRabbit;

    public RabbitAdapter(OuterRabbit outerRabbit) {
        this.outerRabbit = outerRabbit;
    }

    @Override
    public String getName() {
        return outerRabbit.getFullname();
    }
}
