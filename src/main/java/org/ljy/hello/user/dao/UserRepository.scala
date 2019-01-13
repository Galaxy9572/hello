package org.ljy.hello.user.dao

import org.ljy.hello.user.domain.entity.UserDO
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends CrudRepository[UserDO, Int] {

}
