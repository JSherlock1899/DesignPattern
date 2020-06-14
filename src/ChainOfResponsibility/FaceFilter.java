package ChainOfResponsibility;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/10 21:56
 */
public class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace(":)", "(:");
        msg.setMsg(r);
        return true;
    }
}
