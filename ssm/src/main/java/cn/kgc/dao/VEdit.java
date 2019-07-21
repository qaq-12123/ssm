package cn.kgc.dao;

import cn.kgc.domain.FBphone;
import cn.kgc.domain.Member;
import cn.kgc.domain.Phone;
import cn.kgc.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 *  电话更改/充值金额
 *
 *
 *  */
public interface VEdit {

    /**
     *
     * @param phone    更改会员手机号操作
     * @return
     */
    @Update("update member set phone=#{phone} where phone=#{phone}")
    public int editphone(String phone);

    /**
     *      查询单个会员
     * @param   mname
     * @param  phone
     * @return
     */
    @Select("select * member where mname=#{mmname} and phone=#{phone}")
    public int findOneMember(String mname, String phone);
    /**
     *
     * @param //   会员充值操作
     * @return
     */
    @Update("update user set balance=#{balance} where username=#{username}")
    public Integer balanceedit(Float balabce, String username);

    @Update("update user set pjmoney=#{pjmoney} where phone=#{phone}")
    public Integer update(User user);

    /**
     *
     * @param member  插入用户操作
     * @return
     */
    @Insert("insert into member values(null,#{mname},#{mgrender},#{phone},#{card}," +
            "#{email},#{creatcliptime},#{address},#{endcliptime},#{uid},#{vid},#{oid})")
    public int insertV(Member member);
    /**
     * 会员表查询全部
     * @return
     */
    @Select("select * from member")
    List<Member> findAll();

    @Select("select * from user")
    List<User> findUser();

    @Select("select * from user where username=#{username}")
    public User findAlluser(String username );

    /**
     * 根据手机号查询用户信息
     * @param phone phone 手机号
     * */
    @Select("select username,email,integral,pjmoney,identity from `user` where phone=#{phone}")
    public User findByphone(String phone);

    @Select("select operation, returntime,rentStyle,orderStatue,quality from `order` left join vehicle on vid=vehicle.id where uid=(select id from user where phone=#{phone})")
    public List<FBphone> findAllByPhone(String phone);





    @Update("update user set phone=#{n_phone} where phone=#{phone}")
    public Integer updatePhone(Phone phone);

}
