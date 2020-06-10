package States;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class StateManeger {

    private Stack<State> states;
//States (durumlar), menü icin oluşturuldu.Menüler arası geçiş ve menünün oyun ile bağlantısı için stackler kullanıldı

    public StateManeger(){

        states =new Stack<State>();
    }

    public void render(SpriteBatch sb){

        states.peek().render(sb);
    }

    public void update(float delta)
    {
        states.peek().update(delta);
        states.peek().handleInput();
    }

    public void pushState(State state){

        states.push(state);
    }
    public void popState(){

        states.pop();
    }
}
