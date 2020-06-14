package ChainOfResponsibility;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/10 21:35
 */
public interface Filter {

    boolean doFilter(Msg msg);
}
