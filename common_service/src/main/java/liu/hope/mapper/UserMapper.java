package liu.hope.mapper;

import liu.hope.entity.User;

/**
 * Authou hope
 */
public interface UserMapper {

    /**
     *
     * @param id
     * @return
     */
    User queryById(Integer id);
}
