package org.ljy.hello.user.service

import java.time.LocalDateTime

import org.ljy.hello.user.dao.UserRepository
import org.ljy.hello.user.domain.entity.UserDO
import org.ljy.hello.user.enums.GenderEnum
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired()(userRepository: UserRepository) {

    def register(nick: String, genderEnum: GenderEnum): Unit = {
        val user = new UserDO
        user.setGender(genderEnum)
        user.setNick(nick)
        user.setCreateDate(LocalDateTime.now())
        userRepository.save(user)
    }

}
