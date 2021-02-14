package designpattern.state;

public interface ModeState {
    public void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("FROM LIGHT TO DARK");

        modeSwitch.setModeState(new ModeStateDark());
    }
}

class ModeStateDark implements ModeState {
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("FROM DARK TO LIGHT");

        modeSwitch.setModeState(new ModeStateLight());
    }
}

