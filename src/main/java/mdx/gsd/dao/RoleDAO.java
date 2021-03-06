package mdx.gsd.dao;

import mdx.gsd.data.model.Role;

import java.util.List;

/**
 * Created by universe (E.) on 12/06/17.
 */

public interface RoleDAO {

    void addRole(Role role);

    void updateRole(Role role);

    Role getRoleByID(Integer id);

    List<Role> listAllRole();

    void removeRole(Integer id);

}
