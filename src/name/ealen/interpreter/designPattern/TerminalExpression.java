package name.ealen.interpreter.designPattern;

/**
 * Created by EalenXie on 2018/11/14 9:58.
 */
public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
