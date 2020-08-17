package life.majiang.community.test.account;

import java.util.List;

/**
 * TODO
 *
 * @author 程碧泉
 * @history 2020/8/17 程碧泉 新建
 * @since JDK1.7
 */
public interface AccountDao {
    public int insert(Account account);
    public int delete(String cardNo);
    public int update(Account account);
    public Account select(String cardNo);
    public List<Account> selectAll();
}
