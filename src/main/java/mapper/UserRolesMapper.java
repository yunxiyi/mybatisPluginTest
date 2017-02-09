package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.UserRoles;
import pojo.UserRolesExample;

public interface UserRolesMapper {
    int countByExample(UserRolesExample example);

    int deleteByExample(UserRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoles record);

    int insertSelective(UserRoles record);

    List<UserRoles> selectByExample(UserRolesExample example);

    UserRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRoles record, @Param("example") UserRolesExample example);

    int updateByExample(@Param("record") UserRoles record, @Param("example") UserRolesExample example);

    int updateByPrimaryKeySelective(UserRoles record);

    int updateByPrimaryKey(UserRoles record);
}